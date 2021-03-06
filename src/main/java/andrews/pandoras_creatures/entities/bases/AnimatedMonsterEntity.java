package andrews.pandoras_creatures.entities.bases;

import java.util.Random;
import java.util.function.Predicate;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShootableItem;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public abstract class AnimatedMonsterEntity extends AnimatedCreatureEntity implements IMob
{
	public AnimatedMonsterEntity(EntityType<? extends AnimatedMonsterEntity> type, World worldIn)
	{
		super(type, worldIn);
		this.experienceValue = 5;
	}
	
	@Override
	public SoundCategory getSoundCategory()
	{
		return SoundCategory.HOSTILE;
	}
	
	/**
	    * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	    * use this to react to sunlight and start to burn.
	    */
	@Override
	public void livingTick()
	{
		this.updateArmSwingProgress();
		this.lightBehaviourLogic();
		super.livingTick();
	}

	protected void lightBehaviourLogic()
	{
		float f = this.getBrightness();
		if (f > 0.5F)
		{
			this.idleTime += 2;
		}
	}
	
	@Override
	protected boolean isDespawnPeaceful()
	{
		return true;
	}
	
	@Override
	protected SoundEvent getSwimSound()
	{
		return SoundEvents.ENTITY_HOSTILE_SWIM;
	}
	
	@Override
	protected SoundEvent getSplashSound()
	{
		return SoundEvents.ENTITY_HOSTILE_SPLASH;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return SoundEvents.ENTITY_HOSTILE_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundEvents.ENTITY_HOSTILE_DEATH;
	}
	
	@Override
	protected SoundEvent getFallSound(int heightIn)
	{
		return heightIn > 4 ? SoundEvents.ENTITY_HOSTILE_BIG_FALL : SoundEvents.ENTITY_HOSTILE_SMALL_FALL;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float amount)
	{
		return this.isInvulnerableTo(source) ? false : super.attackEntityFrom(source, amount);
	}
	
	@Override
	public float getBlockPathWeight(BlockPos pos, IWorldReader worldIn)
	{
		return 0.5F - worldIn.getDimension().getLightBrightness(worldIn.getLight(pos));
	}
	
	/**
	 * Static predicate for determining if the current light level and environmental
	 * conditions allow for a monster to spawn.
	 */
	public static boolean isValidLightLevel(IWorld worldIn, BlockPos pos, Random randomIn)
	{
		if(worldIn.getLightFor(LightType.SKY, pos) > randomIn.nextInt(32))
		{
			return false;
		}
		else
		{
			int i = worldIn.getWorld().isThundering() ? worldIn.getNeighborAwareLightSubtracted(pos, 10) : worldIn.getLight(pos);
			return i <= randomIn.nextInt(8);
		}
	}
	
	/**
	 * Static predicate for determining whether or not a monster can spawn at the
	 * provided location, incorporating a check of the current light level at the
	 * location.
	 */
	public static boolean canMonsterSpawnInLight(EntityType<? extends MonsterEntity> type, IWorld worldIn, SpawnReason reason, BlockPos pos, Random randomIn)
	{
		return worldIn.getDifficulty() != Difficulty.PEACEFUL && isValidLightLevel(worldIn, pos, randomIn) && canSpawnOn(type, worldIn, reason, pos, randomIn);
	}

	/**
	 * Static predicate for determining whether or not a monster can spawn at the
	 * provided location.
	 */
	public static boolean canMonsterSpawn(EntityType<? extends MonsterEntity> type, IWorld worldIn, SpawnReason reason, BlockPos pos, Random randomIn)
	{
		return worldIn.getDifficulty() != Difficulty.PEACEFUL && canSpawnOn(type, worldIn, reason, pos, randomIn);
	}
	
	@Override
	protected void registerAttributes()
	{
		super.registerAttributes();
		this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
	}
	
	@Override
	protected boolean canDropLoot()
	{
		return true;
	}

	public boolean isPreventingPlayerRest(PlayerEntity playerIn)
	{
		return true;
	}
	
	@Override
	public ItemStack findAmmo(ItemStack shootable)
	{
		if(shootable.getItem() instanceof ShootableItem)
		{
			Predicate<ItemStack> predicate = ((ShootableItem) shootable.getItem()).getAmmoPredicate();
			ItemStack itemstack = ShootableItem.getHeldAmmo(this, predicate);
			return itemstack.isEmpty() ? new ItemStack(Items.ARROW) : itemstack;
		}
		else
		{
			return ItemStack.EMPTY;
		}
	}
}
