package net.andrewplayz.prehistoricraft.client.model.entity.dinosaur;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelOrnithomimus extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer Rshoulder;
    public AdvancedModelRenderer Lshoulder;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Rhip;
    public AdvancedModelRenderer Lhip;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Rupperleg;
    public AdvancedModelRenderer Rlowerleg;
    public AdvancedModelRenderer Rfoot;
    public AdvancedModelRenderer Rtoesole2;
    public AdvancedModelRenderer Rtoesole3;
    public AdvancedModelRenderer Rtoesole1;
    public AdvancedModelRenderer Rtoemiddle2;
    public AdvancedModelRenderer RToetop2;
    public AdvancedModelRenderer Rtoemid3;
    public AdvancedModelRenderer Rtoetop3;
    public AdvancedModelRenderer Rtoemid1;
    public AdvancedModelRenderer Rtoetop1;
    public AdvancedModelRenderer Lupperleg;
    public AdvancedModelRenderer Llowerleg;
    public AdvancedModelRenderer Lfoot;
    public AdvancedModelRenderer Ltoesole2;
    public AdvancedModelRenderer Ltoesole3;
    public AdvancedModelRenderer Ltoesole1;
    public AdvancedModelRenderer Ltoemid2;
    public AdvancedModelRenderer Ltoetop2;
    public AdvancedModelRenderer Ltoemid3;
    public AdvancedModelRenderer Ltoetop3;
    public AdvancedModelRenderer Ltoemid1;
    public AdvancedModelRenderer Ltoetop1;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer Neck3;
    public AdvancedModelRenderer Neck4;
    public AdvancedModelRenderer Neck5;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Snout1;
    public AdvancedModelRenderer Snout2;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Rupperarm;
    public AdvancedModelRenderer Rlowerarm;
    public AdvancedModelRenderer Rarmfeathers1;
    public AdvancedModelRenderer Rhand;
    public AdvancedModelRenderer Rarmfeather2;
    public AdvancedModelRenderer Rfinger2;
    public AdvancedModelRenderer Rfinger1;
    public AdvancedModelRenderer Rfinger3;
    public AdvancedModelRenderer Lupperarm;
    public AdvancedModelRenderer Llowerarm;
    public AdvancedModelRenderer Larmfeather1;
    public AdvancedModelRenderer Lhand;
    public AdvancedModelRenderer Larmfeathers2;
    public AdvancedModelRenderer Lfinger2;
    public AdvancedModelRenderer Lfinger1;
    public AdvancedModelRenderer Lfinger3;

    public ModelOrnithomimus() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.Tail1 = new AdvancedModelRenderer(this, 5, 60);
        this.Tail1.setRotationPoint(0.0F, 0.6F, 9.0F);
        this.Tail1.addBox(-3.5F, 0.0F, 0.0F, 7, 9, 7, 0.0F);
        this.setRotateAngle(Tail1, 0.22759093446006054F, 0.0F, 0.0F);
        this.Ltoesole3 = new AdvancedModelRenderer(this, 210, 0);
        this.Ltoesole3.setRotationPoint(0.4F, 2.0F, 1.5F);
        this.Ltoesole3.addBox(-1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Ltoesole3, 0.0F, 0.31869712141416456F, 0.0F);
        this.Larmfeather1 = new AdvancedModelRenderer(this, 220, 110);
        this.Larmfeather1.setRotationPoint(0.9F, 2.0F, 2.0F);
        this.Larmfeather1.addBox(-1.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        this.Lshoulder = new AdvancedModelRenderer(this, 195, 115);
        this.Lshoulder.setRotationPoint(6.5F, 4.0F, -9.5F);
        this.Lshoulder.addBox(-3.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Lshoulder, 0.5009094953223726F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 5, 45);
        this.Tail2.setRotationPoint(0.0F, 0.3F, 6.0F);
        this.Tail2.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 7, 0.0F);
        this.Snout1 = new AdvancedModelRenderer(this, 100, 85);
        this.Snout1.setRotationPoint(0.01F, 1.0F, -2.9F);
        this.Snout1.addBox(-1.5F, 0.0F, -7.0F, 3, 2, 7, 0.0F);
        this.Lfinger3 = new AdvancedModelRenderer(this, 230, 30);
        this.Lfinger3.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.Lfinger3.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Lfinger3, 0.4038691889114879F, 0.0F, 0.44872415068774213F);
        this.Lfinger1 = new AdvancedModelRenderer(this, 230, 10);
        this.Lfinger1.setRotationPoint(0.0F, 3.0F, -0.5F);
        this.Lfinger1.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Lfinger1, -0.4038691889114879F, 0.0F, 0.44872415068774213F);
        this.Rlowerarm = new AdvancedModelRenderer(this, 175, 85);
        this.Rlowerarm.setRotationPoint(0.1F, 8.0F, 3.0F);
        this.Rlowerarm.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Rlowerarm, -1.1383037381507017F, 0.0F, 0.0F);
        this.Rfinger2 = new AdvancedModelRenderer(this, 240, 20);
        this.Rfinger2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Rfinger2.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Rfinger2, 0.0F, 0.0F, -0.31869712141416456F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 100, 75);
        this.Lowerjaw.setRotationPoint(0.0F, 3.0F, -2.5F);
        this.Lowerjaw.addBox(-1.0F, 0.0F, -7.0F, 2, 1, 7, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.091106186954104F, 0.0F, 0.0F);
        this.Rtoemiddle2 = new AdvancedModelRenderer(this, 210, 10);
        this.Rtoemiddle2.setRotationPoint(0.0F, -0.9F, -2.2F);
        this.Rtoemiddle2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Rtoemiddle2, 0.4553564018453205F, 0.0F, 0.0F);
        this.Rupperarm = new AdvancedModelRenderer(this, 175, 100);
        this.Rupperarm.setRotationPoint(1.5F, 3.0F, 1.3F);
        this.Rupperarm.addBox(-1.0F, 0.0F, 0.0F, 2, 8, 3, 0.0F);
        this.setRotateAngle(Rupperarm, -0.5462880558742251F, 0.0F, 0.0F);
        this.Llowerarm = new AdvancedModelRenderer(this, 195, 85);
        this.Llowerarm.setRotationPoint(-0.1F, 8.0F, 3.0F);
        this.Llowerarm.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Llowerarm, -1.1383037381507017F, 0.0F, 0.0F);
        this.Bodyback = new AdvancedModelRenderer(this, 5, 80);
        this.Bodyback.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyback.addBox(-5.0F, 0.0F, 0.0F, 10, 11, 11, 0.0F);
        this.setRotateAngle(Bodyback, -0.22759093446006054F, 0.0F, 0.0F);
        this.RToetop2 = new AdvancedModelRenderer(this, 210, 20);
        this.RToetop2.setRotationPoint(0.0F, -0.8F, 1.3F);
        this.RToetop2.addBox(-0.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(RToetop2, 0.4553564018453205F, 0.0F, 0.0F);
        this.Ltoetop3 = new AdvancedModelRenderer(this, 210, 20);
        this.Ltoetop3.setRotationPoint(0.0F, -0.8F, 1.3F);
        this.Ltoetop3.addBox(-1.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Ltoetop3, 0.4553564018453205F, 0.0F, 0.0F);
        this.Lhand = new AdvancedModelRenderer(this, 230, 0);
        this.Lhand.setRotationPoint(1.0F, 6.0F, -1.0F);
        this.Lhand.addBox(-1.0F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Lhand, 0.0F, 0.0F, 0.31869712141416456F);
        this.Rhand = new AdvancedModelRenderer(this, 240, 0);
        this.Rhand.setRotationPoint(-1.0F, 5.7F, -1.0F);
        this.Rhand.addBox(0.0F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Rhand, 0.0F, 0.0F, -0.31869712141416456F);
        this.Neck1 = new AdvancedModelRenderer(this, 60, 90);
        this.Neck1.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.Neck1.addBox(-3.0F, 0.0F, -5.0F, 6, 7, 5, 0.0F);
        this.setRotateAngle(Neck1, -0.4553564018453205F, 0.0F, 0.0F);
        this.Neck2 = new AdvancedModelRenderer(this, 60, 75);
        this.Neck2.setRotationPoint(0.0F, 0.8F, -2.8F);
        this.Neck2.addBox(-2.0F, 0.0F, -5.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(Neck2, -0.36425021489121656F, 0.0F, 0.0F);
        this.Lfoot = new AdvancedModelRenderer(this, 150, 55);
        this.Lfoot.setRotationPoint(0.0F, 10.0F, -3.0F);
        this.Lfoot.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Lfoot, 0.40980330836826856F, 0.0F, 0.0F);
        this.Rarmfeathers1 = new AdvancedModelRenderer(this, 220, 110);
        this.Rarmfeathers1.setRotationPoint(-0.9F, 2.0F, 2.0F);
        this.Rarmfeathers1.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        this.Lhip = new AdvancedModelRenderer(this, 150, 110);
        this.Lhip.setRotationPoint(7.0F, 3.2F, 5.0F);
        this.Lhip.addBox(-4.0F, 0.0F, 0.0F, 4, 9, 6, 0.0F);
        this.setRotateAngle(Lhip, -0.4553564018453205F, 0.0F, 0.0F);
        this.Ltoetop2 = new AdvancedModelRenderer(this, 210, 20);
        this.Ltoetop2.setRotationPoint(0.0F, -0.8F, 1.3F);
        this.Ltoetop2.addBox(-0.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Ltoetop2, 0.4553564018453205F, 0.0F, 0.0F);
        this.Rtoemid1 = new AdvancedModelRenderer(this, 210, 10);
        this.Rtoemid1.setRotationPoint(0.0F, -0.9F, -2.2F);
        this.Rtoemid1.addBox(-1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Rtoemid1, 0.4553564018453205F, 0.0F, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 60, 110);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Tail5.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 13, 0.0F);
        this.setRotateAngle(Tail5, -0.091106186954104F, 0.0F, 0.0F);
        this.Neck3 = new AdvancedModelRenderer(this, 60, 60);
        this.Neck3.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.Neck3.addBox(-1.5F, 0.0F, -8.0F, 3, 4, 8, 0.0F);
        this.setRotateAngle(Neck3, -0.31869712141416456F, 0.0F, 0.0F);
        this.Ltoemid3 = new AdvancedModelRenderer(this, 210, 10);
        this.Ltoemid3.setRotationPoint(0.0F, -0.9F, -2.2F);
        this.Ltoemid3.addBox(-1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Ltoemid3, 0.4553564018453205F, 0.0F, 0.0F);
        this.Head1 = new AdvancedModelRenderer(this, 100, 115);
        this.Head1.setRotationPoint(0.01F, 0.0F, -4.0F);
        this.Head1.addBox(-1.5F, 0.0F, -4.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Head1, 0.6373942428283291F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 5, 25);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail3.addBox(-2.0F, 0.0F, 0.0F, 4, 6, 10, 0.0F);
        this.setRotateAngle(Tail3, -0.045553093477052F, 0.0F, 0.0F);
        this.Rfinger3 = new AdvancedModelRenderer(this, 240, 30);
        this.Rfinger3.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.Rfinger3.addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Rfinger3, 0.4038691889114879F, 0.0F, -0.44872415068774213F);
        this.Bodyfront = new AdvancedModelRenderer(this, 5, 105);
        this.Bodyfront.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.Bodyfront.addBox(-4.5F, 0.0F, -10.0F, 9, 10, 10, 0.0F);
        this.setRotateAngle(Bodyfront, 0.18203784098300857F, 0.0F, 0.0F);
        this.Ltoetop1 = new AdvancedModelRenderer(this, 210, 20);
        this.Ltoetop1.setRotationPoint(0.0F, -0.8F, 1.3F);
        this.Ltoetop1.addBox(0.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Ltoetop1, 0.4553564018453205F, 0.0F, 0.0F);
        this.Rhip = new AdvancedModelRenderer(this, 125, 110);
        this.Rhip.setRotationPoint(-7.0F, 3.2F, 5.0F);
        this.Rhip.addBox(0.0F, 0.0F, 0.0F, 4, 9, 6, 0.0F);
        this.setRotateAngle(Rhip, -0.4553564018453205F, 0.0F, 0.0F);
        this.Rfoot = new AdvancedModelRenderer(this, 125, 55);
        this.Rfoot.setRotationPoint(0.0F, 10.0F, -3.0F);
        this.Rfoot.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Rfoot, 0.40980330836826856F, 0.0F, 0.0F);
        this.Rtoesole1 = new AdvancedModelRenderer(this, 210, 0);
        this.Rtoesole1.setRotationPoint(0.4F, 2.0F, 1.5F);
        this.Rtoesole1.addBox(-1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Rtoesole1, 0.0F, 0.31869712141416456F, 0.0F);
        this.Larmfeathers2 = new AdvancedModelRenderer(this, 220, 90);
        this.Larmfeathers2.setRotationPoint(0.9F, -1.0F, 0.0F);
        this.Larmfeathers2.addBox(-1.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        this.Rtoesole2 = new AdvancedModelRenderer(this, 210, 0);
        this.Rtoesole2.setRotationPoint(0.0F, 2.0F, 1.5F);
        this.Rtoesole2.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.Rtoesole3 = new AdvancedModelRenderer(this, 210, 0);
        this.Rtoesole3.setRotationPoint(-0.4F, 2.0F, 1.5F);
        this.Rtoesole3.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Rtoesole3, 0.0F, -0.31869712141416456F, 0.0F);
        this.Ltoesole1 = new AdvancedModelRenderer(this, 210, 0);
        this.Ltoesole1.setRotationPoint(-0.4F, 2.0F, 1.5F);
        this.Ltoesole1.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Ltoesole1, 0.0F, -0.31869712141416456F, 0.0F);
        this.Snout2 = new AdvancedModelRenderer(this, 100, 100);
        this.Snout2.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.Snout2.addBox(-1.0F, 0.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Snout2, 0.16318828506146982F, 0.0F, 0.0F);
        this.Rupperleg = new AdvancedModelRenderer(this, 125, 90);
        this.Rupperleg.setRotationPoint(2.0F, 9.0F, 0.0F);
        this.Rupperleg.addBox(-1.5F, 0.0F, 0.0F, 3, 11, 4, 0.0F);
        this.setRotateAngle(Rupperleg, 1.1838568316277536F, 0.0F, 0.0F);
        this.Lupperarm = new AdvancedModelRenderer(this, 195, 100);
        this.Lupperarm.setRotationPoint(-1.5F, 3.0F, 1.3F);
        this.Lupperarm.addBox(-1.0F, 0.0F, 0.0F, 2, 8, 3, 0.0F);
        this.setRotateAngle(Lupperarm, -0.5462880558742251F, 0.0F, 0.0F);
        this.Rshoulder = new AdvancedModelRenderer(this, 175, 115);
        this.Rshoulder.setRotationPoint(-6.5F, 4.0F, -9.5F);
        this.Rshoulder.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Rshoulder, 0.5009094953223726F, 0.0F, 0.0F);
        this.Rtoemid3 = new AdvancedModelRenderer(this, 210, 10);
        this.Rtoemid3.setRotationPoint(0.0F, -0.9F, -2.2F);
        this.Rtoemid3.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Rtoemid3, 0.4553564018453205F, 0.0F, 0.0F);
        this.Neck5 = new AdvancedModelRenderer(this, 60, 35);
        this.Neck5.setRotationPoint(0.01F, 0.0F, -7.0F);
        this.Neck5.addBox(-1.5F, 0.0F, -4.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Neck5, 0.5009094953223726F, 0.0F, 0.0F);
        this.Rtoetop3 = new AdvancedModelRenderer(this, 210, 20);
        this.Rtoetop3.setRotationPoint(0.0F, -0.8F, 1.3F);
        this.Rtoetop3.addBox(0.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Rtoetop3, 0.4553564018453205F, 0.0F, 0.0F);
        this.Lupperleg = new AdvancedModelRenderer(this, 150, 90);
        this.Lupperleg.setRotationPoint(-2.0F, 9.0F, 0.0F);
        this.Lupperleg.addBox(-1.5F, 0.0F, 0.0F, 3, 11, 4, 0.0F);
        this.setRotateAngle(Lupperleg, 1.1838568316277536F, 0.0F, 0.0F);
        this.Neck4 = new AdvancedModelRenderer(this, 60, 45);
        this.Neck4.setRotationPoint(-0.01F, 0.1F, -7.0F);
        this.Neck4.addBox(-1.5F, 0.0F, -7.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(Neck4, -0.18203784098300857F, 0.0F, 0.0F);
        this.Rlowerleg = new AdvancedModelRenderer(this, 125, 70);
        this.Rlowerleg.setRotationPoint(0.0F, 11.0F, 3.6F);
        this.Rlowerleg.addBox(-1.0F, 0.0F, -3.0F, 2, 10, 3, 0.0F);
        this.setRotateAngle(Rlowerleg, -1.1383037381507017F, 0.0F, 0.0F);
        this.Ltoemid2 = new AdvancedModelRenderer(this, 210, 10);
        this.Ltoemid2.setRotationPoint(0.0F, -0.9F, -2.2F);
        this.Ltoemid2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Ltoemid2, 0.4553564018453205F, 0.0F, 0.0F);
        this.Lfinger2 = new AdvancedModelRenderer(this, 230, 20);
        this.Lfinger2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Lfinger2.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Lfinger2, 0.0F, 0.0F, 0.31869712141416456F);
        this.Ltoesole2 = new AdvancedModelRenderer(this, 210, 0);
        this.Ltoesole2.setRotationPoint(0.0F, 2.0F, 1.5F);
        this.Ltoesole2.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.Ltoemid1 = new AdvancedModelRenderer(this, 210, 10);
        this.Ltoemid1.setRotationPoint(0.0F, -0.9F, -2.2F);
        this.Ltoemid1.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Ltoemid1, 0.4553564018453205F, 0.0F, 0.0F);
        this.Llowerleg = new AdvancedModelRenderer(this, 150, 70);
        this.Llowerleg.setRotationPoint(0.0F, 11.0F, 3.4F);
        this.Llowerleg.addBox(-1.0F, 0.0F, -3.0F, 2, 10, 3, 0.0F);
        this.setRotateAngle(Llowerleg, -1.1383037381507017F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 5, 5);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail4.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 11, 0.0F);
        this.setRotateAngle(Tail4, -0.07382742735936015F, 0.0F, 0.0F);
        this.Rfinger1 = new AdvancedModelRenderer(this, 240, 10);
        this.Rfinger1.setRotationPoint(0.0F, 3.0F, -0.5F);
        this.Rfinger1.addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Rfinger1, -0.4038691889114879F, 0.0F, -0.44872415068774213F);
        this.Rtoetop1 = new AdvancedModelRenderer(this, 210, 20);
        this.Rtoetop1.setRotationPoint(0.0F, -0.8F, 1.3F);
        this.Rtoetop1.addBox(-1.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Rtoetop1, 0.4553564018453205F, 0.0F, 0.0F);
        this.Rarmfeather2 = new AdvancedModelRenderer(this, 220, 90);
        this.Rarmfeather2.setRotationPoint(-0.9F, -1.0F, 0.0F);
        this.Rarmfeather2.addBox(0.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        this.Bodyback.addChild(this.Tail1);
        this.Lfoot.addChild(this.Ltoesole3);
        this.Lupperarm.addChild(this.Larmfeather1);
        this.Bodyfront.addChild(this.Lshoulder);
        this.Tail1.addChild(this.Tail2);
        this.Head1.addChild(this.Snout1);
        this.Lhand.addChild(this.Lfinger3);
        this.Lhand.addChild(this.Lfinger1);
        this.Rupperarm.addChild(this.Rlowerarm);
        this.Rhand.addChild(this.Rfinger2);
        this.Head1.addChild(this.Lowerjaw);
        this.Rtoesole2.addChild(this.Rtoemiddle2);
        this.Rshoulder.addChild(this.Rupperarm);
        this.Lupperarm.addChild(this.Llowerarm);
        this.Bodyfront.addChild(this.Bodyback);
        this.Rtoemiddle2.addChild(this.RToetop2);
        this.Ltoemid3.addChild(this.Ltoetop3);
        this.Llowerarm.addChild(this.Lhand);
        this.Rlowerarm.addChild(this.Rhand);
        this.Bodyfront.addChild(this.Neck1);
        this.Neck1.addChild(this.Neck2);
        this.Llowerleg.addChild(this.Lfoot);
        this.Rupperarm.addChild(this.Rarmfeathers1);
        this.Bodyback.addChild(this.Lhip);
        this.Ltoemid2.addChild(this.Ltoetop2);
        this.Rtoesole1.addChild(this.Rtoemid1);
        this.Tail4.addChild(this.Tail5);
        this.Neck2.addChild(this.Neck3);
        this.Ltoesole3.addChild(this.Ltoemid3);
        this.Neck5.addChild(this.Head1);
        this.Tail2.addChild(this.Tail3);
        this.Rhand.addChild(this.Rfinger3);
        this.Ltoemid1.addChild(this.Ltoetop1);
        this.Bodyback.addChild(this.Rhip);
        this.Rlowerleg.addChild(this.Rfoot);
        this.Rfoot.addChild(this.Rtoesole1);
        this.Llowerarm.addChild(this.Larmfeathers2);
        this.Rfoot.addChild(this.Rtoesole2);
        this.Rfoot.addChild(this.Rtoesole3);
        this.Lfoot.addChild(this.Ltoesole1);
        this.Head1.addChild(this.Snout2);
        this.Rhip.addChild(this.Rupperleg);
        this.Lshoulder.addChild(this.Lupperarm);
        this.Bodyfront.addChild(this.Rshoulder);
        this.Rtoesole3.addChild(this.Rtoemid3);
        this.Neck4.addChild(this.Neck5);
        this.Rtoemid3.addChild(this.Rtoetop3);
        this.Lhip.addChild(this.Lupperleg);
        this.Neck3.addChild(this.Neck4);
        this.Rupperleg.addChild(this.Rlowerleg);
        this.Ltoesole2.addChild(this.Ltoemid2);
        this.Lhand.addChild(this.Lfinger2);
        this.Lfoot.addChild(this.Ltoesole2);
        this.Ltoesole1.addChild(this.Ltoemid1);
        this.Lupperleg.addChild(this.Llowerleg);
        this.Tail3.addChild(this.Tail4);
        this.Rhand.addChild(this.Rfinger1);
        this.Rtoemid1.addChild(this.Rtoetop1);
        this.Rlowerarm.addChild(this.Rarmfeather2);
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
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float rotation, float rotationYaw, float rotationPitch, float partialTicks, Entity entity) {
        resetToDefaultPose();
        this.faceTarget(rotationYaw, rotationPitch, 1.0F, Neck1, Neck2, Head1);

        /*limbSwing = entity.ticksExisted;
        limbSwingAmount = 0.5F;*/

        float globalSpeed = 1.0F;
        float globalHeight = 1.0F;
        float globalDegree = 1.0F;

        //Idle Animations
        //Head
        walk(Head1, 0.1F, 0.0F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        walk(Lowerjaw, 0.1F, 0.0F * globalHeight, true, 0.0F, -0.15F, entity.ticksExisted, 1);
        walk(Snout1, 0.1F, 0.0F * globalHeight, true, 0.0F, -0.15F, entity.ticksExisted, 1);
        walk(Snout2, 0.1F, 0.0F * globalHeight, true, 0.0F, -0.15F, entity.ticksExisted, 1);

        //Neck
        walk(Neck1, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, entity.ticksExisted, 1);
        walk(Neck2, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, entity.ticksExisted, 1);
        walk(Neck3, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, entity.ticksExisted, 1);
        walk(Neck4, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, entity.ticksExisted, 1);
        walk(Neck5, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, entity.ticksExisted, 1);

        //Left Arm
        walk(Lshoulder, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Lupperarm, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Llowerarm, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Lhand, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);

        flap(Lshoulder, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Lupperarm, 0.1F, 0.04F * globalHeight, true, -0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Llowerarm, 0.1F, 0.04F * globalHeight, true, -0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Lhand, 0.1F, 0.04F * globalHeight, true, -0.5F, 0.0F, entity.ticksExisted, 1);

        //Right Arm
        walk(Rshoulder, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Rupperarm, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Rlowerarm, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Rhand, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);

        flap(Rshoulder, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Rupperarm, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Rlowerarm, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Rhand, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);

        //Tail
        swing(Tail1, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        swing(Tail2, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        swing(Tail3, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        swing(Tail4, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        swing(Tail5, 0.05F, 0.2F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);


        //Walking Animations
        //Head
        walk(Head1, 0.4F * globalSpeed, 0.0F * globalHeight, true, 0.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Lowerjaw, 0.4F * globalSpeed, 0.0F * globalHeight, true, 0.0F, -0.15F, limbSwing, limbSwingAmount);
        walk(Snout1, 0.4F * globalSpeed, 0.0F * globalHeight, true, 0.0F, -0.15F, limbSwing, limbSwingAmount);
        walk(Snout2, 0.4F * globalSpeed, 0.0F * globalHeight, true, 0.0F, -0.15F, limbSwing, limbSwingAmount);

        //Neck
        walk(Neck1, 0.4F * globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Neck2, 0.4F * globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Neck3, 0.4F * globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Neck4, 0.4F * globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Neck5, 0.4F * globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);

        //Body
        bob(Bodyback, 0.6F * globalSpeed, 0.6F * globalHeight, false, limbSwing, limbSwingAmount);
        bob(Bodyfront, 0.6F * globalSpeed, 0.8F * globalHeight, false, limbSwing, limbSwingAmount);

        //Left Arm
        walk(Lshoulder, 0.4F * globalSpeed, 0.1F * globalHeight, false, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(Lupperarm, 0.4F * globalSpeed, 0.1F * globalHeight, false, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(Llowerarm, 0.4F * globalSpeed, 0.1F * globalHeight, false, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(Lhand, 0.4F * globalSpeed, 0.1F * globalHeight, false, 0.5F, 0.0F, limbSwing, limbSwingAmount);

        flap(Lshoulder, 0.4F * globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(Lupperarm, 0.4F * globalSpeed, 0.08F * globalHeight, true, -0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(Llowerarm, 0.4F * globalSpeed, 0.08F * globalHeight, true, -0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(Lhand, 0.4F * globalSpeed, 0.08F * globalHeight, true, -0.5F, 0.0F, limbSwing, limbSwingAmount);

        //Right Arm
        walk(Rshoulder, 0.4F * globalSpeed, 0.1F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(Rupperarm, 0.4F * globalSpeed, 0.1F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(Rlowerarm, 0.4F * globalSpeed, 0.1F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        walk(Rhand, 0.4F * globalSpeed, 0.1F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);

        flap(Rshoulder, 0.4F * globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(Rupperarm, 0.4F * globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(Rlowerarm, 0.4F * globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);
        flap(Rhand, 0.4F * globalSpeed, 0.08F * globalHeight, true, 0.5F, 0.0F, limbSwing, limbSwingAmount);

        //Right Leg
        walk(Rhip, 0.4F * globalSpeed, 0.5F * globalHeight, false, 0.0F, 0.2F, limbSwing, limbSwingAmount);
        walk(Rupperleg, 0.4F * globalSpeed, 0.5F * globalHeight, false, -1.5F, 0.2F, limbSwing, limbSwingAmount);
        walk(Rlowerleg, 0.4F * globalSpeed, 0.5F * globalHeight, false, -1.5F, 0.2F, limbSwing, limbSwingAmount);
        walk(Rfoot, 0.4F * globalSpeed, 0.5F * globalHeight, false, -4.0F, 0.1F, limbSwing, limbSwingAmount);

        //Left Leg
        walk(Lhip, 0.4F * globalSpeed, 0.5F * globalHeight, true, 0.0F, 0.2F, limbSwing, limbSwingAmount);
        walk(Lupperleg, 0.4F * globalSpeed, 0.5F * globalHeight, true, -1.5F, -0.5F, limbSwing, limbSwingAmount);
        walk(Llowerleg, 0.4F * globalSpeed, 0.5F * globalHeight, true, -1.5F, -0.5F, limbSwing, limbSwingAmount);
        walk(Lfoot, 0.4F * globalSpeed, 0.5F * globalHeight, true, -4.0F, 0.1F, limbSwing, limbSwingAmount);

        //Tail
        swing(Tail1, 0.1F * globalSpeed, 0.1F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail2, 0.1F * globalSpeed, 0.2F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail3, 0.1F * globalSpeed, 0.3F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail4, 0.1F * globalSpeed, 0.4F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail5, 0.1F * globalSpeed, 0.5F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
    }
}
