package net.andrewplayz.prehistoricraft.client.model.entities.tenontosaurus;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;

public class TenontosaurusMale extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Lshoulder;
    public AdvancedModelRenderer Rshoulder;
    public AdvancedModelRenderer Lhip;
    public AdvancedModelRenderer Rhip;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer Neck3;
    public AdvancedModelRenderer Neck4;
    public AdvancedModelRenderer Neck5;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Snout;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Lupperarm;
    public AdvancedModelRenderer Llowerarm;
    public AdvancedModelRenderer Lfingermid;
    public AdvancedModelRenderer Lfingerright;
    public AdvancedModelRenderer Lfingerleft;
    public AdvancedModelRenderer Lthumb;
    public AdvancedModelRenderer Rupperarm;
    public AdvancedModelRenderer Rlowerarm;
    public AdvancedModelRenderer Rfingermid;
    public AdvancedModelRenderer Rfingerleft;
    public AdvancedModelRenderer Rfingerright;
    public AdvancedModelRenderer Rthumb;
    public AdvancedModelRenderer Lleg;
    public AdvancedModelRenderer Llowerleg;
    public AdvancedModelRenderer Ltoetop2;
    public AdvancedModelRenderer Ltoetop3;
    public AdvancedModelRenderer Ltoetop1;
    public AdvancedModelRenderer Lfoot;
    public AdvancedModelRenderer Ltoemid2;
    public AdvancedModelRenderer Ltoesole2;
    public AdvancedModelRenderer Ltoemid3;
    public AdvancedModelRenderer Ltoesole3;
    public AdvancedModelRenderer Ltoemid1;
    public AdvancedModelRenderer Ltoesole1;
    public AdvancedModelRenderer Rleg;
    public AdvancedModelRenderer Rlowerleg;
    public AdvancedModelRenderer Rtoetop2;
    public AdvancedModelRenderer Rtoetop3;
    public AdvancedModelRenderer Rtoetop1;
    public AdvancedModelRenderer Rfoot;
    public AdvancedModelRenderer Rtoemid2;
    public AdvancedModelRenderer Rtoesole2;
    public AdvancedModelRenderer Rtoemid3;
    public AdvancedModelRenderer Rtoesole3;
    public AdvancedModelRenderer Rtoemid1;
    public AdvancedModelRenderer Rtoesole1;

    public TenontosaurusMale() {
        this.textureWidth = 512;
        this.textureHeight = 256;
        this.Rtoesole3 = new AdvancedModelRenderer(this, 420, 0);
        this.Rtoesole3.setRotationPoint(0.01F, 1.9F, 0.5F);
        this.Rtoesole3.addBox(-2.0F, 0.0F, -4.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Rtoesole3, -0.4883431247080134F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 35);
        this.Tail3.setRotationPoint(0.0F, 0.1F, 21.0F);
        this.Tail3.addBox(-3.5F, 0.0F, 0.0F, 7, 9, 22, 0.0F);
        this.setRotateAngle(Tail3, 0.091106186954104F, 0.0F, 0.0F);
        this.Rhip = new AdvancedModelRenderer(this, 200, 210);
        this.Rhip.setRotationPoint(-6.0F, -16.0F, 15.0F);
        this.Rhip.addBox(-7.0F, 0.0F, 0.0F, 7, 16, 11, 0.0F);
        this.setRotateAngle(Rhip, -0.22759093446006054F, 0.0F, 0.0F);
        this.Lfingermid = new AdvancedModelRenderer(this, 500, 0);
        this.Lfingermid.setRotationPoint(2.0F, 13.0F, 0.0F);
        this.Lfingermid.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lfingermid, 0.4553564018453205F, 0.0F, 0.0F);
        this.Rlowerleg = new AdvancedModelRenderer(this, 200, 150);
        this.Rlowerleg.setRotationPoint(0.12F, 18.1F, 7.0F);
        this.Rlowerleg.addBox(-5.0F, -5.0F, -15.0F, 5, 5, 15, 0.0F);
        this.setRotateAngle(Rlowerleg, 0.5009094953223726F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 70);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 20.0F);
        this.Tail2.addBox(-4.5F, 0.0F, 0.0F, 9, 11, 22, 0.0F);
        this.setRotateAngle(Tail2, -0.091106186954104F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 160, 160);
        this.Lowerjaw.setRotationPoint(0.0F, 5.0F, -7.0F);
        this.Lowerjaw.addBox(-2.0F, 0.0F, -10.0F, 4, 2, 10, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.045553093477052F, 0.0F, 0.0F);
        this.Ltoemid3 = new AdvancedModelRenderer(this, 480, 20);
        this.Ltoemid3.setRotationPoint(0.01F, 0.0F, -4.0F);
        this.Ltoemid3.addBox(0.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Ltoemid3, -0.36425021489121656F, 0.0F, 0.0F);
        this.Rtoemid3 = new AdvancedModelRenderer(this, 480, 20);
        this.Rtoemid3.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.Rtoemid3.addBox(-2.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Rtoemid3, -0.36425021489121656F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 110);
        this.Tail1.setRotationPoint(0.0F, 0.1F, 24.0F);
        this.Tail1.addBox(-6.5F, 0.0F, 0.0F, 13, 15, 20, 0.0F);
        this.setRotateAngle(Tail1, -0.22759093446006054F, 0.0F, 0.0F);
        this.Rleg = new AdvancedModelRenderer(this, 210, 180);
        this.Rleg.setRotationPoint(-1.01F, 16.0F, 0.0F);
        this.Rleg.addBox(-5.0F, 0.0F, 0.0F, 5, 18, 7, 0.0F);
        this.setRotateAngle(Rleg, 0.9105382707654417F, 0.0F, 0.0F);
        this.Rfoot = new AdvancedModelRenderer(this, 440, 0);
        this.Rfoot.setRotationPoint(-2.49F, 0.0F, -13.0F);
        this.Rfoot.addBox(-2.5F, -5.0F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(Rfoot, 0.40980330836826856F, 0.0F, 0.0F);
        this.Head1 = new AdvancedModelRenderer(this, 160, 186);
        this.Head1.setRotationPoint(-0.05F, 0.0F, -7.0F);
        this.Head1.addBox(-2.5F, 0.0F, -9.0F, 5, 8, 9, 0.0F);
        this.setRotateAngle(Head1, 0.31869712141416456F, 0.0F, 0.0F);
        this.Neck4 = new AdvancedModelRenderer(this, 0, 0);
        this.Neck4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Ltoesole3 = new AdvancedModelRenderer(this, 420, 0);
        this.Ltoesole3.setRotationPoint(0.01F, 1.9F, 0.5F);
        this.Ltoesole3.addBox(0.0F, 0.0F, -4.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Ltoesole3, -0.4883431247080134F, 0.0F, 0.01884955592153876F);
        this.Rupperarm = new AdvancedModelRenderer(this, 250, 195);
        this.Rupperarm.setRotationPoint(-0.5F, 9.0F, 1.0F);
        this.Rupperarm.addBox(-5.0F, 0.0F, 0.0F, 5, 13, 6, 0.0F);
        this.setRotateAngle(Rupperarm, -0.18203784098300857F, 0.0F, 0.0F);
        this.Bodyback = new AdvancedModelRenderer(this, 0, 150);
        this.Bodyback.setRotationPoint(0.0F, 0.0F, 20.0F);
        this.Bodyback.addBox(-8.0F, 0.0F, 0.0F, 16, 18, 25, 0.0F);
        this.setRotateAngle(Bodyback, -0.27314402793711257F, 0.0F, 0.0F);
        this.Rlowerarm = new AdvancedModelRenderer(this, 250, 160);
        this.Rlowerarm.setRotationPoint(-0.55F, 9.0F, 4.3F);
        this.Rlowerarm.addBox(-4.0F, 0.0F, 0.0F, 4, 13, 4, 0.0F);
        this.setRotateAngle(Rlowerarm, -1.4114477660878142F, 0.0F, 0.0F);
        this.Rfingermid = new AdvancedModelRenderer(this, 500, 0);
        this.Rfingermid.setRotationPoint(-2.0F, 13.0F, 0.0F);
        this.Rfingermid.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Rfingermid, 0.4553564018453205F, 0.0F, 0.0F);
        this.Snout = new AdvancedModelRenderer(this, 165, 100);
        this.Snout.setRotationPoint(0.0F, 0.2F, -9.0F);
        this.Snout.addBox(-2.0F, 0.0F, -9.0F, 4, 5, 9, 0.0F);
        this.setRotateAngle(Snout, 0.091106186954104F, 0.0F, 0.0F);
        this.Ltoetop1 = new AdvancedModelRenderer(this, 497, 9);
        this.Ltoetop1.setRotationPoint(2.0F, -5.0F, -11.4F);
        this.Ltoetop1.addBox(-2.0F, 0.0F, -5.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Ltoetop1, -0.36425021489121656F, 0.136659280431156F, -0.27314402793711257F);
        this.Ltoemid1 = new AdvancedModelRenderer(this, 480, 20);
        this.Ltoemid1.setRotationPoint(-0.99F, 0.0F, -4.0F);
        this.Ltoemid1.addBox(-1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Ltoemid1, -0.36425021489121656F, 0.0F, 0.0F);
        this.Neck1 = new AdvancedModelRenderer(this, 100, 170);
        this.Neck1.setRotationPoint(0.0F, 2.0F, 5.0F);
        this.Neck1.addBox(-6.0F, 0.0F, -8.0F, 12, 16, 10, 0.0F);
        this.setRotateAngle(Neck1, -0.36425021489121656F, 0.0F, 0.0F);
        this.Rtoemid2 = new AdvancedModelRenderer(this, 480, 20);
        this.Rtoemid2.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.Rtoemid2.addBox(-1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Rtoemid2, -0.31869712141416456F, 0.0F, 0.0F);
        this.Llowerleg = new AdvancedModelRenderer(this, 200, 150);
        this.Llowerleg.mirror = true;
        this.Llowerleg.setRotationPoint(-0.12F, 18.1F, 7.0F);
        this.Llowerleg.addBox(0.0F, -5.0F, -15.0F, 5, 5, 15, 0.0F);
        this.setRotateAngle(Llowerleg, 0.5009094953223726F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 200);
        this.Bodyfront.setRotationPoint(0.0F, -8.0F, -17.0F);
        this.Bodyfront.addBox(-9.0F, 0.0F, 0.0F, 18, 20, 20, 0.0F);
        this.setRotateAngle(Bodyfront, 0.40980330836826856F, 0.0F, 0.0F);
        this.Lfingerright = new AdvancedModelRenderer(this, 490, 0);
        this.Lfingerright.setRotationPoint(0.5F, 12.8F, 0.0F);
        this.Lfingerright.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Lfingerright, 0.5462880558742251F, 0.0F, 0.27314402793711257F);
        this.Neck3 = new AdvancedModelRenderer(this, 100, 100);
        this.Neck3.setRotationPoint(0.0F, 0.5F, -6.0F);
        this.Neck3.addBox(-3.0F, 0.0F, -7.0F, 6, 11, 8, 0.0F);
        this.setRotateAngle(Neck3, -0.27314402793711257F, 0.0F, 0.0F);
        this.Lshoulder = new AdvancedModelRenderer(this, 250, 220);
        this.Lshoulder.mirror = true;
        this.Lshoulder.setRotationPoint(7.0F, 0.0F, -12.0F);
        this.Lshoulder.addBox(0.0F, 0.0F, 0.0F, 6, 12, 8, 0.0F);
        this.setRotateAngle(Lshoulder, 0.6829473363053812F, 0.0F, 0.0F);
        this.Rfingerright = new AdvancedModelRenderer(this, 490, 0);
        this.Rfingerright.setRotationPoint(-3.5F, 12.8F, 0.0F);
        this.Rfingerright.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Rfingerright, 0.5462880558742251F, 0.0F, 0.27314402793711257F);
        this.Rtoemid1 = new AdvancedModelRenderer(this, 480, 20);
        this.Rtoemid1.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.Rtoemid1.addBox(0.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Rtoemid1, -0.36425021489121656F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 21.0F);
        this.Tail4.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 24, 0.0F);
        this.Ltoesole2 = new AdvancedModelRenderer(this, 420, 0);
        this.Ltoesole2.setRotationPoint(0.01F, 1.9F, 0.5F);
        this.Ltoesole2.addBox(-1.0F, 0.0F, -4.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Ltoesole2, -0.4883431247080134F, 0.0F, 0.0F);
        this.Lfoot = new AdvancedModelRenderer(this, 440, 0);
        this.Lfoot.mirror = true;
        this.Lfoot.setRotationPoint(2.51F, 0.0F, -13.2F);
        this.Lfoot.addBox(-2.5F, -5.0F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(Lfoot, 0.37664205258037625F, 0.0F, 0.0F);
        this.Ltoemid2 = new AdvancedModelRenderer(this, 480, 20);
        this.Ltoemid2.setRotationPoint(0.01F, 0.0F, -4.0F);
        this.Ltoemid2.addBox(-1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Ltoemid2, -0.31869712141416456F, 0.0F, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 100, 200);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 21.0F);
        this.Tail5.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 24, 0.0F);
        this.setRotateAngle(Tail5, -0.091106186954104F, 0.0F, 0.0F);
        this.Rtoesole1 = new AdvancedModelRenderer(this, 420, 0);
        this.Rtoesole1.setRotationPoint(-0.01F, 1.9F, 0.5F);
        this.Rtoesole1.addBox(0.0F, 0.0F, -4.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Rtoesole1, -0.4883431247080134F, 0.0F, 0.0F);
        this.Rtoetop2 = new AdvancedModelRenderer(this, 497, 9);
        this.Rtoetop2.setRotationPoint(-2.5F, -5.0F, -11.5F);
        this.Rtoetop2.addBox(-1.0F, 0.0F, -5.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Rtoetop2, -0.36425021489121656F, 0.0F, 0.0F);
        this.Neck2 = new AdvancedModelRenderer(this, 100, 130);
        this.Neck2.setRotationPoint(0.0F, 0.9F, -5.0F);
        this.Neck2.addBox(-4.5F, 0.0F, -8.0F, 9, 14, 9, 0.0F);
        this.setRotateAngle(Neck2, -0.27314402793711257F, 0.0F, 0.0F);
        this.Ltoetop2 = new AdvancedModelRenderer(this, 497, 9);
        this.Ltoetop2.setRotationPoint(2.5F, -5.0F, -11.5F);
        this.Ltoetop2.addBox(-1.0F, 0.0F, -5.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Ltoetop2, -0.36425021489121656F, 0.0F, 0.0F);
        this.Rtoesole2 = new AdvancedModelRenderer(this, 420, 0);
        this.Rtoesole2.setRotationPoint(0.01F, 1.9F, 0.5F);
        this.Rtoesole2.addBox(-1.0F, 0.0F, -4.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Rtoesole2, -0.4883431247080134F, 0.0F, 0.0F);
        this.Lthumb = new AdvancedModelRenderer(this, 470, 0);
        this.Lthumb.setRotationPoint(0.0F, 10.0F, 0.7F);
        this.Lthumb.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(Lthumb, 0.0F, -0.40980330836826856F, 0.0F);
        this.Rthumb = new AdvancedModelRenderer(this, 480, 0);
        this.Rthumb.setRotationPoint(-1.0F, 10.0F, 0.7F);
        this.Rthumb.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(Rthumb, 0.0F, 0.40980330836826856F, 0.0F);
        this.Lleg = new AdvancedModelRenderer(this, 210, 180);
        this.Lleg.mirror = true;
        this.Lleg.setRotationPoint(0.99F, 16.0F, 0.0F);
        this.Lleg.addBox(0.0F, 0.0F, 0.0F, 5, 18, 7, 0.0F);
        this.setRotateAngle(Lleg, 0.9105382707654417F, 0.0F, 0.0F);
        this.Rtoetop1 = new AdvancedModelRenderer(this, 497, 9);
        this.Rtoetop1.setRotationPoint(-2.0F, -5.0F, -11.4F);
        this.Rtoetop1.addBox(0.0F, 0.0F, -5.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Rtoetop1, -0.36425021489121656F, -0.136659280431156F, 0.27314402793711257F);
        this.Neck5 = new AdvancedModelRenderer(this, 160, 215);
        this.Neck5.setRotationPoint(0.0F, 0.2F, -6.7F);
        this.Neck5.addBox(-2.5F, 0.0F, -7.0F, 5, 9, 7, 0.0F);
        this.setRotateAngle(Neck5, 0.40980330836826856F, 0.0F, 0.0F);
        this.Rtoetop3 = new AdvancedModelRenderer(this, 497, 9);
        this.Rtoetop3.setRotationPoint(-3.01F, -5.0F, -11.4F);
        this.Rtoetop3.addBox(-2.0F, 0.0F, -5.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Rtoetop3, -0.36425021489121656F, 0.136659280431156F, -0.27314402793711257F);
        this.Ltoesole1 = new AdvancedModelRenderer(this, 420, 0);
        this.Ltoesole1.setRotationPoint(1.01F, 1.9F, 0.5F);
        this.Ltoesole1.addBox(-2.0F, 0.0F, -4.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Ltoesole1, -0.4883431247080134F, 0.0F, 0.0F);
        this.Lfingerleft = new AdvancedModelRenderer(this, 490, 0);
        this.Lfingerleft.setRotationPoint(3.5F, 12.8F, 0.0F);
        this.Lfingerleft.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Lfingerleft, 0.5462880558742251F, 0.0F, -0.27314402793711257F);
        this.Lhip = new AdvancedModelRenderer(this, 200, 210);
        this.Lhip.mirror = true;
        this.Lhip.setRotationPoint(6.0F, -16.0F, 15.0F);
        this.Lhip.addBox(0.0F, 0.0F, 0.0F, 7, 16, 11, 0.0F);
        this.setRotateAngle(Lhip, -0.22759093446006054F, 0.0F, 0.0F);
        this.Rfingerleft = new AdvancedModelRenderer(this, 490, 0);
        this.Rfingerleft.setRotationPoint(-0.5F, 12.8F, 0.0F);
        this.Rfingerleft.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Rfingerleft, 0.5462880558742251F, 0.0F, -0.27314402793711257F);
        this.Lupperarm = new AdvancedModelRenderer(this, 250, 195);
        this.Lupperarm.mirror = true;
        this.Lupperarm.setRotationPoint(0.5F, 9.0F, 1.0F);
        this.Lupperarm.addBox(0.0F, 0.0F, 0.0F, 5, 13, 6, 0.0F);
        this.setRotateAngle(Lupperarm, -0.18203784098300857F, 0.0F, 0.0F);
        this.Ltoetop3 = new AdvancedModelRenderer(this, 497, 9);
        this.Ltoetop3.setRotationPoint(3.0F, -5.0F, -11.4F);
        this.Ltoetop3.addBox(0.0F, 0.0F, -5.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Ltoetop3, -0.36425021489121656F, -0.136659280431156F, 0.27314402793711257F);
        this.Rshoulder = new AdvancedModelRenderer(this, 250, 220);
        this.Rshoulder.setRotationPoint(-7.0F, 0.0F, -12.0F);
        this.Rshoulder.addBox(-6.0F, 0.0F, 0.0F, 6, 12, 8, 0.0F);
        this.setRotateAngle(Rshoulder, 0.6829473363053812F, 0.0F, 0.0F);
        this.Llowerarm = new AdvancedModelRenderer(this, 250, 160);
        this.Llowerarm.mirror = true;
        this.Llowerarm.setRotationPoint(0.55F, 9.0F, 4.3F);
        this.Llowerarm.addBox(0.0F, 0.0F, 0.0F, 4, 13, 4, 0.0F);
        this.setRotateAngle(Llowerarm, -1.4114477660878142F, 0.0F, 0.0F);
        this.Rtoemid3.addChild(this.Rtoesole3);
        this.Tail2.addChild(this.Tail3);
        this.Llowerarm.addChild(this.Lfingermid);
        this.Rleg.addChild(this.Rlowerleg);
        this.Tail1.addChild(this.Tail2);
        this.Head1.addChild(this.Lowerjaw);
        this.Ltoetop3.addChild(this.Ltoemid3);
        this.Rtoetop3.addChild(this.Rtoemid3);
        this.Bodyback.addChild(this.Tail1);
        this.Rhip.addChild(this.Rleg);
        this.Rlowerleg.addChild(this.Rfoot);
        this.Neck5.addChild(this.Head1);
        this.Neck3.addChild(this.Neck4);
        this.Ltoemid3.addChild(this.Ltoesole3);
        this.Rshoulder.addChild(this.Rupperarm);
        this.Bodyfront.addChild(this.Bodyback);
        this.Rupperarm.addChild(this.Rlowerarm);
        this.Rlowerarm.addChild(this.Rfingermid);
        this.Head1.addChild(this.Snout);
        this.Llowerleg.addChild(this.Ltoetop1);
        this.Ltoetop1.addChild(this.Ltoemid1);
        this.Bodyfront.addChild(this.Neck1);
        this.Rtoetop2.addChild(this.Rtoemid2);
        this.Lleg.addChild(this.Llowerleg);
        this.Llowerarm.addChild(this.Lfingerright);
        this.Neck2.addChild(this.Neck3);
        this.Rlowerarm.addChild(this.Rfingerright);
        this.Rtoetop1.addChild(this.Rtoemid1);
        this.Tail3.addChild(this.Tail4);
        this.Ltoemid2.addChild(this.Ltoesole2);
        this.Llowerleg.addChild(this.Lfoot);
        this.Ltoetop2.addChild(this.Ltoemid2);
        this.Tail4.addChild(this.Tail5);
        this.Rtoemid1.addChild(this.Rtoesole1);
        this.Rlowerleg.addChild(this.Rtoetop2);
        this.Neck1.addChild(this.Neck2);
        this.Llowerleg.addChild(this.Ltoetop2);
        this.Rtoemid2.addChild(this.Rtoesole2);
        this.Llowerarm.addChild(this.Lthumb);
        this.Rlowerarm.addChild(this.Rthumb);
        this.Lhip.addChild(this.Lleg);
        this.Rlowerleg.addChild(this.Rtoetop1);
        this.Neck4.addChild(this.Neck5);
        this.Rlowerleg.addChild(this.Rtoetop3);
        this.Ltoemid1.addChild(this.Ltoesole1);
        this.Llowerarm.addChild(this.Lfingerleft);
        this.Rlowerarm.addChild(this.Rfingerleft);
        this.Lshoulder.addChild(this.Lupperarm);
        this.Llowerleg.addChild(this.Ltoetop3);
        this.Lupperarm.addChild(this.Llowerarm);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Rhip.render(f5);
        this.Bodyfront.render(f5);
        this.Lshoulder.render(f5);
        this.Lhip.render(f5);
        this.Rshoulder.render(f5);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
}
