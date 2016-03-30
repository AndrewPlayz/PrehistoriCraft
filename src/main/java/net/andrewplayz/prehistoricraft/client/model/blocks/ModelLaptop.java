package net.andrewplayz.prehistoricraft.client.model.blocks;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLaptop extends AdvancedModelBase {
    public AdvancedModelRenderer Laptopbase;
    public AdvancedModelRenderer Laptophinge;
    public AdvancedModelRenderer Rmousebutton;
    public AdvancedModelRenderer Lmousebutton;
    public AdvancedModelRenderer Keyboard;
    public AdvancedModelRenderer Mousepad;
    public AdvancedModelRenderer USB;
    public AdvancedModelRenderer Laptoplid;
    public AdvancedModelRenderer Laptopscreen;
    public AdvancedModelRenderer Antennae;

    public ModelLaptop() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Laptophinge = new AdvancedModelRenderer(this, 5, 45);
        this.Laptophinge.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Laptophinge.addBox(-7.5F, 0.0F, -1.0F, 15, 1, 1, 0.0F);
        this.Antennae = new AdvancedModelRenderer(this, 0, 0);
        this.Antennae.setRotationPoint(5.0F, -12.0F, -0.5F);
        this.Antennae.addBox(-0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F);
        this.Keyboard = new AdvancedModelRenderer(this, 5, 5);
        this.Keyboard.setRotationPoint(0.0F, -0.1F, -2.0F);
        this.Keyboard.addBox(-6.5F, 0.0F, -6.0F, 13, 1, 6, 0.0F);
        this.Mousepad = new AdvancedModelRenderer(this, 50, 40);
        this.Mousepad.setRotationPoint(0.0F, -0.1F, -8.3F);
        this.Mousepad.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F);
        this.USB = new AdvancedModelRenderer(this, 0, 0);
        this.USB.setRotationPoint(-9.5F, 1.0F, -5.0F);
        this.USB.addBox(0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.Laptoplid = new AdvancedModelRenderer(this, 5, 30);
        this.Laptoplid.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Laptoplid.addBox(-7.5F, -12.0F, -1.0F, 15, 12, 1, 0.0F);
        this.setRotateAngle(Laptoplid, -0.091106186954104F, 0.0F, 0.0F);
        this.Rmousebutton = new AdvancedModelRenderer(this, 50, 30);
        this.Rmousebutton.setRotationPoint(-0.05F, -0.1F, -11.5F);
        this.Rmousebutton.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Lmousebutton = new AdvancedModelRenderer(this, 50, 30);
        this.Lmousebutton.setRotationPoint(0.05F, -0.1F, -11.5F);
        this.Lmousebutton.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Laptopscreen = new AdvancedModelRenderer(this, 5, 16);
        this.Laptopscreen.setRotationPoint(-7.0F, -11.3F, -0.1F);
        this.Laptopscreen.addBox(0.0F, 0.0F, -1.0F, 14, 11, 1, 0.0F);
        this.Laptopbase = new AdvancedModelRenderer(this, 5, 49);
        this.Laptopbase.setRotationPoint(0.0F, 22.0F, 5.0F);
        this.Laptopbase.addBox(-7.5F, 0.0F, -12.0F, 15, 2, 12, 0.0F);
        this.Laptopbase.addChild(this.Laptophinge);
        this.Laptoplid.addChild(this.Antennae);
        this.Laptopbase.addChild(this.Keyboard);
        this.Laptopbase.addChild(this.Mousepad);
        this.Laptopbase.addChild(this.USB);
        this.Laptophinge.addChild(this.Laptoplid);
        this.Laptopbase.addChild(this.Rmousebutton);
        this.Laptopbase.addChild(this.Lmousebutton);
        this.Laptoplid.addChild(this.Laptopscreen);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Laptopbase.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
