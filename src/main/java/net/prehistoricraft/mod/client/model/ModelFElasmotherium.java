package net.prehistoricraft.mod.client.model;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Elasmotherium - Rocka
 * Created using Tabula 5.1.0
 */
public class ModelFElasmotherium extends MowzieModelBase {
    public ModelRenderer FrontBody;
    public ModelRenderer Thigh3;
    public ModelRenderer Thigh4;
    public ModelRenderer Thigh1;
    public ModelRenderer Thigh1_1;
    public ModelRenderer TailSection1;
    public ModelRenderer MiddleBody;
    public ModelRenderer NeckSection1;
    public ModelRenderer BackBody;
    public ModelRenderer Butt;
    public ModelRenderer NeckSection2;
    public ModelRenderer NeckSection3;
    public ModelRenderer Head;
    public ModelRenderer Mouth;
    public ModelRenderer HornSection1;
    public ModelRenderer HornSection2;
    public ModelRenderer HornSection3;
    public ModelRenderer Leg3Section1;
    public ModelRenderer Leg3Section2;
    public ModelRenderer Hoof3;
    public ModelRenderer Leg4Section1;
    public ModelRenderer Leg4Section2;
    public ModelRenderer Hoof4;
    public ModelRenderer Leg1Section1;
    public ModelRenderer Leg1Section2;
    public ModelRenderer Hoof1;
    public ModelRenderer Leg1Section1_1;
    public ModelRenderer Leg1Section2_1;
    public ModelRenderer Hoof1_1;
    public ModelRenderer TailSection2;

    public ModelFElasmotherium() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.MiddleBody = new ModelRenderer(this, 124, 37);
        this.MiddleBody.setRotationPoint(0.0F, 1.0F, 17.58F);
        this.MiddleBody.addBox(-13.5F, 0.0F, 0.0F, 27, 28, 20, 0.0F);
        this.setRotateAngle(MiddleBody, -0.182212373908208F, 0.0F, 0.0F);
        this.Thigh1_1 = new ModelRenderer(this, 78, 37);
        this.Thigh1_1.setRotationPoint(-18.0F, -15.0F, -21.0F);
        this.Thigh1_1.addBox(0.0F, 0.0F, 0.0F, 9, 23, 14, 0.0F);
        this.Head = new ModelRenderer(this, 196, 108);
        this.Head.setRotationPoint(-1.0F, 3.68F, -6.04F);
        this.Head.addBox(-5.0F, 0.0F, -11.0F, 14, 14, 11, 0.0F);
        this.setRotateAngle(Head, 0.136659280431156F, 0.0F, 0.0F);
        this.HornSection3 = new ModelRenderer(this, 74, 0);
        this.HornSection3.setRotationPoint(0.0F, -13.0F, -0.5F);
        this.HornSection3.addBox(-1.5F, -9.0F, -3.0F, 3, 15, 3, 0.0F);
        this.setRotateAngle(HornSection3, -0.18203784098300857F, 0.0F, 0.0F);
        this.Leg1Section2_1 = new ModelRenderer(this, 201, 133);
        this.Leg1Section2_1.setRotationPoint(4.0F, 8.06F, 0.25F);
        this.Leg1Section2_1.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(Leg1Section2_1, -0.22759093446006054F, 0.0F, 0.0F);
        this.Leg1Section2 = new ModelRenderer(this, 51, 132);
        this.Leg1Section2.setRotationPoint(4.0F, 8.06F, 0.25F);
        this.Leg1Section2.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(Leg1Section2, -0.22759093446006054F, 0.0F, 0.0F);
        this.Leg3Section2 = new ModelRenderer(this, 218, 74);
        this.Leg3Section2.setRotationPoint(4.0F, 9.76F, -0.05F);
        this.Leg3Section2.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(Leg3Section2, 0.22759093446006054F, 0.0F, 0.0F);
        this.HornSection1 = new ModelRenderer(this, 230, 0);
        this.HornSection1.setRotationPoint(2.0F, 1.79F, -7.32F);
        this.HornSection1.addBox(-3.0F, -9.0F, -6.0F, 6, 10, 6, 0.0F);
        this.setRotateAngle(HornSection1, 0.17453292519943295F, 0.0F, 0.0F);
        this.Leg4Section1 = new ModelRenderer(this, 0, 116);
        this.Leg4Section1.setRotationPoint(0.5F, 18.7F, 4.0F);
        this.Leg4Section1.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.setRotateAngle(Leg4Section1, -0.136659280431156F, 0.0F, 0.0F);
        this.Hoof4 = new ModelRenderer(this, 23, 125);
        this.Hoof4.setRotationPoint(0.0F, 8.12F, 4.0F);
        this.Hoof4.addBox(-4.5F, 0.0F, -4.5F, 9, 4, 9, 0.0F);
        this.setRotateAngle(Hoof4, -0.08726646259971647F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 198, 37);
        this.Mouth.setRotationPoint(2.0F, 2.0F, -11.0F);
        this.Mouth.addBox(-6.0F, 0.0F, -7.0F, 12, 12, 7, 0.0F);
        this.Butt = new ModelRenderer(this, 0, 180);
        this.Butt.setRotationPoint(0.5F, 0.43F, 16.19F);
        this.Butt.addBox(-12.5F, 0.0F, 0.0F, 25, 26, 6, 0.0F);
        this.NeckSection3 = new ModelRenderer(this, 0, 87);
        this.NeckSection3.setRotationPoint(-0.5F, 2.33F, -5.77F);
        this.NeckSection3.addBox(-7.0F, 0.0F, -7.0F, 17, 21, 8, 0.0F);
        this.setRotateAngle(NeckSection3, -0.09093165402890456F, 0.0F, 0.0F);
        this.Thigh1 = new ModelRenderer(this, 184, 0);
        this.Thigh1.setRotationPoint(10.0F, -15.0F, -21.0F);
        this.Thigh1.addBox(0.0F, 0.0F, 0.0F, 9, 23, 14, 0.0F);
        this.Hoof1_1 = new ModelRenderer(this, 0, 138);
        this.Hoof1_1.setRotationPoint(0.0F, 8.12F, 4.0F);
        this.Hoof1_1.addBox(-4.5F, 0.0F, -4.5F, 9, 4, 9, 0.0F);
        this.setRotateAngle(Hoof1_1, 0.08726646259971647F, 0.0F, 0.0F);
        this.NeckSection2 = new ModelRenderer(this, 145, 85);
        this.NeckSection2.setRotationPoint(-0.25F, 1.65F, -9.4F);
        this.NeckSection2.addBox(-10.0F, 0.0F, -7.0F, 22, 25, 9, 0.0F);
        this.setRotateAngle(NeckSection2, -0.091106186954104F, 0.0F, 0.0F);
        this.FrontBody = new ModelRenderer(this, 0, 0);
        this.FrontBody.setRotationPoint(0.0F, -19.5F, -23.5F);
        this.FrontBody.addBox(-14.0F, 0.0F, 0.0F, 28, 31, 18, 0.0F);
        this.setRotateAngle(FrontBody, 0.091106186954104F, 0.0F, 0.0F);
        this.Leg4Section2 = new ModelRenderer(this, 145, 119);
        this.Leg4Section2.setRotationPoint(4.0F, 9.76F, -0.05F);
        this.Leg4Section2.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(Leg4Section2, 0.22759093446006054F, 0.0F, 0.0F);
        this.NeckSection1 = new ModelRenderer(this, 0, 49);
        this.NeckSection1.setRotationPoint(-1.0F, 0.25F, 1.35F);
        this.NeckSection1.addBox(-12.0F, 0.0F, -10.0F, 26, 28, 10, 0.0F);
        this.setRotateAngle(NeckSection1, 0.18203784098300857F, 0.0F, 0.0F);
        this.TailSection2 = new ModelRenderer(this, 236, 31);
        this.TailSection2.setRotationPoint(0.0F, 7.0F, 1.0F);
        this.TailSection2.addBox(-1.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(TailSection2, -0.4553564018453205F, 0.0F, 0.0F);
        this.Hoof1 = new ModelRenderer(this, 83, 132);
        this.Hoof1.setRotationPoint(0.0F, 8.12F, 4.0F);
        this.Hoof1.addBox(-4.5F, 0.0F, -4.5F, 9, 4, 9, 0.0F);
        this.setRotateAngle(Hoof1, 0.08726646259971647F, 0.0F, 0.0F);
        this.Leg1Section1_1 = new ModelRenderer(this, 119, 132);
        this.Leg1Section1_1.setRotationPoint(0.5F, 19.7F, 3.0F);
        this.Leg1Section1_1.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.setRotateAngle(Leg1Section1_1, 0.136659280431156F, 0.0F, 0.0F);
        this.HornSection2 = new ModelRenderer(this, 230, 16);
        this.HornSection2.setRotationPoint(0.0F, -8.24F, -0.65F);
        this.HornSection2.addBox(-2.5F, -10.0F, -5.0F, 5, 10, 5, 0.0F);
        this.setRotateAngle(HornSection2, -0.17453292519943295F, 0.0F, 0.0F);
        this.BackBody = new ModelRenderer(this, 53, 85);
        this.BackBody.setRotationPoint(-0.5F, 0.15F, 16.8F);
        this.BackBody.addBox(-13.0F, 0.0F, 0.0F, 27, 28, 19, 0.0F);
        this.setRotateAngle(BackBody, 0.091106186954104F, 0.0F, 0.0F);
        this.Hoof3 = new ModelRenderer(this, 207, 91);
        this.Hoof3.setRotationPoint(0.0F, 8.12F, 4.0F);
        this.Hoof3.addBox(-4.5F, 0.0F, -4.5F, 9, 4, 9, 0.0F);
        this.setRotateAngle(Hoof3, -0.08726646259971647F, 0.0F, 0.0F);
        this.Thigh3 = new ModelRenderer(this, 92, 0);
        this.Thigh3.setRotationPoint(-9.0F, -15.0F, 14.0F);
        this.Thigh3.addBox(-9.0F, 0.0F, 0.0F, 9, 23, 14, 0.0F);
        this.Thigh4 = new ModelRenderer(this, 138, 0);
        this.Thigh4.setRotationPoint(9.0F, -15.0F, 14.0F);
        this.Thigh4.addBox(0.0F, 0.0F, 0.0F, 9, 23, 14, 0.0F);
        this.TailSection1 = new ModelRenderer(this, 0, 0);
        this.TailSection1.setRotationPoint(-0.5F, -12.5F, 30.5F);
        this.TailSection1.addBox(-1.5F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
        this.setRotateAngle(TailSection1, 0.6373942428283291F, 0.0F, 0.0F);
        this.Leg3Section1 = new ModelRenderer(this, 218, 56);
        this.Leg3Section1.setRotationPoint(-8.5F, 18.7F, 4.0F);
        this.Leg3Section1.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.setRotateAngle(Leg3Section1, -0.136659280431156F, 0.0F, 0.0F);
        this.Leg1Section1 = new ModelRenderer(this, 169, 128);
        this.Leg1Section1.setRotationPoint(0.5F, 19.7F, 3.0F);
        this.Leg1Section1.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.setRotateAngle(Leg1Section1, 0.136659280431156F, 0.0F, 0.0F);
        this.FrontBody.addChild(this.MiddleBody);
        this.NeckSection3.addChild(this.Head);
        this.HornSection2.addChild(this.HornSection3);
        this.Leg1Section1_1.addChild(this.Leg1Section2_1);
        this.Leg1Section1.addChild(this.Leg1Section2);
        this.Leg3Section1.addChild(this.Leg3Section2);
        this.Head.addChild(this.HornSection1);
        this.Thigh4.addChild(this.Leg4Section1);
        this.Leg4Section2.addChild(this.Hoof4);
        this.Head.addChild(this.Mouth);
        this.BackBody.addChild(this.Butt);
        this.NeckSection2.addChild(this.NeckSection3);
        this.Leg1Section2_1.addChild(this.Hoof1_1);
        this.NeckSection1.addChild(this.NeckSection2);
        this.Leg4Section1.addChild(this.Leg4Section2);
        this.FrontBody.addChild(this.NeckSection1);
        this.TailSection1.addChild(this.TailSection2);
        this.Leg1Section2.addChild(this.Hoof1);
        this.Thigh1_1.addChild(this.Leg1Section1_1);
        this.HornSection1.addChild(this.HornSection2);
        this.MiddleBody.addChild(this.BackBody);
        this.Leg3Section2.addChild(this.Hoof3);
        this.Thigh3.addChild(this.Leg3Section1);
        this.Thigh1.addChild(this.Leg1Section1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Thigh1_1.render(f5);
        this.Thigh1.render(f5);
        this.FrontBody.render(f5);
        this.Thigh3.render(f5);
        this.Thigh4.render(f5);
        this.TailSection1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}