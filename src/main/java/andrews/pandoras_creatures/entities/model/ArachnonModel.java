package andrews.pandoras_creatures.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import andrews.pandoras_creatures.entities.ArachnonEntity;
import andrews.pandoras_creatures.util.animation.PCEntityModel;
import andrews.pandoras_creatures.util.animation.PCModelRenderer;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Arachnon - andrew0030
 * Created using Tabula 7.0.0
 */
@OnlyIn(Dist.CLIENT)
public class ArachnonModel<T extends ArachnonEntity> extends PCEntityModel<T>
{	
    public PCModelRenderer body;
    public PCModelRenderer body2;
    public PCModelRenderer shoulders_front;
    public PCModelRenderer body_top_plate;
    public PCModelRenderer body_head_holder;
    public PCModelRenderer spike_holder;
    public PCModelRenderer spike_holder_1;
    public PCModelRenderer body3;
    public PCModelRenderer body_bottom;
    public PCModelRenderer shoulders_back;
    public PCModelRenderer body_top_plate2;
    public PCModelRenderer spike_holder_2;
    public PCModelRenderer spike_holder_3;
    public PCModelRenderer back_cover_top;
    public PCModelRenderer shape47;
    public PCModelRenderer shape48;
    public PCModelRenderer big_spike;
    public PCModelRenderer big_spike_1;
    public PCModelRenderer leg_back_right_rotation_point;
    public PCModelRenderer leg_back_left_rotation_point;
    public PCModelRenderer spike;
    public PCModelRenderer spike_1;
    public PCModelRenderer leg_back_right;
    public PCModelRenderer leg_back_right2;
    public PCModelRenderer leg_back_right_top;
    public PCModelRenderer leg_back_right3;
    public PCModelRenderer spike_2;
    public PCModelRenderer spike_3;
    public PCModelRenderer spike_4;
    public PCModelRenderer leg_back_right4;
    public PCModelRenderer spike_5;
    public PCModelRenderer spike_6;
    public PCModelRenderer leg_back_left;
    public PCModelRenderer leg_back_left2;
    public PCModelRenderer leg_back_left_top;
    public PCModelRenderer leg_back_left3;
    public PCModelRenderer spike_7;
    public PCModelRenderer spike_8;
    public PCModelRenderer spike_9;
    public PCModelRenderer leg_back_left_4;
    public PCModelRenderer spike_10;
    public PCModelRenderer spike_11;
    public PCModelRenderer spike2;
    public PCModelRenderer spike1;
    public PCModelRenderer spike3;
    public PCModelRenderer spike_12;
    public PCModelRenderer spike_13;
    public PCModelRenderer spike_14;
    public PCModelRenderer spike_15;
    public PCModelRenderer spike_16;
    public PCModelRenderer spike_17;
    public PCModelRenderer big_spike_2;
    public PCModelRenderer spike_18;
    public PCModelRenderer shape49;
    public PCModelRenderer shape50;
    public PCModelRenderer leg_front_left_rotation_point;
    public PCModelRenderer leg_front_right_rotation_point;
    public PCModelRenderer leg_front_left;
    public PCModelRenderer leg_front_left2;
    public PCModelRenderer leg_front_left_top;
    public PCModelRenderer leg_front_left3;
    public PCModelRenderer spike_19;
    public PCModelRenderer spike_20;
    public PCModelRenderer spike_21;
    public PCModelRenderer leg_front_left_4;
    public PCModelRenderer spike_22;
    public PCModelRenderer spike_23;
    public PCModelRenderer leg_front_right;
    public PCModelRenderer leg_front_right2;
    public PCModelRenderer leg_front_right_top;
    public PCModelRenderer leg_front_right3;
    public PCModelRenderer spike_24;
    public PCModelRenderer spike_25;
    public PCModelRenderer spike_26;
    public PCModelRenderer leg_front_right4;
    public PCModelRenderer spike_27;
    public PCModelRenderer spike_28;
    public PCModelRenderer spike2_1;
    public PCModelRenderer spike1_1;
    public PCModelRenderer spike3_1;
    public PCModelRenderer neck;
    public PCModelRenderer neck_bottom;
    public PCModelRenderer neck_front;
    public PCModelRenderer head;
    public PCModelRenderer eye;
    public PCModelRenderer head_side_left;
    public PCModelRenderer head_side_right;
    public PCModelRenderer head_top;
    public PCModelRenderer lip_up_1;
    public PCModelRenderer mouth_left;
    public PCModelRenderer mouth_right;
    public PCModelRenderer mouth_up_front;
    public PCModelRenderer mouth_up_inside;
    public PCModelRenderer tooth_top_left;
    public PCModelRenderer tooth_top_right;
    public PCModelRenderer tooth_top_mid_right;
    public PCModelRenderer tooth_top_mid_left;
    public PCModelRenderer mouth_bottom;
    public PCModelRenderer eye_ball;
    public PCModelRenderer eye_brow;
    public PCModelRenderer eye_brow_left;
    public PCModelRenderer eye_brow_right;
    public PCModelRenderer eye_protection_right;
    public PCModelRenderer eye_protection_left;
    public PCModelRenderer head_back_lid;
    public PCModelRenderer head_back_con;
    public PCModelRenderer head_back_lid_right;
    public PCModelRenderer head_back_lid_left;
    public PCModelRenderer lip_up_2;
    public PCModelRenderer tooth_top_left_2;
    public PCModelRenderer tooth_top_right_2;
    public PCModelRenderer tooth_top_mid_right_2;
    public PCModelRenderer tooth_top_mid_left_2;
    public PCModelRenderer mouth_bottom_lip_front;
    public PCModelRenderer tooth_bottom_mid;
    public PCModelRenderer mouth_bottom_side_left;
    public PCModelRenderer mouth_bottom_side_right;
    public PCModelRenderer tooth_bottom_left;
    public PCModelRenderer tooth_bottom_right;
    public PCModelRenderer tooth_bottom_left_1;
    public PCModelRenderer tooth_bottom_right_1;
    public PCModelRenderer mouth_bottom_side_left_2;
    public PCModelRenderer mouth_bottom_side_right_2;
    public PCModelRenderer tooth_bottom_left_2;
    public PCModelRenderer tooth_bottom_right_2;
    public PCModelRenderer spike_29;
    public PCModelRenderer spike_30;
    public PCModelRenderer spike_31;
    public PCModelRenderer spike_32;
    public PCModelRenderer spike_33;
    public PCModelRenderer spike_34;
    
    public ArachnonModel()
    {
    	this.textureWidth = 256;
        this.textureHeight = 128;
        this.spike1 = new PCModelRenderer(this, 181, 26);
        this.spike1.setRotationPoint(-0.5F, 1.0F, -3.0F);
        this.spike1.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(spike1, 0.7853981633974483F, 0.0F, 0.0F);
        this.tooth_top_mid_left_2 = new PCModelRenderer(this, 185, 76);
        this.tooth_top_mid_left_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tooth_top_mid_left_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tooth_top_mid_left_2, 0.17453292519943295F, 0.0F, 0.0F);
        this.tooth_bottom_left_2 = new PCModelRenderer(this, 180, 77);
        this.tooth_bottom_left_2.setRotationPoint(-1.0F, -2.0F, -1.0F);
        this.tooth_bottom_left_2.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_bottom_left_2, -0.5235987755982988F, 0.0F, 0.0F);
        this.leg_back_right3 = new PCModelRenderer(this, 95, 94);
        this.leg_back_right3.setRotationPoint(-2.5F, 10.0F, 0.0F);
        this.leg_back_right3.addBox(0.0F, 0.0F, -2.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(leg_back_right3, 0.0F, 0.0F, -0.17453292519943295F);
        this.spike_11 = new PCModelRenderer(this, 78, 71);
        this.spike_11.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.spike_11.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.spike_15 = new PCModelRenderer(this, 52, 18);
        this.spike_15.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.spike_15.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike_15, 0.7853981633974483F, 0.0F, 0.0F);
        this.leg_front_left = new PCModelRenderer(this, 99, 0);
        this.leg_front_left.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_front_left.addBox(-1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(leg_front_left, 0.0F, 0.0F, 0.6981317007977318F);
        this.tooth_top_mid_right = new PCModelRenderer(this, 185, 65);
        this.tooth_top_mid_right.setRotationPoint(-1.5F, 0.0F, -4.8F);
        this.tooth_top_mid_right.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_top_mid_right, -0.3490658503988659F, 0.0F, 0.0F);
        this.head_back_lid_right = new PCModelRenderer(this, 224, 55);
        this.head_back_lid_right.setRotationPoint(0.0F, 5.6F, -1.0F);
        this.head_back_lid_right.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.spike2 = new PCModelRenderer(this, 186, 25);
        this.spike2.setRotationPoint(-0.5F, 0.8F, -0.5F);
        this.spike2.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.leg_front_left_4 = new PCModelRenderer(this, 86, 62);
        this.leg_front_left_4.setRotationPoint(-0.5F, 7.0F, 0.0F);
        this.leg_front_left_4.addBox(-1.0F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(leg_front_left_4, 0.0F, 0.0F, 0.17453292519943295F);
        this.tooth_bottom_left = new PCModelRenderer(this, 180, 73);
        this.tooth_bottom_left.setRotationPoint(2.2F, 0.3F, -4.0F);
        this.tooth_bottom_left.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_bottom_left, 0.13962634015954636F, -1.3089969389957472F, 0.6108652381980153F);
        this.spike_29 = new PCModelRenderer(this, 67, 7);
        this.spike_29.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.spike_29.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike_29, 0.7853981633974483F, 0.0F, 0.0F);
        this.head_back_lid = new PCModelRenderer(this, 245, 50);
        this.head_back_lid.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.head_back_lid.addBox(0.0F, 0.0F, -1.0F, 4, 9, 1, 0.0F);
        this.body2 = new PCModelRenderer(this, 199, 0);
        this.body2.setRotationPoint(-3.0F, -3.1F, 4.0F);
        this.body2.addBox(0.0F, 0.0F, -1.0F, 6, 7, 6, 0.0F);
        this.eye_brow_right = new PCModelRenderer(this, 244, 61);
        this.eye_brow_right.setRotationPoint(0.0F, 1.0F, 0.01F);
        this.eye_brow_right.addBox(-2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(eye_brow_right, 0.0F, 0.0F, 0.2617993877991494F);
        this.spike_28 = new PCModelRenderer(this, 78, 83);
        this.spike_28.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.spike_28.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.neck_front = new PCModelRenderer(this, 108, 18);
        this.neck_front.setRotationPoint(0.01F, 0.0F, -4.0F);
        this.neck_front.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(neck_front, 0.27314402793711257F, 0.0F, 0.0F);
        this.spike_21 = new PCModelRenderer(this, 76, 64);
        this.spike_21.setRotationPoint(2.0F, 5.0F, 2.5F);
        this.spike_21.addBox(-1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_21, -0.5235987755982988F, 0.0F, 0.0F);
        this.head_back_lid_left = new PCModelRenderer(this, 229, 55);
        this.head_back_lid_left.setRotationPoint(4.0F, 5.6F, -1.0F);
        this.head_back_lid_left.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.eye_protection_right = new PCModelRenderer(this, 189, 50);
        this.eye_protection_right.setRotationPoint(0.2F, 0.0F, -0.2F);
        this.eye_protection_right.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(eye_protection_right, -0.3141592653589793F, 0.2617993877991494F, 0.0F);
        this.big_spike = new PCModelRenderer(this, 12, 0);
        this.big_spike.setRotationPoint(6.0F, 3.5F, 4.0F);
        this.big_spike.addBox(-2.0F, -5.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(big_spike, -0.8726646259971648F, -0.4363323129985824F, 0.0F);
        this.tooth_bottom_left_1 = new PCModelRenderer(this, 175, 73);
        this.tooth_bottom_left_1.setRotationPoint(1.8F, 0.0F, 0.0F);
        this.tooth_bottom_left_1.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.spike_holder = new PCModelRenderer(this, 57, 0);
        this.spike_holder.setRotationPoint(4.0F, -1.4F, -3.5F);
        this.spike_holder.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(spike_holder, 0.0F, 0.0F, 0.5585053606381855F);
        this.tooth_top_left_2 = new PCModelRenderer(this, 190, 77);
        this.tooth_top_left_2.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.tooth_top_left_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_top_left_2, 0.5235987755982988F, 0.0F, 0.0F);
        this.tooth_top_right_2 = new PCModelRenderer(this, 190, 69);
        this.tooth_top_right_2.setRotationPoint(-1.0F, 2.0F, -1.0F);
        this.tooth_top_right_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_top_right_2, 0.5235987755982988F, 0.0F, 0.0F);
        this.shape49 = new PCModelRenderer(this, 124, 18);
        this.shape49.setRotationPoint(0.0F, 0.01F, 4.0F);
        this.shape49.addBox(0.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(shape49, 0.0F, 0.7853981633974483F, 0.0F);
        this.leg_back_left_4 = new PCModelRenderer(this, 86, 75);
        this.leg_back_left_4.setRotationPoint(-0.5F, 7.0F, 0.0F);
        this.leg_back_left_4.addBox(-1.0F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(leg_back_left_4, 0.0F, 0.0F, 0.17453292519943295F);
        this.spike_32 = new PCModelRenderer(this, 67, 18);
        this.spike_32.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.spike_32.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike_32, 0.7853981633974483F, 0.0F, 0.0F);
        this.spike_holder_1 = new PCModelRenderer(this, 57, 11);
        this.spike_holder_1.setRotationPoint(-4.0F, -1.4F, -3.5F);
        this.spike_holder_1.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(spike_holder_1, 0.0F, 0.0F, -0.5585053606381855F);
        this.body = new PCModelRenderer(this, 224, 0);
        this.body.setRotationPoint(0.0F, 4.9F, -4.5F);
        this.body.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F);
        this.spike_4 = new PCModelRenderer(this, 76, 101);
        this.spike_4.setRotationPoint(-2.0F, 5.0F, 2.5F);
        this.spike_4.addBox(0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_4, -0.5235987755982988F, 0.0F, 0.0F);
        this.mouth_bottom_side_left_2 = new PCModelRenderer(this, 221, 67);
        this.mouth_bottom_side_left_2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.mouth_bottom_side_left_2.addBox(-1.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(mouth_bottom_side_left_2, 0.0F, 0.0F, -0.6981317007977318F);
        this.neck = new PCModelRenderer(this, 108, 0);
        this.neck.setRotationPoint(3.0F, 1.0F, 1.0F);
        this.neck.addBox(-2.0F, 0.0F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(neck, 0.08726646259971647F, 0.0F, 0.0F);
        this.eye_protection_left = new PCModelRenderer(this, 189, 56);
        this.eye_protection_left.setRotationPoint(3.8F, 0.0F, 0.0F);
        this.eye_protection_left.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(eye_protection_left, -0.3141592653589793F, -0.2617993877991494F, 0.0F);
        this.tooth_bottom_right_2 = new PCModelRenderer(this, 180, 69);
        this.tooth_bottom_right_2.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.tooth_bottom_right_2.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_bottom_right_2, -0.5235987755982988F, 0.0F, 0.0F);
        this.shape47 = new PCModelRenderer(this, 124, 29);
        this.shape47.setRotationPoint(0.0F, 0.01F, 0.0F);
        this.shape47.addBox(0.0F, 0.0F, -6.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(shape47, 0.0F, -0.7853981633974483F, 0.0F);
        this.mouth_bottom_lip_front = new PCModelRenderer(this, 207, 60);
        this.mouth_bottom_lip_front.setRotationPoint(-3.0F, 1.0F, -5.0F);
        this.mouth_bottom_lip_front.addBox(0.0F, -1.0F, -2.0F, 6, 1, 2, 0.0F);
        this.setRotateAngle(mouth_bottom_lip_front, -0.5235987755982988F, 0.0F, 0.0F);
        this.body_head_holder = new PCModelRenderer(this, 198, 20);
        this.body_head_holder.setRotationPoint(-3.0F, -3.9F, -4.0F);
        this.body_head_holder.addBox(0.0F, 0.0F, 0.0F, 6, 4, 1, 0.0F);
        this.setRotateAngle(body_head_holder, -0.22689280275926282F, 0.0F, 0.0F);
        this.spike_27 = new PCModelRenderer(this, 90, 82);
        this.spike_27.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.spike_27.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_27, 0.0F, 0.0F, -0.5235987755982988F);
        this.spike_22 = new PCModelRenderer(this, 90, 57);
        this.spike_22.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.spike_22.addBox(-1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_22, 0.0F, 0.0F, 0.5235987755982988F);
        this.leg_front_right4 = new PCModelRenderer(this, 86, 87);
        this.leg_front_right4.setRotationPoint(0.5F, 7.0F, 0.0F);
        this.leg_front_right4.addBox(0.0F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(leg_front_right4, 0.0F, 0.0F, -0.17453292519943295F);
        this.spike_holder_3 = new PCModelRenderer(this, 42, 11);
        this.spike_holder_3.setRotationPoint(-4.0F, -1.4F, -0.5F);
        this.spike_holder_3.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(spike_holder_3, 0.0F, 0.0F, -0.5585053606381855F);
        this.spike_23 = new PCModelRenderer(this, 78, 58);
        this.spike_23.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.spike_23.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.head_side_right = new PCModelRenderer(this, 210, 50);
        this.head_side_right.setRotationPoint(-1.0F, -4.0F, -2.0F);
        this.head_side_right.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(head_side_right, 0.0F, 0.0F, 0.20943951023931953F);
        this.lip_up_1 = new PCModelRenderer(this, 245, 70);
        this.lip_up_1.setRotationPoint(-2.0F, -1.0F, -4.0F);
        this.lip_up_1.addBox(0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(lip_up_1, 0.6981317007977318F, 0.0F, 0.0F);
        this.shoulders_back = new PCModelRenderer(this, 125, 9);
        this.shoulders_back.setRotationPoint(-8.0F, 0.01F, 1.0F);
        this.shoulders_back.addBox(0.0F, 0.0F, 0.0F, 16, 4, 4, 0.0F);
        this.big_spike_1 = new PCModelRenderer(this, 30, 0);
        this.big_spike_1.setRotationPoint(10.0F, 3.5F, 4.0F);
        this.big_spike_1.addBox(0.0F, -5.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(big_spike_1, -0.8726646259971648F, 0.4363323129985824F, 0.0F);
        this.spike2_1 = new PCModelRenderer(this, 171, 25);
        this.spike2_1.setRotationPoint(-0.5F, 0.8F, -0.5F);
        this.spike2_1.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.leg_front_right_top = new PCModelRenderer(this, 85, 13);
        this.leg_front_right_top.setRotationPoint(1.0F, -9.0F, -0.5F);
        this.leg_front_right_top.addBox(-2.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        this.setRotateAngle(leg_front_right_top, 0.0F, 0.0F, -0.22689280275926282F);
        this.leg_back_right_top = new PCModelRenderer(this, 78, 13);
        this.leg_back_right_top.setRotationPoint(1.0F, -9.0F, -0.5F);
        this.leg_back_right_top.addBox(-2.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        this.setRotateAngle(leg_back_right_top, 0.0F, 0.0F, -0.22689280275926282F);
        this.big_spike_2 = new PCModelRenderer(this, 21, 0);
        this.big_spike_2.setRotationPoint(4.0F, 3.0F, -2.5F);
        this.big_spike_2.addBox(0.0F, -5.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(big_spike_2, -2.1816615649929116F, 0.0F, 3.141592653589793F);
        this.spike_2 = new PCModelRenderer(this, 80, 96);
        this.spike_2.setRotationPoint(-2.0F, 0.0F, -1.5F);
        this.spike_2.addBox(0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.mouth_left = new PCModelRenderer(this, 208, 64);
        this.mouth_left.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.mouth_left.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(mouth_left, -0.08726646259971647F, 0.17453292519943295F, -0.45378560551852565F);
        this.head_side_left = new PCModelRenderer(this, 201, 50);
        this.head_side_left.setRotationPoint(1.0F, -4.0F, -2.0F);
        this.head_side_left.addBox(0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(head_side_left, 0.0F, 0.0F, -0.20943951023931953F);
        this.mouth_right = new PCModelRenderer(this, 208, 72);
        this.mouth_right.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.mouth_right.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(mouth_right, -0.08726646259971647F, -0.17453292519943295F, 0.45378560551852565F);
        this.tooth_top_mid_right_2 = new PCModelRenderer(this, 185, 69);
        this.tooth_top_mid_right_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tooth_top_mid_right_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tooth_top_mid_right_2, 0.17453292519943295F, 0.0F, 0.0F);
        this.leg_front_right_rotation_point = new PCModelRenderer(this, 0, 3);
        this.leg_front_right_rotation_point.setRotationPoint(1.0F, 3.0F, 2.0F);
        this.leg_front_right_rotation_point.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.leg_front_left2 = new PCModelRenderer(this, 91, 25);
        this.leg_front_left2.setRotationPoint(-1.0F, -10.0F, 0.0F);
        this.leg_front_left2.addBox(0.0F, 0.0F, -2.5F, 3, 10, 5, 0.0F);
        this.setRotateAngle(leg_front_left2, 0.0F, 0.0F, -0.9599310885968813F);
        this.eye_brow = new PCModelRenderer(this, 251, 61);
        this.eye_brow.setRotationPoint(0.5F, -3.1F, -1.5F);
        this.eye_brow.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.leg_back_right_rotation_point = new PCModelRenderer(this, 5, 0);
        this.leg_back_right_rotation_point.setRotationPoint(1.0F, 2.9F, 2.0F);
        this.leg_back_right_rotation_point.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.body_top_plate2 = new PCModelRenderer(this, 173, 17);
        this.body_top_plate2.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.body_top_plate2.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 6, 0.0F);
        this.head = new PCModelRenderer(this, 239, 64);
        this.head.setRotationPoint(1.5F, -2.5F, -4.0F);
        this.head.addBox(-2.0F, -1.0F, -4.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(head, 0.6108652381980153F, 0.0F, 0.0F);
        this.eye_ball = new PCModelRenderer(this, 195, 55);
        this.eye_ball.setRotationPoint(0.5F, -1.6F, -1.2F);
        this.eye_ball.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.mouth_bottom_side_left = new PCModelRenderer(this, 232, 67);
        this.mouth_bottom_side_left.setRotationPoint(3.0F, 1.0F, 0.0F);
        this.mouth_bottom_side_left.addBox(-1.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(mouth_bottom_side_left, -0.08726646259971647F, 0.0F, 0.22689280275926282F);
        this.shape48 = new PCModelRenderer(this, 145, 29);
        this.shape48.setRotationPoint(16.0F, 0.01F, 0.0F);
        this.shape48.addBox(-4.0F, 0.0F, -6.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(shape48, 0.0F, 0.7853981633974483F, 0.0F);
        this.spike_12 = new PCModelRenderer(this, 52, 7);
        this.spike_12.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.spike_12.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike_12, 0.7853981633974483F, 0.0F, 0.0F);
        this.mouth_bottom = new PCModelRenderer(this, 219, 60);
        this.mouth_bottom.setRotationPoint(0.0F, 5.5F, 0.5F);
        this.mouth_bottom.addBox(-3.0F, 0.0F, -5.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(mouth_bottom, 0.03490658503988659F, 0.0F, 0.0F);
        this.mouth_bottom_side_right = new PCModelRenderer(this, 232, 75);
        this.mouth_bottom_side_right.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.mouth_bottom_side_right.addBox(0.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(mouth_bottom_side_right, -0.08726646259971647F, 0.0F, -0.22689280275926282F);
        this.leg_back_right = new PCModelRenderer(this, 72, 0);
        this.leg_back_right.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_back_right.addBox(-1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(leg_back_right, 0.0F, 0.0F, -0.6981317007977318F);
        this.spike_25 = new PCModelRenderer(this, 81, 89);
        this.spike_25.setRotationPoint(-2.0F, 5.0F, -2.5F);
        this.spike_25.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_25, 0.5235987755982988F, 0.0F, 0.0F);
        this.head_top = new PCModelRenderer(this, 219, 50);
        this.head_top.setRotationPoint(-2.0F, -4.1F, -2.0F);
        this.head_top.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.leg_front_right2 = new PCModelRenderer(this, 91, 41);
        this.leg_front_right2.setRotationPoint(1.0F, -10.0F, 0.0F);
        this.leg_front_right2.addBox(-3.0F, 0.0F, -2.5F, 3, 10, 5, 0.0F);
        this.setRotateAngle(leg_front_right2, 0.0F, 0.0F, 0.9599310885968813F);
        this.body_bottom = new PCModelRenderer(this, 202, 17);
        this.body_bottom.setRotationPoint(1.0F, 7.0F, -8.0F);
        this.body_bottom.addBox(0.0F, 0.0F, 0.0F, 4, 1, 20, 0.0F);
        this.tooth_top_mid_left = new PCModelRenderer(this, 185, 72);
        this.tooth_top_mid_left.setRotationPoint(0.5F, 0.0F, -4.8F);
        this.tooth_top_mid_left.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_top_mid_left, -0.3490658503988659F, 0.0F, 0.0F);
        this.spike_19 = new PCModelRenderer(this, 80, 59);
        this.spike_19.setRotationPoint(1.0F, 0.0F, -1.5F);
        this.spike_19.addBox(0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.spike_9 = new PCModelRenderer(this, 76, 77);
        this.spike_9.setRotationPoint(2.0F, 5.0F, 2.5F);
        this.spike_9.addBox(-1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_9, -0.5235987755982988F, 0.0F, 0.0F);
        this.mouth_up_front = new PCModelRenderer(this, 243, 76);
        this.mouth_up_front.setRotationPoint(-2.5F, 0.7F, -3.9F);
        this.mouth_up_front.addBox(0.0F, 0.0F, -1.0F, 5, 1, 1, 0.0F);
        this.setRotateAngle(mouth_up_front, -0.136659280431156F, 0.0F, 0.0F);
        this.mouth_bottom_side_right_2 = new PCModelRenderer(this, 221, 75);
        this.mouth_bottom_side_right_2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.mouth_bottom_side_right_2.addBox(0.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(mouth_bottom_side_right_2, 0.0F, 0.0F, 0.6981317007977318F);
        this.leg_front_left_top = new PCModelRenderer(this, 99, 13);
        this.leg_front_left_top.setRotationPoint(-1.0F, -9.0F, -0.5F);
        this.leg_front_left_top.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        this.setRotateAngle(leg_front_left_top, 0.0F, 0.0F, 0.22689280275926282F);
        this.leg_front_right3 = new PCModelRenderer(this, 95, 82);
        this.leg_front_right3.setRotationPoint(-2.5F, 10.0F, 0.0F);
        this.leg_front_right3.addBox(0.0F, 0.0F, -2.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(leg_front_right3, 0.0F, 0.0F, -0.17453292519943295F);
        this.leg_front_right = new PCModelRenderer(this, 81, 0);
        this.leg_front_right.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_front_right.addBox(-1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(leg_front_right, 0.0F, 0.0F, -0.6981317007977318F);
        this.spike_30 = new PCModelRenderer(this, 57, 7);
        this.spike_30.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.spike_30.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike_30, -0.7853981633974483F, 0.0F, 0.0F);
        this.spike = new PCModelRenderer(this, 12, 8);
        this.spike.setRotationPoint(-1.5F, -5.0F, -0.5F);
        this.spike.addBox(0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike, 0.3490658503988659F, 0.0F, 0.0F);
        this.leg_front_left3 = new PCModelRenderer(this, 95, 57);
        this.leg_front_left3.setRotationPoint(2.5F, 10.0F, 0.0F);
        this.leg_front_left3.addBox(-2.0F, 0.0F, -2.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(leg_front_left3, 0.0F, 0.0F, 0.17453292519943295F);
        this.spike_6 = new PCModelRenderer(this, 78, 95);
        this.spike_6.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.spike_6.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.spike_33 = new PCModelRenderer(this, 62, 18);
        this.spike_33.setRotationPoint(-1.0F, 0.3F, 2.5F);
        this.spike_33.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.tooth_bottom_mid = new PCModelRenderer(this, 175, 69);
        this.tooth_bottom_mid.setRotationPoint(-0.5F, 0.0F, -4.9F);
        this.tooth_bottom_mid.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_bottom_mid, 0.17453292519943295F, 0.0F, 0.0F);
        this.spike_16 = new PCModelRenderer(this, 47, 18);
        this.spike_16.setRotationPoint(-1.0F, 0.3F, 2.5F);
        this.spike_16.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.spike_5 = new PCModelRenderer(this, 90, 94);
        this.spike_5.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.spike_5.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_5, 0.0F, 0.0F, -0.5235987755982988F);
        this.spike_17 = new PCModelRenderer(this, 42, 18);
        this.spike_17.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.spike_17.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike_17, -0.7853981633974483F, 0.0F, 0.0F);
        this.leg_back_left_rotation_point = new PCModelRenderer(this, 0, 0);
        this.leg_back_left_rotation_point.setRotationPoint(15.0F, 3.0F, 2.0F);
        this.leg_back_left_rotation_point.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.spike1_1 = new PCModelRenderer(this, 166, 25);
        this.spike1_1.setRotationPoint(-0.5F, 1.5F, -3.0F);
        this.spike1_1.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike1_1, 0.7853981633974483F, 0.0F, 0.0F);
        this.spike_34 = new PCModelRenderer(this, 57, 18);
        this.spike_34.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.spike_34.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike_34, -0.7853981633974483F, 0.0F, 0.0F);
        this.leg_back_left2 = new PCModelRenderer(this, 74, 25);
        this.leg_back_left2.setRotationPoint(-1.0F, -10.0F, 0.0F);
        this.leg_back_left2.addBox(0.0F, 0.0F, -2.5F, 3, 10, 5, 0.0F);
        this.setRotateAngle(leg_back_left2, 0.0F, 0.0F, -0.9599310885968813F);
        this.spike_18 = new PCModelRenderer(this, 21, 8);
        this.spike_18.setRotationPoint(1.5F, -5.0F, -0.5F);
        this.spike_18.addBox(-1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_18, 0.3490658503988659F, 0.0F, 0.0F);
        this.head_back_con = new PCModelRenderer(this, 234, 50);
        this.head_back_con.setRotationPoint(0.5F, 0.0F, 3.0F);
        this.head_back_con.addBox(0.0F, 0.0F, -2.0F, 3, 6, 2, 0.0F);
        this.setRotateAngle(head_back_con, 0.36425021489121656F, 0.0F, 0.0F);
        this.body_top_plate = new PCModelRenderer(this, 231, 17);
        this.body_top_plate.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.body_top_plate.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 6, 0.0F);
        this.spike_24 = new PCModelRenderer(this, 80, 84);
        this.spike_24.setRotationPoint(-2.0F, 0.0F, -1.5F);
        this.spike_24.addBox(0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.leg_back_right4 = new PCModelRenderer(this, 86, 99);
        this.leg_back_right4.setRotationPoint(0.5F, 7.0F, 0.0F);
        this.leg_back_right4.addBox(0.0F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(leg_back_right4, 0.0F, 0.0F, -0.17453292519943295F);
        this.tooth_bottom_right_1 = new PCModelRenderer(this, 175, 65);
        this.tooth_bottom_right_1.setRotationPoint(-1.8F, 0.0F, 0.0F);
        this.tooth_bottom_right_1.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.spike_14 = new PCModelRenderer(this, 47, 7);
        this.spike_14.setRotationPoint(1.0F, 0.3F, 1.5F);
        this.spike_14.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.spike_8 = new PCModelRenderer(this, 81, 77);
        this.spike_8.setRotationPoint(2.0F, 5.0F, -2.5F);
        this.spike_8.addBox(-1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_8, 0.5235987755982988F, 0.0F, 0.0F);
        this.spike_3 = new PCModelRenderer(this, 81, 101);
        this.spike_3.setRotationPoint(-2.0F, 5.0F, -2.5F);
        this.spike_3.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_3, 0.5235987755982988F, 0.0F, 0.0F);
        this.neck_bottom = new PCModelRenderer(this, 106, 9);
        this.neck_bottom.setRotationPoint(-1.5F, 4.0F, -4.0F);
        this.neck_bottom.addBox(0.0F, -2.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(neck_bottom, -0.3141592653589793F, 0.0F, 0.0F);
        this.spike3 = new PCModelRenderer(this, 191, 25);
        this.spike3.setRotationPoint(-0.5F, 1.5F, 3.0F);
        this.spike3.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike3, -0.7853981633974483F, 0.0F, 0.0F);
        this.leg_back_left3 = new PCModelRenderer(this, 95, 70);
        this.leg_back_left3.setRotationPoint(2.5F, 10.0F, 0.0F);
        this.leg_back_left3.addBox(-2.0F, 0.0F, -2.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(leg_back_left3, 0.0F, 0.0F, 0.17453292519943295F);
        this.tooth_top_left = new PCModelRenderer(this, 190, 73);
        this.tooth_top_left.setRotationPoint(1.3F, 0.3F, -4.0F);
        this.tooth_top_left.addBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_top_left, -0.6981317007977318F, -0.6108652381980153F, 0.0F);
        this.tooth_top_right = new PCModelRenderer(this, 190, 65);
        this.tooth_top_right.setRotationPoint(-1.3F, 0.3F, -4.0F);
        this.tooth_top_right.addBox(-1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_top_right, -0.6981317007977318F, 0.6108652381980153F, 0.0F);
        this.spike_1 = new PCModelRenderer(this, 30, 8);
        this.spike_1.setRotationPoint(1.5F, -5.0F, -0.5F);
        this.spike_1.addBox(-1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_1, 0.3490658503988659F, 0.0F, 0.0F);
        this.spike_20 = new PCModelRenderer(this, 81, 64);
        this.spike_20.setRotationPoint(2.0F, 5.0F, -2.5F);
        this.spike_20.addBox(-1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_20, 0.5235987755982988F, 0.0F, 0.0F);
        this.spike_13 = new PCModelRenderer(this, 42, 7);
        this.spike_13.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.spike_13.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(spike_13, -0.7853981633974483F, 0.0F, 0.0F);
        this.lip_up_2 = new PCModelRenderer(this, 245, 73);
        this.lip_up_2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.lip_up_2.addBox(0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(lip_up_2, 0.6981317007977318F, 0.0F, 0.0F);
        this.spike_holder_2 = new PCModelRenderer(this, 42, 0);
        this.spike_holder_2.setRotationPoint(4.0F, -1.4F, -0.5F);
        this.spike_holder_2.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(spike_holder_2, 0.0F, 0.0F, 0.5585053606381855F);
        this.spike_26 = new PCModelRenderer(this, 76, 89);
        this.spike_26.setRotationPoint(-2.0F, 5.0F, 2.5F);
        this.spike_26.addBox(0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_26, -0.5235987755982988F, 0.0F, 0.0F);
        this.leg_back_left_top = new PCModelRenderer(this, 92, 13);
        this.leg_back_left_top.setRotationPoint(-1.0F, -9.0F, -0.5F);
        this.leg_back_left_top.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        this.setRotateAngle(leg_back_left_top, 0.0F, 0.0F, 0.22689280275926282F);
        this.spike_7 = new PCModelRenderer(this, 80, 72);
        this.spike_7.setRotationPoint(1.0F, 0.0F, -1.5F);
        this.spike_7.addBox(0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.back_cover_top = new PCModelRenderer(this, 199, 14);
        this.back_cover_top.setRotationPoint(-3.0F, -3.5F, 4.0F);
        this.back_cover_top.addBox(0.0F, 0.0F, -1.0F, 6, 4, 1, 0.0F);
        this.setRotateAngle(back_cover_top, 0.24434609527920614F, 0.0F, 0.0F);
        this.shape50 = new PCModelRenderer(this, 145, 18);
        this.shape50.setRotationPoint(16.0F, 0.01F, 4.0F);
        this.shape50.addBox(-4.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(shape50, 0.0F, -0.7853981633974483F, 0.0F);
        this.tooth_bottom_right = new PCModelRenderer(this, 180, 65);
        this.tooth_bottom_right.setRotationPoint(-2.2F, 0.3F, -4.0F);
        this.tooth_bottom_right.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tooth_bottom_right, 0.13962634015954636F, 1.3089969389957472F, -0.6108652381980153F);
        this.spike3_1 = new PCModelRenderer(this, 176, 26);
        this.spike3_1.setRotationPoint(-0.5F, 1.0F, 3.0F);
        this.spike3_1.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(spike3_1, -0.7853981633974483F, 0.0F, 0.0F);
        this.shoulders_front = new PCModelRenderer(this, 125, 0);
        this.shoulders_front.setRotationPoint(-8.0F, 0.01F, -5.0F);
        this.shoulders_front.addBox(0.0F, 0.0F, 0.0F, 16, 4, 4, 0.0F);
        this.leg_front_left_rotation_point = new PCModelRenderer(this, 5, 3);
        this.leg_front_left_rotation_point.setRotationPoint(15.0F, 3.0F, 2.0F);
        this.leg_front_left_rotation_point.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.spike_10 = new PCModelRenderer(this, 90, 70);
        this.spike_10.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.spike_10.addBox(-1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spike_10, 0.0F, 0.0F, 0.5235987755982988F);
        this.leg_back_left = new PCModelRenderer(this, 90, 0);
        this.leg_back_left.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_back_left.addBox(-1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(leg_back_left, 0.0F, 0.0F, 0.6981317007977318F);
        this.spike_31 = new PCModelRenderer(this, 62, 7);
        this.spike_31.setRotationPoint(1.0F, 0.3F, 1.5F);
        this.spike_31.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.body3 = new PCModelRenderer(this, 166, 0);
        this.body3.setRotationPoint(3.0F, 3.1F, 8.0F);
        this.body3.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F);
        this.eye = new PCModelRenderer(this, 194, 50);
        this.eye.setRotationPoint(-1.0F, -0.8F, -2.0F);
        this.eye.addBox(0.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(eye, -0.17453292519943295F, 0.0F, 0.0F);
        this.eye_brow_left = new PCModelRenderer(this, 237, 61);
        this.eye_brow_left.setRotationPoint(1.0F, 1.0F, 0.01F);
        this.eye_brow_left.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(eye_brow_left, 0.0F, 0.0F, -0.2617993877991494F);
        this.leg_back_right2 = new PCModelRenderer(this, 74, 41);
        this.leg_back_right2.setRotationPoint(1.0F, -10.0F, 0.0F);
        this.leg_back_right2.addBox(-3.0F, 0.0F, -2.5F, 3, 10, 5, 0.0F);
        this.setRotateAngle(leg_back_right2, 0.0F, 0.0F, 0.9599310885968813F);
        this.mouth_up_inside = new PCModelRenderer(this, 235, 83);
        this.mouth_up_inside.setRotationPoint(-2.5F, 0.4F, -4.2F);
        this.mouth_up_inside.addBox(0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F);
        this.body_top_plate2.addChild(this.spike1);
        this.tooth_top_mid_left.addChild(this.tooth_top_mid_left_2);
        this.tooth_bottom_left.addChild(this.tooth_bottom_left_2);
        this.leg_back_right2.addChild(this.leg_back_right3);
        this.spike_7.addChild(this.spike_11);
        this.spike_holder_3.addChild(this.spike_15);
        this.leg_front_left_rotation_point.addChild(this.leg_front_left);
        this.head.addChild(this.tooth_top_mid_right);
        this.head_back_lid.addChild(this.head_back_lid_right);
        this.body_top_plate2.addChild(this.spike2);
        this.leg_front_left3.addChild(this.leg_front_left_4);
        this.mouth_bottom.addChild(this.tooth_bottom_left);
        this.spike_holder.addChild(this.spike_29);
        this.head_top.addChild(this.head_back_lid);
        this.body.addChild(this.body2);
        this.eye_brow.addChild(this.eye_brow_right);
        this.spike_24.addChild(this.spike_28);
        this.neck.addChild(this.neck_front);
        this.leg_front_left2.addChild(this.spike_21);
        this.head_back_lid.addChild(this.head_back_lid_left);
        this.head_top.addChild(this.eye_protection_right);
        this.shoulders_back.addChild(this.big_spike);
        this.tooth_bottom_mid.addChild(this.tooth_bottom_left_1);
        this.body.addChild(this.spike_holder);
        this.tooth_top_left.addChild(this.tooth_top_left_2);
        this.tooth_top_right.addChild(this.tooth_top_right_2);
        this.shoulders_front.addChild(this.shape49);
        this.leg_back_left3.addChild(this.leg_back_left_4);
        this.spike_holder_1.addChild(this.spike_32);
        this.body.addChild(this.spike_holder_1);
        this.leg_back_right2.addChild(this.spike_4);
        this.mouth_bottom_side_left.addChild(this.mouth_bottom_side_left_2);
        this.body_head_holder.addChild(this.neck);
        this.head_top.addChild(this.eye_protection_left);
        this.tooth_bottom_right.addChild(this.tooth_bottom_right_2);
        this.shoulders_back.addChild(this.shape47);
        this.mouth_bottom.addChild(this.mouth_bottom_lip_front);
        this.body.addChild(this.body_head_holder);
        this.leg_front_right3.addChild(this.spike_27);
        this.leg_front_left3.addChild(this.spike_22);
        this.leg_front_right3.addChild(this.leg_front_right4);
        this.body3.addChild(this.spike_holder_3);
        this.spike_19.addChild(this.spike_23);
        this.head.addChild(this.head_side_right);
        this.head.addChild(this.lip_up_1);
        this.body3.addChild(this.shoulders_back);
        this.shoulders_back.addChild(this.big_spike_1);
        this.body_top_plate.addChild(this.spike2_1);
        this.leg_front_right.addChild(this.leg_front_right_top);
        this.leg_back_right.addChild(this.leg_back_right_top);
        this.back_cover_top.addChild(this.big_spike_2);
        this.leg_back_right2.addChild(this.spike_2);
        this.head.addChild(this.mouth_left);
        this.head.addChild(this.head_side_left);
        this.head.addChild(this.mouth_right);
        this.tooth_top_mid_right.addChild(this.tooth_top_mid_right_2);
        this.shoulders_front.addChild(this.leg_front_right_rotation_point);
        this.leg_front_left.addChild(this.leg_front_left2);
        this.eye.addChild(this.eye_brow);
        this.shoulders_back.addChild(this.leg_back_right_rotation_point);
        this.body3.addChild(this.body_top_plate2);
        this.neck_bottom.addChild(this.head);
        this.eye.addChild(this.eye_ball);
        this.mouth_bottom.addChild(this.mouth_bottom_side_left);
        this.shoulders_back.addChild(this.shape48);
        this.spike_holder_2.addChild(this.spike_12);
        this.head.addChild(this.mouth_bottom);
        this.mouth_bottom.addChild(this.mouth_bottom_side_right);
        this.leg_back_right_rotation_point.addChild(this.leg_back_right);
        this.leg_front_right2.addChild(this.spike_25);
        this.head.addChild(this.head_top);
        this.leg_front_right.addChild(this.leg_front_right2);
        this.body2.addChild(this.body_bottom);
        this.head.addChild(this.tooth_top_mid_left);
        this.leg_front_left2.addChild(this.spike_19);
        this.leg_back_left2.addChild(this.spike_9);
        this.head.addChild(this.mouth_up_front);
        this.mouth_bottom_side_right.addChild(this.mouth_bottom_side_right_2);
        this.leg_front_left.addChild(this.leg_front_left_top);
        this.leg_front_right2.addChild(this.leg_front_right3);
        this.leg_front_right_rotation_point.addChild(this.leg_front_right);
        this.spike_holder.addChild(this.spike_30);
        this.big_spike.addChild(this.spike);
        this.leg_front_left2.addChild(this.leg_front_left3);
        this.spike_2.addChild(this.spike_6);
        this.spike_holder_1.addChild(this.spike_33);
        this.mouth_bottom.addChild(this.tooth_bottom_mid);
        this.spike_holder_3.addChild(this.spike_16);
        this.leg_back_right3.addChild(this.spike_5);
        this.spike_holder_3.addChild(this.spike_17);
        this.shoulders_back.addChild(this.leg_back_left_rotation_point);
        this.body_top_plate.addChild(this.spike1_1);
        this.spike_holder_1.addChild(this.spike_34);
        this.leg_back_left.addChild(this.leg_back_left2);
        this.big_spike_2.addChild(this.spike_18);
        this.head_top.addChild(this.head_back_con);
        this.body.addChild(this.body_top_plate);
        this.leg_front_right2.addChild(this.spike_24);
        this.leg_back_right3.addChild(this.leg_back_right4);
        this.tooth_bottom_mid.addChild(this.tooth_bottom_right_1);
        this.spike_holder_2.addChild(this.spike_14);
        this.leg_back_left2.addChild(this.spike_8);
        this.leg_back_right2.addChild(this.spike_3);
        this.neck.addChild(this.neck_bottom);
        this.body_top_plate2.addChild(this.spike3);
        this.leg_back_left2.addChild(this.leg_back_left3);
        this.head.addChild(this.tooth_top_left);
        this.head.addChild(this.tooth_top_right);
        this.big_spike_1.addChild(this.spike_1);
        this.leg_front_left2.addChild(this.spike_20);
        this.spike_holder_2.addChild(this.spike_13);
        this.lip_up_1.addChild(this.lip_up_2);
        this.body3.addChild(this.spike_holder_2);
        this.leg_front_right2.addChild(this.spike_26);
        this.leg_back_left.addChild(this.leg_back_left_top);
        this.leg_back_left2.addChild(this.spike_7);
        this.body3.addChild(this.back_cover_top);
        this.shoulders_front.addChild(this.shape50);
        this.mouth_bottom.addChild(this.tooth_bottom_right);
        this.body_top_plate.addChild(this.spike3_1);
        this.body.addChild(this.shoulders_front);
        this.shoulders_front.addChild(this.leg_front_left_rotation_point);
        this.leg_back_left3.addChild(this.spike_10);
        this.leg_back_left_rotation_point.addChild(this.leg_back_left);
        this.spike_holder.addChild(this.spike_31);
        this.body2.addChild(this.body3);
        this.head.addChild(this.eye);
        this.eye_brow.addChild(this.eye_brow_left);
        this.leg_back_right.addChild(this.leg_back_right2);
        this.head.addChild(this.mouth_up_inside);
        
//        bodyParts = new PCModelRenderer[] {body, body2, shoulders_front, body_top_plate, body_head_holder, spike_holder, spike_holder_1, body3, body_bottom, shoulders_back, body_top_plate2, spike_holder_2, spike_holder_3, back_cover_top, shape47, shape48, big_spike, big_spike_1, leg_back_right_rotation_point, leg_back_left_rotation_point, spike, spike_1, leg_back_right, leg_back_right2, leg_back_right_top, leg_back_right3, spike_2, spike_3, spike_4, leg_back_right4, spike_5, spike_6, leg_back_left, leg_back_left2, leg_back_left_top, leg_back_left3, spike_7, spike_8, spike_9, leg_back_left_4, spike_10, spike_11, spike2, spike1, spike3, spike_12, spike_13, spike_14, spike_15, spike_16, spike_17, big_spike_2, spike_18, shape49, shape50, leg_front_left_rotation_point, leg_front_right_rotation_point, leg_front_left, leg_front_left2, leg_front_left_top, leg_front_left3, spike_19, spike_20, spike_21, leg_front_left_4, spike_22, spike_23, leg_front_right, leg_front_right2, leg_front_right_top, leg_front_right3, spike_24, spike_25, spike_26, leg_front_right4, spike_27, spike_28, spike2_1, spike1_1, spike3_1, neck, neck_bottom, neck_front, head, eye, head_side_left, head_side_right, head_top, lip_up_1, mouth_left, mouth_right, mouth_up_front, mouth_up_inside, tooth_top_left, tooth_top_right, tooth_top_mid_right, tooth_top_mid_left, mouth_bottom, eye_ball, eye_brow, eye_brow_left, eye_brow_right, eye_protection_right, eye_protection_left, head_back_lid, head_back_con, head_back_lid_right, head_back_lid_left, lip_up_2, tooth_top_left_2, tooth_top_right_2, tooth_top_mid_right_2, tooth_top_mid_left_2, mouth_bottom_lip_front, tooth_bottom_mid, mouth_bottom_side_left, mouth_bottom_side_right, tooth_bottom_left, tooth_bottom_right, tooth_bottom_left_1, tooth_bottom_right_1, mouth_bottom_side_left_2, mouth_bottom_side_right_2, tooth_bottom_left_2, tooth_bottom_right_2, spike_29, spike_30, spike_31, spike_32, spike_33, spike_34};
        
        saveAllDefaultValues();//TODO Maybe replace with a different save method
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
    	matrixStackIn.push();
    	matrixStackIn.translate(0.0D, -0.1D, 0.0D);
    	matrixStackIn.scale(1.4F, 1.4F, 1.4F);
    	this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    	matrixStackIn.pop();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
    	modelRenderer.rotateAngleX = x;
    	modelRenderer.rotateAngleY = y;
    	modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
    	super.setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	
		if(entity.prevPosX != entity.getPosX() || entity.prevPosY != entity.getPosY() || entity.prevPosZ != entity.getPosZ()) //Walk Animation
    	{	
    		float globalHeight = 1;
    		float globalSpeed = 1.5F;
    		float globalDegree = 1;
    		
    		loadAllDefaultValues(); //TODO Maybe replace with a different load method
    		
    		//Makes the Head Rotate where the Entity is Looking
    		this.neck.rotateAngleY = (netHeadYaw * ((float)Math.PI / 180)) / 2;
    		this.head.rotateAngleY = (netHeadYaw * ((float)Math.PI / 180)) / 4;
    		this.head.rotateAngleZ = (netHeadYaw * ((float)Math.PI / 180)) / 4;
    		
    		bounce(body, 0.2F * globalSpeed, 3.0F * globalHeight, true, limbSwing, limbSwingAmount);
    		
    		//Head
    		swing(neck, 0.1F * globalSpeed, 0.2F * globalDegree, false, -0.2F, 0.05F, limbSwing, limbSwingAmount);
    		shake(neck, 0.2F * globalSpeed, 0.06F * globalDegree, true, -0.4F, 0.0F, limbSwing, limbSwingAmount);
    		swing(neck_front, 0.1F * globalSpeed, 0.2F * globalDegree, true, 0.2F, 0.0F, limbSwing, limbSwingAmount);
    		swing(head, 0.1F * globalSpeed, 0.2F * globalDegree, true, 0.6F, 0.0F, limbSwing, limbSwingAmount);
    		bounce(eye_ball, 0.1F * globalSpeed, -0.2F * globalHeight, false, limbSwing, limbSwingAmount);
    		bounce(eye_brow, 0.05F * globalSpeed, -0.3F * globalHeight, true, limbSwing, limbSwingAmount);
    		
    		//Mouth
    		swing(mouth_bottom, 0.3F * globalSpeed, 0.1F * globalDegree, false, 0.4F, 0.0F, limbSwing, limbSwingAmount);
    		
    		//Legs
    		shake(leg_front_left_rotation_point, 0.2F * globalSpeed, 0.5F * globalDegree, false, 0.3F, 0.0F, limbSwing, limbSwingAmount);
    		shake(leg_back_left_rotation_point, 0.2F * globalSpeed, 0.5F * globalDegree, true, 0.3F, 0.0F, limbSwing, limbSwingAmount);
    		shake(leg_back_right_rotation_point, 0.2F * globalSpeed, 0.5F * globalDegree, true, 0.3F, 0.0F, limbSwing, limbSwingAmount);
    		
    		flap(leg_front_left, 0.2F * globalSpeed, 0.5F * globalDegree, false, -1.0F, 0.08F, limbSwing, limbSwingAmount);
    		flap(leg_front_left2, 0.2F * globalSpeed, 0.5F * globalDegree, true, -0.8F, -0.34F, limbSwing, limbSwingAmount);
    		
    		flap(leg_back_left, 0.2F * globalSpeed, 0.5F * globalDegree, true, -1.0F, 0.08F, limbSwing, limbSwingAmount);
    		flap(leg_back_left2, 0.2F * globalSpeed, 0.5F * globalDegree, false, -0.8F, -0.34F, limbSwing, limbSwingAmount);
    		
    		flap(leg_front_right, 0.2F * globalSpeed, 0.5F * globalDegree, false, -1.0F, -0.08F, limbSwing, limbSwingAmount);
    		
    		flap(leg_back_right, 0.2F * globalSpeed, 0.5F * globalDegree, true, -1.0F, -0.08F, limbSwing, limbSwingAmount);
    		flap(leg_back_right2, 0.2F * globalSpeed, 0.5F * globalDegree, false, -0.8F, 0.34F, limbSwing, limbSwingAmount);
    		
    		//Body
    		swing(body, 0.4F * globalSpeed, 0.045F * globalDegree, false, 0.0F, 0.0F, limbSwing, limbSwingAmount);
    		shake(body, 0.2F * globalSpeed, 0.04F * globalDegree, false, 0.0F, 0.0F, limbSwing, limbSwingAmount);
    		shake(body3, 0.2F * globalSpeed, 0.1F * globalDegree, true, 0.0F, 0.0F, limbSwing, limbSwingAmount);
    		
    		//Front Right Leg
    		if(entity.getAttackTimer() == 0)
        	{
    			shake(leg_front_right_rotation_point, 0.2F * globalSpeed, 0.5F * globalDegree, false, 0.3F, 0.0F, limbSwing, limbSwingAmount);
    			flap(leg_front_right2, 0.2F * globalSpeed, 0.5F * globalDegree, true, -0.8F, 0.34F, limbSwing, limbSwingAmount);
        	}
    		else
    		{
    			limbSwing = entity.ticksExisted;
        		limbSwingAmount = 1;
        		
        		leg_front_right_rotation_point.rotateAngleX += -83;
        		flap(leg_front_right2, 0.1F, 0.4F, false, 3, 1.1F, limbSwing, limbSwingAmount);
        		shake(leg_front_right_rotation_point, 0.4F, 1.2F, false, -2, -1.2F, limbSwing, limbSwingAmount);
    		}
    	}
    	else //Else is Idle Animation
    	{
    		float globalHeight = 1;
    		float globalSpeed = 1F;
    		float globalDegree = 1;
    		
    		loadAllDefaultValues(); //TODO Maybe replace with a different load method
    		
    		//Makes the Head Rotate where the Entity is Looking
    		this.neck.rotateAngleY = (netHeadYaw * ((float)Math.PI / 180)) / 2;
    		this.head.rotateAngleY = (netHeadYaw * ((float)Math.PI / 180)) / 4;
    		this.head.rotateAngleZ = (netHeadYaw * ((float)Math.PI / 180)) / 4;
    	    this.neck.rotateAngleX = (headPitch * ((float)Math.PI / 180F)) / 2;
    		
    		limbSwing = entity.ticksExisted;
    		limbSwingAmount = 1;
    		
    		bounce(body, 0.2F * globalSpeed, 0.25F * globalHeight, false, limbSwing, limbSwingAmount);
    		
    		//Legs
    		flap(leg_front_left, 0.15F * globalSpeed, 0.05F * globalDegree, false, 2.5F, 0.1F, limbSwing, limbSwingAmount);
    		flap(leg_front_left2, 0.15F * globalSpeed, 0.05F * globalDegree, true, 2.5F, -0.1F, limbSwing, limbSwingAmount);
    		
    		flap(leg_back_left, 0.15F * globalSpeed, 0.05F * globalDegree, false, 0.0F, 0.1F, limbSwing, limbSwingAmount);
    		flap(leg_back_left2, 0.15F * globalSpeed, 0.05F * globalDegree, true, 0.0F, -0.1F, limbSwing, limbSwingAmount);
    		
    		flap(leg_front_right, 0.15F * globalSpeed, 0.05F * globalDegree, true, 2.5F, 0.1F, limbSwing, limbSwingAmount);
    		
    		flap(leg_back_right, 0.15F * globalSpeed, 0.05F * globalDegree, true, 0.0F, 0.1F, limbSwing, limbSwingAmount);
    		flap(leg_back_right2, 0.15F * globalSpeed, 0.05F * globalDegree, false, 0.0F, -0.1F, limbSwing, limbSwingAmount);
    		
    		//Head
    		swing(neck, 0.2F * globalSpeed, 0.04F * globalDegree, true, 0.0F, 0.0F, limbSwing, limbSwingAmount);
    		swing(neck_front, 0.2F * globalSpeed, 0.06F * globalDegree, false, 0.0F, -0.1F, limbSwing, limbSwingAmount);
    		swing(mouth_bottom, 0.15F * globalSpeed, 0.08F * globalDegree, false, 0.0F, 0.0F, limbSwing, limbSwingAmount);
    		bounce(eye_ball, 0.1F * globalSpeed, -0.1F * globalHeight, false, limbSwing, limbSwingAmount);
    		bounce(eye_brow, 0.07F * globalSpeed, -0.5F * globalHeight, true, limbSwing, limbSwingAmount);
    		
    		//Body
    		swing(body, 0.2F * globalSpeed, 0.012F * globalDegree, true, 0.0F, 0.0F, limbSwing, limbSwingAmount);
    		swing(body3, 0.2F * globalSpeed, 0.02F * globalDegree, false, 0.5F, 0.0F, limbSwing, limbSwingAmount);
    		
    		//Front Right Leg
    		if(entity.getAttackTimer() == 0)
        	{
    			flap(leg_front_right2, 0.15F * globalSpeed, 0.05F * globalDegree, false, 2.5F, -0.1F, limbSwing, limbSwingAmount);
        	}
    		else
    		{
    			limbSwing = entity.ticksExisted;
        		limbSwingAmount = 1;
        		
        		leg_front_right_rotation_point.rotateAngleX += -83;
        		flap(leg_front_right2, 0.1F, 0.4F, false, 3, 1.1F, limbSwing, limbSwingAmount);
        		shake(leg_front_right_rotation_point, 0.4F, 1.2F, false, -2, -1.2F, limbSwing, limbSwingAmount);
    		}
    	}
//	    }
    }
}
