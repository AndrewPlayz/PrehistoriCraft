package net.andrewplayz.prehistoricraft.client.model.entities.troodon;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class TroodonMale extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer ShoulderR;
    public AdvancedModelRenderer ShoulderL;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer ThighR;
    public AdvancedModelRenderer ThighL;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tailfeathers1;
    public AdvancedModelRenderer LegR;
    public AdvancedModelRenderer HeelR;
    public AdvancedModelRenderer SoleR;
    public AdvancedModelRenderer ToesoleR2;
    public AdvancedModelRenderer ToesoleR1;
    public AdvancedModelRenderer ToesoleR3;
    public AdvancedModelRenderer ToelowerR2;
    public AdvancedModelRenderer ToetopR2;
    public AdvancedModelRenderer ToelowerR1;
    public AdvancedModelRenderer ToetopR1;
    public AdvancedModelRenderer ToelowerR3;
    public AdvancedModelRenderer ToetopR3;
    public AdvancedModelRenderer ClawR1;
    public AdvancedModelRenderer ClawR2;
    public AdvancedModelRenderer ClawR3;
    public AdvancedModelRenderer LegL;
    public AdvancedModelRenderer HeelL;
    public AdvancedModelRenderer SoleL;
    public AdvancedModelRenderer ToesoleL2;
    public AdvancedModelRenderer ToesoleL1;
    public AdvancedModelRenderer ToesoleL3;
    public AdvancedModelRenderer ToelowerL2;
    public AdvancedModelRenderer ToetopL2;
    public AdvancedModelRenderer ToelowerL1;
    public AdvancedModelRenderer ToetopL1;
    public AdvancedModelRenderer ToelowerL3;
    public AdvancedModelRenderer ToetopL3;
    public AdvancedModelRenderer ClawL1;
    public AdvancedModelRenderer ClawL2;
    public AdvancedModelRenderer ClawL3;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Jawupper;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Headtop;
    public AdvancedModelRenderer TeethupperL;
    public AdvancedModelRenderer TeethupperR;
    public AdvancedModelRenderer Teethupperfront;
    public AdvancedModelRenderer TeethlowerL;
    public AdvancedModelRenderer TeethlowerR;
    public AdvancedModelRenderer ArmR;
    public AdvancedModelRenderer HandR;
    public AdvancedModelRenderer ArmfeathersR;
    public AdvancedModelRenderer Finger2R;
    public AdvancedModelRenderer Finger1R;
    public AdvancedModelRenderer Finger3R;
    public AdvancedModelRenderer ArmL;
    public AdvancedModelRenderer HandL;
    public AdvancedModelRenderer ArmfeathersL;
    public AdvancedModelRenderer Finger2L;
    public AdvancedModelRenderer Finger1L;
    public AdvancedModelRenderer Finger3L;

    public TroodonMale() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.Head1 = new AdvancedModelRenderer(this, 50, 90);
        this.Head1.setRotationPoint(0.01F, -8.0F, 4.0F);
        this.Head1.addBox(-1.5F, -4.0F, -4.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Head1, 0.5009094953223726F, 0.0F, 0.0F);
        this.Finger1R = new AdvancedModelRenderer(this, 90, 100);
        this.Finger1R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Finger1R.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Finger1R, -0.6373942428283291F, 0.0F, 0.0F);
        this.ThighR = new AdvancedModelRenderer(this, 70, 115);
        this.ThighR.setRotationPoint(-4.0F, 3.0F, 5.0F);
        this.ThighR.addBox(0.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(ThighR, -0.31869712141416456F, 0.136659280431156F, 0.27314402793711257F);
        this.ArmfeathersL = new AdvancedModelRenderer(this, 60, 5);
        this.ArmfeathersL.setRotationPoint(-0.4F, 1.0F, -0.5F);
        this.ArmfeathersL.addBox(-1.0F, 0.0F, 0.0F, 1, 7, 3, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 5, 105);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyfront.addBox(-3.5F, 0.0F, -11.0F, 7, 9, 11, 0.0F);
        this.setRotateAngle(Bodyfront, 0.18203784098300857F, 0.0F, 0.0F);
        this.ToesoleL1 = new AdvancedModelRenderer(this, 70, 65);
        this.ToesoleL1.mirror = true;
        this.ToesoleL1.setRotationPoint(-0.5F, 2.0F, -0.5F);
        this.ToesoleL1.addBox(-1.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToesoleL1, 0.0F, -0.36425021489121656F, 0.0F);
        this.TeethupperL = new AdvancedModelRenderer(this, 0, 0);
        this.TeethupperL.setRotationPoint(1.5F, -2.0F, -2.0F);
        this.TeethupperL.addBox(0.0F, -5.0F, -1.0F, 0, 5, 1, 0.0F);
        this.ClawL2 = new AdvancedModelRenderer(this, 70, 40);
        this.ClawL2.setRotationPoint(0.0F, -0.6F, 0.1F);
        this.ClawL2.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ClawL2, 0.40980330836826856F, 0.0F, 0.0F);
        this.Teethupperfront = new AdvancedModelRenderer(this, 50, 20);
        this.Teethupperfront.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.Teethupperfront.addBox(-1.5F, 0.0F, -1.0F, 3, 0, 1, 0.0F);
        this.LegR = new AdvancedModelRenderer(this, 70, 100);
        this.LegR.setRotationPoint(0.9F, 7.0F, 0.0F);
        this.LegR.addBox(0.0F, 0.0F, 0.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(LegR, 0.9560913642424937F, 0.0F, -0.27314402793711257F);
        this.ToetopR2 = new AdvancedModelRenderer(this, 70, 55);
        this.ToetopR2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToetopR2.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(ToetopR2, 0.8196066167365371F, 0.0F, 0.0F);
        this.HandL = new AdvancedModelRenderer(this, 90, 90);
        this.HandL.mirror = true;
        this.HandL.setRotationPoint(-0.11F, 6.0F, -2.0F);
        this.HandL.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(HandL, 0.5009094953223726F, 0.0F, 0.0F);
        this.ToetopR1 = new AdvancedModelRenderer(this, 70, 55);
        this.ToetopR1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToetopR1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(ToetopR1, 0.8196066167365371F, 0.0F, 0.0F);
        this.ClawR1 = new AdvancedModelRenderer(this, 70, 40);
        this.ClawR1.setRotationPoint(-0.5F, 0.5F, -4.7F);
        this.ClawR1.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ClawR1, 0.27314402793711257F, 0.0F, 0.0F);
        this.Neck1 = new AdvancedModelRenderer(this, 50, 115);
        this.Neck1.setRotationPoint(0.0F, 6.0F, -11.0F);
        this.Neck1.addBox(-2.0F, -6.0F, 0.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(Neck1, 1.1383037381507017F, 0.0F, 0.0F);
        this.LegL = new AdvancedModelRenderer(this, 70, 100);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(-0.9F, 7.0F, 0.0F);
        this.LegL.addBox(-3.0F, 0.0F, 0.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(LegL, 0.9560913642424937F, 0.0F, 0.27314402793711257F);
        this.Finger3R = new AdvancedModelRenderer(this, 90, 70);
        this.Finger3R.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.Finger3R.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Finger3R, 0.5009094953223726F, 0.0F, 0.0F);
        this.ToesoleR3 = new AdvancedModelRenderer(this, 70, 65);
        this.ToesoleR3.setRotationPoint(1.5F, 2.0F, -0.5F);
        this.ToesoleR3.addBox(-1.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToesoleR3, 0.0F, -0.36425021489121656F, 0.0F);
        this.TeethlowerR = new AdvancedModelRenderer(this, 50, 40);
        this.TeethlowerR.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.TeethlowerR.addBox(-1.0F, -5.0F, 0.0F, 0, 5, 1, 0.0F);
        this.SoleR = new AdvancedModelRenderer(this, 70, 75);
        this.SoleR.setRotationPoint(-0.01F, 6.6F, -0.3F);
        this.SoleR.addBox(0.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(SoleR, 0.4804891430740389F, 0.0F, 0.0F);
        this.ToetopR3 = new AdvancedModelRenderer(this, 70, 55);
        this.ToetopR3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToetopR3.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(ToetopR3, 0.8196066167365371F, 0.0F, 0.0F);
        this.Finger2L = new AdvancedModelRenderer(this, 90, 80);
        this.Finger2L.mirror = true;
        this.Finger2L.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Finger2L.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Finger2L, 0.22759093446006054F, 0.0F, 0.0F);
        this.Neck2 = new AdvancedModelRenderer(this, 50, 100);
        this.Neck2.setRotationPoint(0.0F, -5.0F, 0.4F);
        this.Neck2.addBox(-1.5F, -8.0F, 0.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Neck2, -0.18203784098300857F, 0.0F, 0.0F);
        this.ToesoleR1 = new AdvancedModelRenderer(this, 70, 65);
        this.ToesoleR1.setRotationPoint(0.5F, 2.0F, -0.5F);
        this.ToesoleR1.addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToesoleR1, 0.0F, 0.36425021489121656F, 0.0F);
        this.ToelowerL3 = new AdvancedModelRenderer(this, 70, 45);
        this.ToelowerL3.setRotationPoint(0.01F, -1.0F, -0.1F);
        this.ToelowerL3.addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToelowerL3, 0.18203784098300857F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 5, 25);
        this.Tail3.setRotationPoint(0.0F, 0.2F, 9.0F);
        this.Tail3.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 13, 0.0F);
        this.setRotateAngle(Tail3, -0.020420352248333655F, 0.0F, 0.0F);
        this.ClawL3 = new AdvancedModelRenderer(this, 70, 40);
        this.ClawL3.setRotationPoint(0.0F, -0.6F, 0.1F);
        this.ClawL3.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ClawL3, 0.40980330836826856F, 0.0F, 0.0F);
        this.HeelL = new AdvancedModelRenderer(this, 70, 85);
        this.HeelL.setRotationPoint(-0.5F, 9.0F, 4.0F);
        this.HeelL.addBox(-2.0F, 0.0F, -3.0F, 2, 8, 3, 0.0F);
        this.setRotateAngle(HeelL, -1.0911798483468549F, 0.0F, 0.0F);
        this.ArmfeathersR = new AdvancedModelRenderer(this, 60, 5);
        this.ArmfeathersR.setRotationPoint(0.4F, 1.0F, -0.5F);
        this.ArmfeathersR.addBox(0.0F, 0.0F, 0.0F, 1, 7, 3, 0.0F);
        this.ToelowerR2 = new AdvancedModelRenderer(this, 70, 45);
        this.ToelowerR2.setRotationPoint(-0.01F, -1.0F, -0.1F);
        this.ToelowerR2.addBox(-0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToelowerR2, 0.18203784098300857F, 0.0F, 0.0F);
        this.ToelowerL2 = new AdvancedModelRenderer(this, 70, 45);
        this.ToelowerL2.setRotationPoint(0.01F, -1.0F, -0.1F);
        this.ToelowerL2.addBox(-0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToelowerL2, 0.18203784098300857F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 50, 55);
        this.Lowerjaw.setRotationPoint(0.0F, -3.5F, -2.9F);
        this.Lowerjaw.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.045553093477052F, 0.0F, 0.0F);
        this.HeelR = new AdvancedModelRenderer(this, 70, 85);
        this.HeelR.setRotationPoint(0.5F, 9.0F, 4.0F);
        this.HeelR.addBox(0.0F, 0.0F, -3.0F, 2, 8, 3, 0.0F);
        this.setRotateAngle(HeelR, -1.0911798483468549F, 0.0F, 0.0F);
        this.ShoulderL = new AdvancedModelRenderer(this, 90, 115);
        this.ShoulderL.setRotationPoint(3.5F, 5.2F, -8.0F);
        this.ShoulderL.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(ShoulderL, 0.40980330836826856F, 0.136659280431156F, -0.31869712141416456F);
        this.ToelowerR1 = new AdvancedModelRenderer(this, 70, 45);
        this.ToelowerR1.setRotationPoint(-0.01F, -1.0F, -0.1F);
        this.ToelowerR1.addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToelowerR1, 0.18203784098300857F, 0.0F, 0.0F);
        this.ToetopL1 = new AdvancedModelRenderer(this, 70, 55);
        this.ToetopL1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToetopL1.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(ToetopL1, 0.8196066167365371F, 0.0F, 0.0F);
        this.TeethupperR = new AdvancedModelRenderer(this, 50, 30);
        this.TeethupperR.setRotationPoint(-1.5F, -2.0F, -2.0F);
        this.TeethupperR.addBox(0.0F, -5.0F, -1.0F, 0, 5, 1, 0.0F);
        this.Finger1L = new AdvancedModelRenderer(this, 90, 100);
        this.Finger1L.mirror = true;
        this.Finger1L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Finger1L.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Finger1L, -0.6373942428283291F, 0.0F, 0.0F);
        this.Finger3L = new AdvancedModelRenderer(this, 90, 70);
        this.Finger3L.mirror = true;
        this.Finger3L.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.Finger3L.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Finger3L, 0.5009094953223726F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 5, 63);
        this.Tail1.setRotationPoint(0.0F, 0.3F, 10.5F);
        this.Tail1.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 9, 0.0F);
        this.setRotateAngle(Tail1, 0.136659280431156F, 0.0F, 0.0F);
        this.SoleL = new AdvancedModelRenderer(this, 70, 75);
        this.SoleL.setRotationPoint(0.01F, 6.6F, -0.3F);
        this.SoleL.addBox(-2.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(SoleL, 0.4804891430740389F, 0.0F, 0.0F);
        this.Headtop = new AdvancedModelRenderer(this, 50, 65);
        this.Headtop.setRotationPoint(0.0F, -1.0F, 1.1F);
        this.Headtop.addBox(-1.0F, -6.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Headtop, 0.17435839227423353F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 5, 5);
        this.Tail4.setRotationPoint(0.0F, 0.2F, 12.0F);
        this.Tail4.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 15, 0.0F);
        this.setRotateAngle(Tail4, -0.0439822971502571F, 0.0F, 0.0F);
        this.HandR = new AdvancedModelRenderer(this, 90, 90);
        this.HandR.setRotationPoint(0.01F, 6.0F, -2.0F);
        this.HandR.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(HandR, 0.5009094953223726F, 0.0F, 0.0F);
        this.Tailfeathers1 = new AdvancedModelRenderer(this, 75, 5);
        this.Tailfeathers1.setRotationPoint(0.0F, 1.0F, 7.0F);
        this.Tailfeathers1.addBox(-3.0F, 0.0F, 0.0F, 6, 1, 16, 0.0F);
        this.ClawR2 = new AdvancedModelRenderer(this, 70, 40);
        this.ClawR2.setRotationPoint(0.0F, -0.6F, 0.1F);
        this.ClawR2.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ClawR2, 0.40980330836826856F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 5, 45);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 8.0F);
        this.Tail2.addBox(-2.0F, 0.0F, 0.0F, 4, 6, 10, 0.0F);
        this.ToelowerR3 = new AdvancedModelRenderer(this, 70, 45);
        this.ToelowerR3.setRotationPoint(-0.01F, -1.0F, -0.1F);
        this.ToelowerR3.addBox(-1.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToelowerR3, 0.18203784098300857F, 0.0F, 0.0F);
        this.ToesoleL2 = new AdvancedModelRenderer(this, 70, 65);
        this.ToesoleL2.mirror = true;
        this.ToesoleL2.setRotationPoint(-1.0F, 2.0F, -1.0F);
        this.ToesoleL2.addBox(-0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.ArmR = new AdvancedModelRenderer(this, 90, 105);
        this.ArmR.setRotationPoint(0.1F, 4.7F, 3.0F);
        this.ArmR.addBox(0.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(ArmR, -1.0471975511965976F, 0.0F, 0.0F);
        this.ToelowerL1 = new AdvancedModelRenderer(this, 70, 45);
        this.ToelowerL1.setRotationPoint(0.01F, -1.0F, -0.1F);
        this.ToelowerL1.addBox(-1.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToelowerL1, 0.18203784098300857F, 0.0F, 0.0F);
        this.Jawupper = new AdvancedModelRenderer(this, 50, 80);
        this.Jawupper.setRotationPoint(-0.01F, -3.0F, -1.0F);
        this.Jawupper.addBox(-1.5F, -7.0F, -2.0F, 3, 7, 2, 0.0F);
        this.setRotateAngle(Jawupper, 0.091106186954104F, 0.0F, 0.0F);
        this.ClawL1 = new AdvancedModelRenderer(this, 70, 40);
        this.ClawL1.setRotationPoint(0.5F, 0.5F, -4.7F);
        this.ClawL1.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ClawL1, 0.27314402793711257F, 0.0F, 0.0F);
        this.TeethlowerL = new AdvancedModelRenderer(this, 50, 40);
        this.TeethlowerL.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.TeethlowerL.addBox(0.0F, -5.0F, 0.0F, 0, 5, 1, 0.0F);
        this.Bodyback = new AdvancedModelRenderer(this, 5, 80);
        this.Bodyback.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyback.addBox(-4.0F, 0.0F, 0.0F, 8, 10, 12, 0.0F);
        this.setRotateAngle(Bodyback, -0.18203784098300857F, 0.0F, 0.0F);
        this.ShoulderR = new AdvancedModelRenderer(this, 90, 115);
        this.ShoulderR.setRotationPoint(-3.5F, 5.2F, -8.0F);
        this.ShoulderR.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(ShoulderR, 0.40980330836826856F, -0.136659280431156F, 0.31869712141416456F);
        this.ToetopL3 = new AdvancedModelRenderer(this, 70, 55);
        this.ToetopL3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToetopL3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(ToetopL3, 0.8196066167365371F, 0.0F, 0.0F);
        this.ArmL = new AdvancedModelRenderer(this, 90, 105);
        this.ArmL.setRotationPoint(-0.1F, 4.7F, 3.0F);
        this.ArmL.addBox(-2.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(ArmL, -1.0471975511965976F, 0.0F, 0.0F);
        this.ToesoleL3 = new AdvancedModelRenderer(this, 70, 65);
        this.ToesoleL3.mirror = true;
        this.ToesoleL3.setRotationPoint(-1.5F, 2.0F, -0.5F);
        this.ToesoleL3.addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(ToesoleL3, 0.0F, 0.36425021489121656F, -0.01012290966156711F);
        this.ToetopL2 = new AdvancedModelRenderer(this, 70, 55);
        this.ToetopL2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToetopL2.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(ToetopL2, 0.8196066167365371F, 0.0F, 0.0F);
        this.Finger2R = new AdvancedModelRenderer(this, 90, 80);
        this.Finger2R.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Finger2R.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Finger2R, 0.22759093446006054F, 0.0F, 0.0F);
        this.ThighL = new AdvancedModelRenderer(this, 70, 115);
        this.ThighL.mirror = true;
        this.ThighL.setRotationPoint(4.0F, 3.0F, 5.0F);
        this.ThighL.addBox(-4.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(ThighL, -0.31869712141416456F, -0.136659280431156F, -0.27314402793711257F);
        this.ToesoleR2 = new AdvancedModelRenderer(this, 70, 65);
        this.ToesoleR2.setRotationPoint(1.0F, 2.0F, -1.0F);
        this.ToesoleR2.addBox(-0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.ClawR3 = new AdvancedModelRenderer(this, 70, 40);
        this.ClawR3.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.ClawR3.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ClawR3, 0.40980330836826856F, 0.0F, 0.0F);
        this.Neck2.addChild(this.Head1);
        this.HandR.addChild(this.Finger1R);
        this.Bodyback.addChild(this.ThighR);
        this.ArmL.addChild(this.ArmfeathersL);
        this.SoleL.addChild(this.ToesoleL1);
        this.Jawupper.addChild(this.TeethupperL);
        this.ClawL1.addChild(this.ClawL2);
        this.Jawupper.addChild(this.Teethupperfront);
        this.ThighR.addChild(this.LegR);
        this.ToelowerR2.addChild(this.ToetopR2);
        this.ArmL.addChild(this.HandL);
        this.ToelowerR1.addChild(this.ToetopR1);
        this.ToelowerR3.addChild(this.ClawR1);
        this.Bodyfront.addChild(this.Neck1);
        this.ThighL.addChild(this.LegL);
        this.HandR.addChild(this.Finger3R);
        this.SoleR.addChild(this.ToesoleR3);
        this.Lowerjaw.addChild(this.TeethlowerR);
        this.HeelR.addChild(this.SoleR);
        this.ToelowerR3.addChild(this.ToetopR3);
        this.HandL.addChild(this.Finger2L);
        this.Neck1.addChild(this.Neck2);
        this.SoleR.addChild(this.ToesoleR1);
        this.ToesoleL3.addChild(this.ToelowerL3);
        this.Tail2.addChild(this.Tail3);
        this.ClawL2.addChild(this.ClawL3);
        this.LegL.addChild(this.HeelL);
        this.ArmR.addChild(this.ArmfeathersR);
        this.ToesoleR2.addChild(this.ToelowerR2);
        this.ToesoleL2.addChild(this.ToelowerL2);
        this.Head1.addChild(this.Lowerjaw);
        this.LegR.addChild(this.HeelR);
        this.Bodyfront.addChild(this.ShoulderL);
        this.ToesoleR1.addChild(this.ToelowerR1);
        this.ToelowerL1.addChild(this.ToetopL1);
        this.Jawupper.addChild(this.TeethupperR);
        this.HandL.addChild(this.Finger1L);
        this.HandL.addChild(this.Finger3L);
        this.Bodyback.addChild(this.Tail1);
        this.HeelL.addChild(this.SoleL);
        this.Jawupper.addChild(this.Headtop);
        this.Tail3.addChild(this.Tail4);
        this.ArmR.addChild(this.HandR);
        this.Tail4.addChild(this.Tailfeathers1);
        this.ClawR1.addChild(this.ClawR2);
        this.Tail1.addChild(this.Tail2);
        this.ToesoleR3.addChild(this.ToelowerR3);
        this.SoleL.addChild(this.ToesoleL2);
        this.ShoulderR.addChild(this.ArmR);
        this.ToesoleL1.addChild(this.ToelowerL1);
        this.Head1.addChild(this.Jawupper);
        this.ToelowerL3.addChild(this.ClawL1);
        this.Lowerjaw.addChild(this.TeethlowerL);
        this.Bodyfront.addChild(this.Bodyback);
        this.Bodyfront.addChild(this.ShoulderR);
        this.ToelowerL3.addChild(this.ToetopL3);
        this.ShoulderL.addChild(this.ArmL);
        this.SoleL.addChild(this.ToesoleL3);
        this.ToelowerL2.addChild(this.ToetopL2);
        this.HandR.addChild(this.Finger2R);
        this.Bodyback.addChild(this.ThighL);
        this.SoleR.addChild(this.ToesoleR2);
        this.ClawR2.addChild(this.ClawR3);
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Bodyfront.render(f5);
        this.setLivingAnimations((EntityLivingBase) entity, f, f1, f2);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float rotation, float rotationYaw, float rotationPitch, float partialTicks, Entity entity){
        resetToDefaultPose();
        this.faceTarget(rotationYaw, rotationPitch, 1.0F, Neck1, Neck2, Head1);

        /*
        limbSwing = tileentity.ticksExisted;
        limbSwingAmount = 0.5F;
        */

        float globalSpeed = 1.0F;
        float globalHeight = 1.0F;
        float globalDegree = 1.0F;


        //Idle Animations
        //Neck
        walk(Neck1, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, entity.ticksExisted, 1);
        walk(Neck2, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, entity.ticksExisted, 1);

        //Head
        walk(Head1, 0.1F, 0.0F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        walk(Lowerjaw, 0.1F, 0.0F * globalHeight, true, 0.0F, -0.15F, entity.ticksExisted, 1);
        walk(Jawupper, 0.1F, 0.0F * globalHeight, true, 0.0F, -0.15F, entity.ticksExisted, 1);

        //Tail
        swing(Tail1, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        swing(Tail2, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        swing(Tail3, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        swing(Tail4, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);

        //Left Arm
        walk(ShoulderL, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(ArmL, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(HandL, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);

        flap(ShoulderL, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(ArmL, 0.1F, 0.04F * globalHeight, true, -0.5F, 0.0F, entity.ticksExisted, 1);
        flap(HandL, 0.1F, 0.04F * globalHeight, true, -0.5F, 0.0F, entity.ticksExisted, 1);

        //Right Arm
        walk(ShoulderR, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(ArmR, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(HandR, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);

        flap(ShoulderR, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(ArmR, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(HandR, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);


        //Walking Animations
        //Body
        bob(Bodyback, 0.8F * globalSpeed, 0.6F * globalHeight, false, limbSwing, limbSwingAmount);
        bob(Bodyfront, 0.8F * globalSpeed, 0.8F * globalHeight, false, limbSwing, limbSwingAmount);

        //Right Leg
        walk(ThighR, 0.4F* globalSpeed, 0.5F * globalHeight, false, 0.0F, -0.1F, limbSwing, limbSwingAmount);
        walk(LegR, 0.4F* globalSpeed, 0.5F * globalHeight, false, -1.5F, 0.2F, limbSwing, limbSwingAmount);
        walk(SoleR, 0.4F* globalSpeed, 0.5F * globalHeight, false, -4.0F, -0.05F, limbSwing, limbSwingAmount);

        //Left Leg
        walk(ThighL, 0.4F* globalSpeed, 0.5F * globalHeight, true, 0.0F, 0.1F, limbSwing, limbSwingAmount);
        walk(LegL, 0.4F* globalSpeed, 0.5F * globalHeight, true, -1.5F, -0.2F, limbSwing, limbSwingAmount);
        walk(SoleL, 0.4F* globalSpeed, 0.5F * globalHeight, true, -4.0F, 0.05F, limbSwing, limbSwingAmount);

        //Left Arm
        walk(ShoulderL, 0.4F* globalSpeed, 0.1F * globalHeight, false, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(ArmL, 0.4F* globalSpeed, 0.1F * globalHeight, false, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(HandL, 0.4F* globalSpeed, 0.1F * globalHeight, false, 0.5F, 0.0F, limbSwing, limbSwingAmount);

        flap(ShoulderL, 0.4F* globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(ArmL, 0.4F* globalSpeed, 0.08F * globalHeight, true, -0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(HandL, 0.4F* globalSpeed, 0.08F * globalHeight, true, -0.5F, 0.0F, limbSwing, limbSwingAmount);

        //Right Arm
        walk(ShoulderR, 0.4F* globalSpeed, 0.1F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(ArmR, 0.4F* globalSpeed, 0.1F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(HandR, 0.4F* globalSpeed, 0.1F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);

        flap(ShoulderR, 0.4F* globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(ArmR, 0.4F* globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(HandR, 0.4F* globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);

        //Neck
        walk(Neck1, 0.8F* globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Neck2, 0.8F* globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);

        //Head
        walk(Head1, 0.8F* globalSpeed, 0.0F * globalHeight, true, 0.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Lowerjaw, 0.8F* globalSpeed, 0.0F * globalHeight, true, 0.0F, -0.15F, limbSwing, limbSwingAmount);
        walk(Jawupper, 0.8F* globalSpeed, 0.0F * globalHeight, true, 0.0F, -0.15F, limbSwing, limbSwingAmount);

        //Tail
        swing(Tail1, 0.2F * globalSpeed, 0.25F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail2, 0.2F * globalSpeed, 0.25F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail3, 0.2F * globalSpeed, 0.25F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail4, 0.2F * globalSpeed, 0.25F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
    }
}
