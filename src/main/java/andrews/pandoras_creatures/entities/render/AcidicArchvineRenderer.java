package andrews.pandoras_creatures.entities.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import andrews.pandoras_creatures.entities.AcidicArchvineEntity;
import andrews.pandoras_creatures.entities.model.AcidicArchvineModel;
import andrews.pandoras_creatures.util.Reference;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AcidicArchvineRenderer extends MobRenderer<AcidicArchvineEntity, AcidicArchvineModel<AcidicArchvineEntity>>
{	
	private ResourceLocation TONGUE_1 = new ResourceLocation(Reference.MODID, "textures/entity/acidic_archvine/acidic_archvine_tongue_1.png");
	private ResourceLocation TONGUE_2 = new ResourceLocation(Reference.MODID, "textures/entity/acidic_archvine/acidic_archvine_tongue_2.png");
	private final RenderType TONGUE_RENDER_TYPE_1 = RenderType.getEntityCutoutNoCull(TONGUE_1);
	private final RenderType TONGUE_RENDER_TYPE_2 = RenderType.getEntityCutoutNoCull(TONGUE_2);
	
	public AcidicArchvineRenderer(EntityRendererManager renderManager)
	{
        super(renderManager, new AcidicArchvineModel<>(), 0.5F);
    }
	
	@Override
	public ResourceLocation getEntityTexture(AcidicArchvineEntity entity)
	{
		return new ResourceLocation(Reference.MODID, "textures/entity/acidic_archvine/acidic_archvine_" + entity.getArchvineType() + ".png");
	}
	
	/**
	 * Used to get the correct Toungue Render Type for the Entity, (Maybe I dont need variation as the 2 types have almost the same texture).
	 */
	private RenderType getEntityTongueRenderType(AcidicArchvineEntity entity)
	{
		switch(entity.getArchvineType())
		{
			case 1:
				return TONGUE_RENDER_TYPE_1;
			case 2:
				return TONGUE_RENDER_TYPE_2;
			default:
				return TONGUE_RENDER_TYPE_1;
		}
	}
	
	private Vec3d getPosition(LivingEntity entityLivingBaseIn, double p_177110_2_, float p_177110_4_)
	{
		double d0 = MathHelper.lerp((double)p_177110_4_, entityLivingBaseIn.lastTickPosX, entityLivingBaseIn.getPosX());
		double d1 = MathHelper.lerp((double)p_177110_4_, entityLivingBaseIn.lastTickPosY, entityLivingBaseIn.getPosY()) + p_177110_2_;
		double d2 = MathHelper.lerp((double)p_177110_4_, entityLivingBaseIn.lastTickPosZ, entityLivingBaseIn.getPosZ());
		return new Vec3d(d0, d1, d2);
	}
	
	@Override
	public void render(AcidicArchvineEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn)
	{
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		LivingEntity livingentity = entityIn.getTargetedEntity();
		if(livingentity != null)
		{
			float f = 1.0F;
			float f1 = (float) entityIn.world.getGameTime() + partialTicks;
			float f2 = f1 * 0.5F % 1.0F;
			float f3 = entityIn.getEyeHeight();
			matrixStackIn.push();
			matrixStackIn.translate(0.0D, (double) f3, 0.0D);
			Vec3d vec3d = this.getPosition(livingentity, (double) livingentity.getHeight() * 0.5D, partialTicks);
			Vec3d vec3d1 = this.getPosition(entityIn, (double) f3, partialTicks);
			Vec3d vec3d2 = vec3d.subtract(vec3d1);
			float f4 = (float) (vec3d2.length() + 1.0D);
			vec3d2 = vec3d2.normalize();
			float f5 = (float) Math.acos(vec3d2.y);
			float f6 = (float) Math.atan2(vec3d2.z, vec3d2.x);
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees((((float) Math.PI / 2F) - f6) * (180F / (float) Math.PI)));
			matrixStackIn.rotate(Vector3f.XP.rotationDegrees(f5 * (180F / (float) Math.PI)));
			float f7 = f1 * 0.05F * -1.5F;
			float f8 = f * f;
			int j = 64 + (int) (f8 * 191.0F);
			int k = 32 + (int) (f8 * 191.0F);
			int l = 128 - (int) (f8 * 64.0F);
			float f11 = MathHelper.cos(f7 + 2.3561945F) * 0.282F;
			float f12 = MathHelper.sin(f7 + 2.3561945F) * 0.282F;
			float f13 = MathHelper.cos(f7 + ((float) Math.PI / 4F)) * 0.282F;
			float f14 = MathHelper.sin(f7 + ((float) Math.PI / 4F)) * 0.282F;
			float f15 = MathHelper.cos(f7 + 3.926991F) * 0.282F;
			float f16 = MathHelper.sin(f7 + 3.926991F) * 0.282F;
			float f17 = MathHelper.cos(f7 + 5.4977875F) * 0.282F;
			float f18 = MathHelper.sin(f7 + 5.4977875F) * 0.282F;
			float f19 = MathHelper.cos(f7 + (float) Math.PI) * 0.2F;
			float f20 = MathHelper.sin(f7 + (float) Math.PI) * 0.2F;
			float f21 = MathHelper.cos(f7 + 0.0F) * 0.2F;
			float f22 = MathHelper.sin(f7 + 0.0F) * 0.2F;
			float f23 = MathHelper.cos(f7 + ((float) Math.PI / 2F)) * 0.2F;
			float f24 = MathHelper.sin(f7 + ((float) Math.PI / 2F)) * 0.2F;
			float f25 = MathHelper.cos(f7 + ((float) Math.PI * 1.5F)) * 0.2F;
			float f26 = MathHelper.sin(f7 + ((float) Math.PI * 1.5F)) * 0.2F;
			float f29 = -1.0F + f2;
			float f30 = f4 * 2.5F + f29;
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(getEntityTongueRenderType(entityIn));
			MatrixStack.Entry matrixstack$entry = matrixStackIn.getLast();
			Matrix4f matrix4f = matrixstack$entry.getMatrix();
			Matrix3f matrix3f = matrixstack$entry.getNormal();
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f19, f4, f20, j, k, l, 0.4999F, f30);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f19, 0.0F, f20, j, k, l, 0.4999F, f29);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f21, 0.0F, f22, j, k, l, 0.0F, f29);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f21, f4, f22, j, k, l, 0.0F, f30);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f23, f4, f24, j, k, l, 0.4999F, f30);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f23, 0.0F, f24, j, k, l, 0.4999F, f29);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f25, 0.0F, f26, j, k, l, 0.0F, f29);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f25, f4, f26, j, k, l, 0.0F, f30);
			float f31 = 0.0F;
			if(entityIn.ticksExisted % 2 == 0)
			{
				f31 = 0.5F;
			}

			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f11, f4, f12, j, k, l, 0.5F, f31 + 0.5F);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f13, f4, f14, j, k, l, 1.0F, f31 + 0.5F);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f17, f4, f18, j, k, l, 1.0F, f31);
			vertexThingy(ivertexbuilder, matrix4f, matrix3f, f15, f4, f16, j, k, l, 0.5F, f31);
			matrixStackIn.pop();
		}
	}
	
	private static void vertexThingy(IVertexBuilder vertexBuilder, Matrix4f matrix4, Matrix3f matrix3, float p_229108_3_, float p_229108_4_, float p_229108_5_, int p_229108_6_, int p_229108_7_, int p_229108_8_, float p_229108_9_, float p_229108_10_)
	{
		vertexBuilder.pos(matrix4, p_229108_3_, p_229108_4_, p_229108_5_).color(p_229108_6_, p_229108_7_, p_229108_8_, 255).tex(p_229108_9_, p_229108_10_).overlay(OverlayTexture.NO_OVERLAY).lightmap(15728880).normal(matrix3, 0.0F, 1.0F, 0.0F).endVertex();
	}
}