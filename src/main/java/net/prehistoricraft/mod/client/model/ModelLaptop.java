package net.prehistoricraft.mod.client.model;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Laptop - PrehistoriCraft
 * Created using Tabula 4.1.1
 */
public class ModelLaptop extends MowzieModelBase {
    public ModelRenderer KeyboardBase;
    public ModelRenderer ScreenBase;
    public ModelRenderer Curve;
    public ModelRenderer Keyboard;
    public ModelRenderer SpaceBar;
    public ModelRenderer Screen;
    public ModelRenderer Airel1;
    public ModelRenderer Airel2;
    public ModelRenderer Key2;
    public ModelRenderer Key1;
    public ModelRenderer Key3;
    public ModelRenderer Key4;
    public ModelRenderer Key5;
    public ModelRenderer Key6;
    public ModelRenderer Key7;
    public ModelRenderer Key8;
    public ModelRenderer Key9;
    public ModelRenderer Kep10;
    public ModelRenderer Key11;
    public ModelRenderer Key12;
    public ModelRenderer Key13;
    public ModelRenderer Key14;
    public ModelRenderer Key15;
    public ModelRenderer Key16;
    public ModelRenderer Key17;
    public ModelRenderer Key18;
    public ModelRenderer Key19;
    public ModelRenderer Key20;
    public ModelRenderer Key21;
    public ModelRenderer Key22;
    public ModelRenderer Key23;
    public ModelRenderer Key24;

    public ModelLaptop() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Screen = new ModelRenderer(this, 0, 31);
        this.Screen.setRotationPoint(-6.5F, 13.5F, 2.99F);
        this.Screen.addBox(0.0F, 0.0F, 0.0F, 13, 9, 1, 0.0F);
        this.SpaceBar = new ModelRenderer(this, 37, 33);
        this.SpaceBar.setRotationPoint(-2.5F, 22.95F, -6.5F);
        this.SpaceBar.addBox(0.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
        this.Key21 = new ModelRenderer(this, 0, 0);
        this.Key21.setRotationPoint(0.25F, 22.85F, -2.0F);
        this.Key21.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Curve = new ModelRenderer(this, 0, 25);
        this.Curve.setRotationPoint(-7.0F, 24.0F, 2.0F);
        this.Curve.addBox(0.0F, 0.0F, 0.0F, 14, 1, 2, 0.0F);
        this.setRotateAngle(Curve, 0.7853981633974483F, 0.0F, 0.0F);
        this.Key4 = new ModelRenderer(this, 0, 0);
        this.Key4.setRotationPoint(-1.35F, 22.85F, 1.0F);
        this.Key4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key15 = new ModelRenderer(this, 0, 0);
        this.Key15.setRotationPoint(3.25F, 22.85F, -0.5F);
        this.Key15.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key12 = new ModelRenderer(this, 0, 0);
        this.Key12.setRotationPoint(-1.35F, 22.85F, -0.5F);
        this.Key12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.KeyboardBase = new ModelRenderer(this, 25, 51);
        this.KeyboardBase.setRotationPoint(-7.0F, 23.0F, -7.0F);
        this.KeyboardBase.addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        this.Key3 = new ModelRenderer(this, 0, 0);
        this.Key3.setRotationPoint(-2.85F, 22.85F, 1.0F);
        this.Key3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key18 = new ModelRenderer(this, 0, 0);
        this.Key18.setRotationPoint(-4.35F, 22.85F, -2.0F);
        this.Key18.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key8 = new ModelRenderer(this, 0, 0);
        this.Key8.setRotationPoint(4.75F, 22.85F, 1.0F);
        this.Key8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Airel2 = new ModelRenderer(this, 0, 16);
        this.Airel2.setRotationPoint(-4.5F, 7.0F, 3.6F);
        this.Airel2.addBox(0.0F, 0.0F, 0.0F, 1, 7, 0, 0.0F);
        this.Key9 = new ModelRenderer(this, 0, 0);
        this.Key9.setRotationPoint(-5.85F, 22.85F, -0.5F);
        this.Key9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.ScreenBase = new ModelRenderer(this, 0, 44);
        this.ScreenBase.setRotationPoint(-7.0F, 13.3F, 3.12F);
        this.ScreenBase.addBox(0.0F, 0.0F, 0.0F, 14, 10, 1, 0.0F);
        this.Key24 = new ModelRenderer(this, 0, 0);
        this.Key24.setRotationPoint(4.75F, 22.85F, -2.0F);
        this.Key24.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Kep10 = new ModelRenderer(this, 0, 0);
        this.Kep10.setRotationPoint(-4.35F, 22.85F, -0.5F);
        this.Kep10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key20 = new ModelRenderer(this, 0, 0);
        this.Key20.setRotationPoint(-1.35F, 22.85F, -2.0F);
        this.Key20.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key17 = new ModelRenderer(this, 0, 0);
        this.Key17.setRotationPoint(-5.85F, 22.85F, -2.0F);
        this.Key17.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Keyboard = new ModelRenderer(this, 33, 42);
        this.Keyboard.setRotationPoint(-6.5F, 22.95F, -2.5F);
        this.Keyboard.addBox(0.0F, 0.0F, 0.0F, 13, 1, 5, 0.0F);
        this.Key2 = new ModelRenderer(this, 0, 0);
        this.Key2.setRotationPoint(-4.35F, 22.85F, 1.0F);
        this.Key2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key1 = new ModelRenderer(this, 0, 0);
        this.Key1.setRotationPoint(-5.85F, 22.85F, 1.0F);
        this.Key1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key5 = new ModelRenderer(this, 0, 0);
        this.Key5.setRotationPoint(0.25F, 22.85F, 1.0F);
        this.Key5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key7 = new ModelRenderer(this, 0, 0);
        this.Key7.setRotationPoint(3.25F, 22.85F, 1.0F);
        this.Key7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key22 = new ModelRenderer(this, 0, 0);
        this.Key22.setRotationPoint(1.75F, 22.85F, -2.0F);
        this.Key22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key13 = new ModelRenderer(this, 0, 0);
        this.Key13.setRotationPoint(0.25F, 22.85F, -0.5F);
        this.Key13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key16 = new ModelRenderer(this, 0, 0);
        this.Key16.setRotationPoint(4.75F, 22.85F, -0.5F);
        this.Key16.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Airel1 = new ModelRenderer(this, 3, 18);
        this.Airel1.setRotationPoint(-6.0F, 9.0F, 3.6F);
        this.Airel1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F);
        this.Key6 = new ModelRenderer(this, 0, 0);
        this.Key6.setRotationPoint(1.75F, 22.85F, 1.0F);
        this.Key6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Key6, 0.0F, 0.0F, -0.0017453292519943296F);
        this.Key11 = new ModelRenderer(this, 0, 0);
        this.Key11.setRotationPoint(-2.85F, 22.85F, -0.5F);
        this.Key11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key14 = new ModelRenderer(this, 0, 0);
        this.Key14.setRotationPoint(1.75F, 22.85F, -0.5F);
        this.Key14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key19 = new ModelRenderer(this, 0, 0);
        this.Key19.setRotationPoint(-2.85F, 22.85F, -2.0F);
        this.Key19.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Key23 = new ModelRenderer(this, 0, 0);
        this.Key23.setRotationPoint(3.25F, 22.85F, -2.0F);
        this.Key23.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Screen.render(f5);
        this.SpaceBar.render(f5);
        this.Key21.render(f5);
        this.Curve.render(f5);
        this.Key4.render(f5);
        this.Key15.render(f5);
        this.Key12.render(f5);
        this.KeyboardBase.render(f5);
        this.Key3.render(f5);
        this.Key18.render(f5);
        this.Key8.render(f5);
        this.Airel2.render(f5);
        this.Key9.render(f5);
        this.ScreenBase.render(f5);
        this.Key24.render(f5);
        this.Kep10.render(f5);
        this.Key20.render(f5);
        this.Key17.render(f5);
        this.Keyboard.render(f5);
        this.Key2.render(f5);
        this.Key1.render(f5);
        this.Key5.render(f5);
        this.Key7.render(f5);
        this.Key22.render(f5);
        this.Key13.render(f5);
        this.Key16.render(f5);
        this.Airel1.render(f5);
        this.Key6.render(f5);
        this.Key11.render(f5);
        this.Key14.render(f5);
        this.Key19.render(f5);
        this.Key23.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void renderModel(float f){
    	this.Screen.render(f);
        this.SpaceBar.render(f);
        this.Key21.render(f);
        this.Curve.render(f);
        this.Key4.render(f);
        this.Key15.render(f);
        this.Key12.render(f);
        this.KeyboardBase.render(f);
        this.Key3.render(f);
        this.Key18.render(f);
        this.Key8.render(f);
        this.Airel2.render(f);
        this.Key9.render(f);
        this.ScreenBase.render(f);
        this.Key24.render(f);
        this.Kep10.render(f);
        this.Key20.render(f);
        this.Key17.render(f);
        this.Keyboard.render(f);
        this.Key2.render(f);
        this.Key1.render(f);
        this.Key5.render(f);
        this.Key7.render(f);
        this.Key22.render(f);
        this.Key13.render(f);
        this.Key16.render(f);
        this.Airel1.render(f);
        this.Key6.render(f);
        this.Key11.render(f);
        this.Key14.render(f);
        this.Key19.render(f);
        this.Key23.render(f);
    } 
}
