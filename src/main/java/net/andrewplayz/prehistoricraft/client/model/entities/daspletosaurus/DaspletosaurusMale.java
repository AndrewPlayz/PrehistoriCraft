package net.andrewplayz.prehistoricraft.client.model.entities.daspletosaurus;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;

public class DaspletosaurusMale extends AdvancedModelBase{
    public AdvancedModelRenderer Bodymain;
    public AdvancedModelRenderer Thighright;
    public AdvancedModelRenderer Thightleft;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Tail6;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer Rightshoulder;
    public AdvancedModelRenderer Leftshoulder;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer Necklower;
    public AdvancedModelRenderer Neck3;
    public AdvancedModelRenderer Backhead;
    public AdvancedModelRenderer Snout;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Browright;
    public AdvancedModelRenderer Browleft;
    public AdvancedModelRenderer Teeth1;
    public AdvancedModelRenderer Teeth2;
    public AdvancedModelRenderer Teeth3;
    public AdvancedModelRenderer Teeth4;
    public AdvancedModelRenderer Teeth5;
    public AdvancedModelRenderer Teeth6;
    public AdvancedModelRenderer Upperarmright;
    public AdvancedModelRenderer Lowerarmright;
    public AdvancedModelRenderer Handright;
    public AdvancedModelRenderer Finger1upperright;
    public AdvancedModelRenderer Finger1middleright;
    public AdvancedModelRenderer Finger2upperright;
    public AdvancedModelRenderer Finger2middleright;
    public AdvancedModelRenderer Upperarmleft;
    public AdvancedModelRenderer Lowerarmleft;
    public AdvancedModelRenderer Handleft;
    public AdvancedModelRenderer Finger1upperleft;
    public AdvancedModelRenderer Finger1middleleft;
    public AdvancedModelRenderer Finger2upperleft;
    public AdvancedModelRenderer Finger2middleleft;
    public AdvancedModelRenderer Upperlegfrontright;
    public AdvancedModelRenderer Upperlegbackright;
    public AdvancedModelRenderer Lowerlegright;
    public AdvancedModelRenderer Heelright;
    public AdvancedModelRenderer Soleright;
    public AdvancedModelRenderer Upperrighttoeright;
    public AdvancedModelRenderer Upperlefttoeright;
    public AdvancedModelRenderer Uppermiddletoeright;
    public AdvancedModelRenderer Lowerrighttoeright;
    public AdvancedModelRenderer Righttoesoleright;
    public AdvancedModelRenderer Lowerlefttoeright;
    public AdvancedModelRenderer Lefttoesoleright;
    public AdvancedModelRenderer Lowermiddletoeright;
    public AdvancedModelRenderer Middletoesoleright;
    public AdvancedModelRenderer Upperlegfrontleft;
    public AdvancedModelRenderer Upperlegbackleft;
    public AdvancedModelRenderer Lowerlegleft;
    public AdvancedModelRenderer Heelleft;
    public AdvancedModelRenderer Soleleft;
    public AdvancedModelRenderer Upperlefttoeleft;
    public AdvancedModelRenderer Upperlefttoeleft_1;
    public AdvancedModelRenderer Uppermiddletoeleft;
    public AdvancedModelRenderer Lowerrighttoeleft;
    public AdvancedModelRenderer Lefttoesoleleft;
    public AdvancedModelRenderer Lowerleftoeleft;
    public AdvancedModelRenderer Righttoesoleleft;
    public AdvancedModelRenderer Lowermiddletoeleft;
    public AdvancedModelRenderer Middletoesoleleft;

    public DaspletosaurusMale() {
        this.textureWidth = 512;
        this.textureHeight = 256;
        this.Bodymain = new AdvancedModelRenderer(this, 5, 210);
        this.Bodymain.setRotationPoint(0.0F, -20.0F, -10.0F);
        this.Bodymain.addBox(-7.0F, 0.0F, 0.0F, 14, 18, 25, 0.0F);
        this.setRotateAngle(Bodymain, -0.091106186954104F, 0.0F, 0.0F);
        this.Lowerleftoeleft = new AdvancedModelRenderer(this, 500, 230);
        this.Lowerleftoeleft.setRotationPoint(-0.98F, 3.96F, 0.15F);
        this.Lowerleftoeleft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowerleftoeleft, -0.5462880558742251F, 0.0F, 0.0F);
        this.Middletoesoleleft = new AdvancedModelRenderer(this, 500, 240);
        this.Middletoesoleleft.setRotationPoint(-0.01F, -2.6F, 2.2F);
        this.Middletoesoleleft.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Middletoesoleleft, -0.31869712141416456F, 0.0F, 0.0F);
        this.Upperlegbackright = new AdvancedModelRenderer(this, 260, 180);
        this.Upperlegbackright.setRotationPoint(0.0F, 11.4F, 5.56F);
        this.Upperlegbackright.addBox(-2.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Leftshoulder = new AdvancedModelRenderer(this, 340, 240);
        this.Leftshoulder.setRotationPoint(4.0F, 11.0F, -11.0F);
        this.Leftshoulder.addBox(0.0F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(Leftshoulder, 0.4553564018453205F, 0.0F, -0.18203784098300857F);
        this.Neck2 = new AdvancedModelRenderer(this, 90, 210);
        this.Neck2.setRotationPoint(0.0F, 0.32F, -10.0F);
        this.Neck2.addBox(-3.0F, 0.0F, -8.0F, 6, 9, 8, 0.0F);
        this.setRotateAngle(Neck2, 0.27314402793711257F, 0.0F, 0.0F);
        this.Necklower = new AdvancedModelRenderer(this, 130, 200);
        this.Necklower.setRotationPoint(0.0F, 8.06F, 5.1F);
        this.Necklower.addBox(-2.0F, 0.0F, -14.5F, 4, 4, 16, 0.0F);
        this.setRotateAngle(Necklower, -0.045553093477052F, 0.0F, 0.0F);
        this.Upperlegfrontleft = new AdvancedModelRenderer(this, 260, 200);
        this.Upperlegfrontleft.setRotationPoint(0.02F, 12.49F, 0.47F);
        this.Upperlegfrontleft.addBox(-2.5F, 0.0F, 0.0F, 5, 10, 5, 0.0F);
        this.setRotateAngle(Upperlegfrontleft, 0.22759093446006054F, 0.0F, 0.0F);
        this.Browleft = new AdvancedModelRenderer(this, 90, 100);
        this.Browleft.setRotationPoint(4.0F, 0.1F, -7.5F);
        this.Browleft.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Browleft, 0.0F, -0.27314402793711257F, -0.136659280431156F);
        this.Neck3 = new AdvancedModelRenderer(this, 90, 190);
        this.Neck3.setRotationPoint(-0.03F, -0.04F, -7.9F);
        this.Neck3.addBox(-3.0F, 0.0F, -6.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(Neck3, 0.31869712141416456F, 0.0F, 0.0F);
        this.Lowerlefttoeright = new AdvancedModelRenderer(this, 500, 230);
        this.Lowerlefttoeright.setRotationPoint(0.98F, 3.96F, 0.15F);
        this.Lowerlefttoeright.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowerlefttoeright, -0.5462880558742251F, 0.0F, 0.0F);
        this.Soleleft = new AdvancedModelRenderer(this, 490, 210);
        this.Soleleft.setRotationPoint(-0.02F, 10.6F, 0.0F);
        this.Soleleft.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Soleleft, 0.40980330836826856F, 0.0F, 0.0F);
        this.Upperlefttoeright = new AdvancedModelRenderer(this, 500, 220);
        this.Upperlefttoeright.setRotationPoint(0.0F, -3.27F, 2.44F);
        this.Upperlefttoeright.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Upperlefttoeright, -0.7285004297824331F, -0.40980330836826856F, 0.0F);
        this.Finger2middleright = new AdvancedModelRenderer(this, 315, 155);
        this.Finger2middleright.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Finger2middleright.addBox(0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Finger2middleright, 1.5481070465189704F, 0.045553093477052F, -0.36425021489121656F);
        this.Finger1middleleft = new AdvancedModelRenderer(this, 340, 165);
        this.Finger1middleleft.setRotationPoint(0.2F, 2.0F, 1.4F);
        this.Finger1middleleft.addBox(-1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Finger1middleleft, 0.0F, 0.0F, -0.045553093477052F);
        this.Teeth3 = new AdvancedModelRenderer(this, 149, 240);
        this.Teeth3.setRotationPoint(0.0F, 6.0F, -12.9F);
        this.Teeth3.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F);
        this.Lowerrighttoeright = new AdvancedModelRenderer(this, 500, 230);
        this.Lowerrighttoeright.setRotationPoint(-1.0F, 3.56F, 0.05F);
        this.Lowerrighttoeright.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowerrighttoeright, -0.40980330836826856F, 0.045553093477052F, 0.0F);
        this.Teeth4 = new AdvancedModelRenderer(this, 151, 241);
        this.Teeth4.setRotationPoint(2.3F, 0.0F, -3.0F);
        this.Teeth4.addBox(0.0F, -1.0F, -9.0F, 0, 1, 9, 0.0F);
        this.Upperarmleft = new AdvancedModelRenderer(this, 340, 220);
        this.Upperarmleft.setRotationPoint(2.98F, 3.42F, -1.21F);
        this.Upperarmleft.addBox(-3.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Upperarmleft, -0.091106186954104F, 0.0F, 0.045553093477052F);
        this.Lowerarmright = new AdvancedModelRenderer(this, 315, 190);
        this.Lowerarmright.setRotationPoint(0.45F, 2.78F, 1.75F);
        this.Lowerarmright.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Lowerarmright, -1.2292353921796064F, -0.091106186954104F, 0.136659280431156F);
        this.Thighright = new AdvancedModelRenderer(this, 260, 230);
        this.Thighright.setRotationPoint(-8.0F, -16.0F, 3.0F);
        this.Thighright.addBox(-3.5F, 0.0F, 0.0F, 7, 13, 10, 0.0F);
        this.setRotateAngle(Thighright, -0.40980330836826856F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 5, 175);
        this.Bodyfront.setRotationPoint(0.0F, 0.34F, 0.0F);
        this.Bodyfront.addBox(-6.0F, 0.0F, -15.0F, 12, 16, 15, 0.0F);
        this.setRotateAngle(Bodyfront, 0.18203784098300857F, 0.0F, 0.0F);
        this.Finger1upperleft = new AdvancedModelRenderer(this, 340, 165);
        this.Finger1upperleft.setRotationPoint(0.0F, 2.0F, 0.6F);
        this.Finger1upperleft.addBox(-1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Finger1upperleft, -0.31869712141416456F, -0.045553093477052F, -0.18203784098300857F);
        this.Finger1middleright = new AdvancedModelRenderer(this, 315, 165);
        this.Finger1middleright.setRotationPoint(0.0F, 2.0F, 1.4F);
        this.Finger1middleright.addBox(0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Finger1middleright, 0.0F, 0.0F, 0.045553093477052F);
        this.Middletoesoleright = new AdvancedModelRenderer(this, 500, 240);
        this.Middletoesoleright.setRotationPoint(0.01F, -2.6F, 2.2F);
        this.Middletoesoleright.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Middletoesoleright, -0.31869712141416456F, 0.0F, 0.0F);
        this.Handleft = new AdvancedModelRenderer(this, 340, 175);
        this.Handleft.setRotationPoint(-0.15F, 4.81F, 0.02F);
        this.Handleft.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Handleft, 0.0F, -0.091106186954104F, 0.36425021489121656F);
        this.Finger2upperleft = new AdvancedModelRenderer(this, 340, 155);
        this.Finger2upperleft.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Finger2upperleft.addBox(-1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Finger2upperleft, 1.593485607070823F, 0.0F, 0.5462880558742251F);
        this.Handright = new AdvancedModelRenderer(this, 315, 175);
        this.Handright.setRotationPoint(0.15F, 4.81F, 0.02F);
        this.Handright.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Handright, 0.0F, 0.091106186954104F, -0.36425021489121656F);
        this.Righttoesoleright = new AdvancedModelRenderer(this, 500, 240);
        this.Righttoesoleright.setRotationPoint(0.01F, -2.3F, 3.0F);
        this.Righttoesoleright.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Righttoesoleright, -0.4379031093253773F, 0.0F, 0.0F);
        this.Righttoesoleleft = new AdvancedModelRenderer(this, 500, 240);
        this.Righttoesoleleft.setRotationPoint(0.01F, -2.7F, 1.9F);
        this.Righttoesoleleft.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Righttoesoleleft, -0.27314402793711257F, 0.0F, 0.0F);
        this.Finger2upperright = new AdvancedModelRenderer(this, 315, 155);
        this.Finger2upperright.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Finger2upperright.addBox(0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Finger2upperright, 1.593485607070823F, 0.0F, -0.5462880558742251F);
        this.Neck1 = new AdvancedModelRenderer(this, 90, 230);
        this.Neck1.setRotationPoint(0.0F, 4.08F, -7.5F);
        this.Neck1.addBox(-4.5F, 0.0F, -10.0F, 9, 10, 10, 0.0F);
        this.setRotateAngle(Neck1, -0.6373942428283291F, 0.0F, 0.0F);
        this.Lowermiddletoeright = new AdvancedModelRenderer(this, 500, 230);
        this.Lowermiddletoeright.setRotationPoint(0.0F, 4.1F, 0.26F);
        this.Lowermiddletoeright.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowermiddletoeright, -0.4553564018453205F, 0.0F, 0.0F);
        this.Backhead = new AdvancedModelRenderer(this, 90, 170);
        this.Backhead.setRotationPoint(0.0F, -0.03F, -6.0F);
        this.Backhead.addBox(-3.5F, 0.0F, -7.0F, 7, 10, 7, 0.0F);
        this.setRotateAngle(Backhead, 0.27314402793711257F, 0.0F, 0.0F);
        this.Uppermiddletoeright = new AdvancedModelRenderer(this, 500, 220);
        this.Uppermiddletoeright.setRotationPoint(0.0F, -3.77F, 2.04F);
        this.Uppermiddletoeright.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Uppermiddletoeright, -0.7285004297824331F, 0.0F, 0.0F);
        this.Upperlefttoeleft = new AdvancedModelRenderer(this, 500, 220);
        this.Upperlefttoeleft.setRotationPoint(0.0F, -3.37F, 2.44F);
        this.Upperlefttoeleft.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Upperlefttoeleft, -0.7285004297824331F, -0.40980330836826856F, 0.0F);
        this.Snout = new AdvancedModelRenderer(this, 90, 145);
        this.Snout.setRotationPoint(0.0F, 0.2F, -6.0F);
        this.Snout.addBox(-3.0F, 0.0F, -13.0F, 6, 6, 14, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 5, 105);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 15.0F);
        this.Tail2.addBox(-4.5F, 0.0F, 0.0F, 9, 12, 20, 0.0F);
        this.setRotateAngle(Tail2, 0.014137166941154071F, 0.0F, 0.0F);
        this.Lowermiddletoeleft = new AdvancedModelRenderer(this, 500, 230);
        this.Lowermiddletoeleft.setRotationPoint(0.0F, 4.1F, 0.26F);
        this.Lowermiddletoeleft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowermiddletoeleft, -0.4553564018453205F, 0.0F, 0.0F);
        this.Thightleft = new AdvancedModelRenderer(this, 260, 230);
        this.Thightleft.mirror = true;
        this.Thightleft.setRotationPoint(8.0F, -16.0F, 3.0F);
        this.Thightleft.addBox(-3.5F, 0.0F, 0.0F, 7, 13, 10, 0.0F);
        this.setRotateAngle(Thightleft, -0.40980330836826856F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 90, 125);
        this.Lowerjaw.setRotationPoint(0.0F, 6.3F, -6.6F);
        this.Lowerjaw.addBox(-2.5F, 0.0F, -12.0F, 5, 3, 12, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.091106186954104F, 0.0F, 0.0F);
        this.Upperlegbackleft = new AdvancedModelRenderer(this, 260, 180);
        this.Upperlegbackleft.mirror = true;
        this.Upperlegbackleft.setRotationPoint(0.0F, 11.4F, 5.56F);
        this.Upperlegbackleft.addBox(-2.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.Upperrighttoeright = new AdvancedModelRenderer(this, 500, 220);
        this.Upperrighttoeright.setRotationPoint(0.0F, -3.37F, 2.44F);
        this.Upperrighttoeright.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Upperrighttoeright, -0.7285004297824331F, 0.40980330836826856F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 5, 75);
        this.Tail4.setRotationPoint(0.0F, 0.1F, 19.0F);
        this.Tail4.addBox(-3.5F, 0.0F, 0.0F, 7, 9, 20, 0.0F);
        this.setRotateAngle(Tail4, -0.031415926535897934F, 0.0F, 0.0F);
        this.Uppermiddletoeleft = new AdvancedModelRenderer(this, 500, 220);
        this.Uppermiddletoeleft.setRotationPoint(0.0F, -3.77F, 2.04F);
        this.Uppermiddletoeleft.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Uppermiddletoeleft, -0.7285004297824331F, 0.0F, 0.0F);
        this.Lowerrighttoeleft = new AdvancedModelRenderer(this, 500, 230);
        this.Lowerrighttoeleft.setRotationPoint(0.98F, 3.56F, 0.05F);
        this.Lowerrighttoeleft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowerrighttoeleft, -0.40980330836826856F, 0.045553093477052F, 0.0F);
        this.Heelright = new AdvancedModelRenderer(this, 260, 130);
        this.Heelright.setRotationPoint(0.0F, -3.64F, 9.6F);
        this.Heelright.addBox(-2.0F, 0.0F, 0.0F, 4, 11, 5, 0.0F);
        this.setRotateAngle(Heelright, 0.5009094953223726F, 0.0F, 0.0F);
        this.Upperlefttoeleft_1 = new AdvancedModelRenderer(this, 500, 220);
        this.Upperlefttoeleft_1.setRotationPoint(0.0F, -3.37F, 2.44F);
        this.Upperlefttoeleft_1.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Upperlefttoeleft_1, -0.7285004297824331F, 0.40980330836826856F, 0.0F);
        this.Browright = new AdvancedModelRenderer(this, 90, 100);
        this.Browright.setRotationPoint(-4.2F, 0.1F, -7.5F);
        this.Browright.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Browright, 0.0F, 0.27314402793711257F, 0.136659280431156F);
        this.Teeth2 = new AdvancedModelRenderer(this, 150, 240);
        this.Teeth2.setRotationPoint(2.9F, 6.0F, -3.0F);
        this.Teeth2.addBox(0.0F, 0.0F, -10.0F, 0, 1, 10, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 5, 140);
        this.Tail1.setRotationPoint(0.0F, 1.3F, 19.0F);
        this.Tail1.addBox(-5.5F, 0.0F, 0.0F, 11, 15, 16, 0.0F);
        this.setRotateAngle(Tail1, 0.10524335389525807F, 0.0F, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 5, 45);
        this.Tail5.setRotationPoint(0.0F, 0.1F, 19.0F);
        this.Tail5.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 21, 0.0F);
        this.setRotateAngle(Tail5, -0.039269908169872414F, 0.0F, 0.0F);
        this.Upperlegfrontright = new AdvancedModelRenderer(this, 260, 200);
        this.Upperlegfrontright.setRotationPoint(0.0F, 12.49F, 0.47F);
        this.Upperlegfrontright.addBox(-2.5F, 0.0F, 0.0F, 5, 10, 5, 0.0F);
        this.setRotateAngle(Upperlegfrontright, 0.22759093446006054F, 0.0F, 0.0F);
        this.Finger1upperright = new AdvancedModelRenderer(this, 315, 165);
        this.Finger1upperright.setRotationPoint(0.0F, 2.0F, 0.6F);
        this.Finger1upperright.addBox(0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Finger1upperright, -0.31869712141416456F, -0.045553093477052F, 0.18203784098300857F);
        this.Teeth5 = new AdvancedModelRenderer(this, 151, 241);
        this.Teeth5.setRotationPoint(-2.3F, 0.0F, -3.0F);
        this.Teeth5.addBox(0.0F, -1.0F, -9.0F, 0, 1, 9, 0.0F);
        this.Soleright = new AdvancedModelRenderer(this, 490, 210);
        this.Soleright.setRotationPoint(0.01F, 10.6F, 0.0F);
        this.Soleright.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Soleright, 0.36425021489121656F, 0.0F, 0.0F);
        this.Teeth1 = new AdvancedModelRenderer(this, 150, 240);
        this.Teeth1.setRotationPoint(-2.9F, 6.0F, -3.0F);
        this.Teeth1.addBox(0.0F, 0.0F, -10.0F, 0, 1, 10, 0.0F);
        this.Lowerlegright = new AdvancedModelRenderer(this, 260, 155);
        this.Lowerlegright.setRotationPoint(-0.04F, 10.01F, 0.15F);
        this.Lowerlegright.addBox(-2.5F, -6.0F, 0.0F, 5, 6, 14, 0.0F);
        this.setRotateAngle(Lowerlegright, -0.6829473363053812F, 0.0F, 0.0F);
        this.Lowerlegleft = new AdvancedModelRenderer(this, 260, 155);
        this.Lowerlegleft.mirror = true;
        this.Lowerlegleft.setRotationPoint(0.04F, 10.01F, 0.15F);
        this.Lowerlegleft.addBox(-2.5F, -6.0F, 0.0F, 5, 6, 14, 0.0F);
        this.setRotateAngle(Lowerlegleft, -0.6829473363053812F, 0.0F, 0.0F);
        this.Finger2middleleft = new AdvancedModelRenderer(this, 340, 155);
        this.Finger2middleleft.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Finger2middleleft.addBox(-1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Finger2middleleft, 1.5481070465189704F, 0.045553093477052F, 0.36425021489121656F);
        this.Teeth6 = new AdvancedModelRenderer(this, 150, 240);
        this.Teeth6.setRotationPoint(-0.5F, 0.0F, -12.0F);
        this.Teeth6.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 0, 0.0F);
        this.Upperarmright = new AdvancedModelRenderer(this, 315, 220);
        this.Upperarmright.setRotationPoint(-2.98F, 3.42F, -1.21F);
        this.Upperarmright.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Upperarmright, -0.091106186954104F, 0.0F, -0.045553093477052F);
        this.Rightshoulder = new AdvancedModelRenderer(this, 315, 240);
        this.Rightshoulder.setRotationPoint(-4.0F, 11.0F, -11.0F);
        this.Rightshoulder.addBox(-3.0F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(Rightshoulder, 0.4553564018453205F, 0.0F, 0.18203784098300857F);
        this.Lefttoesoleright = new AdvancedModelRenderer(this, 500, 240);
        this.Lefttoesoleright.setRotationPoint(-0.01F, -2.7F, 1.9F);
        this.Lefttoesoleright.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Lefttoesoleright, -0.27314402793711257F, 0.0F, 0.0F);
        this.Lowerarmleft = new AdvancedModelRenderer(this, 340, 190);
        this.Lowerarmleft.setRotationPoint(-0.45F, 2.78F, 1.75F);
        this.Lowerarmleft.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Lowerarmleft, -1.2292353921796064F, 0.091106186954104F, -0.136659280431156F);
        this.Tail6 = new AdvancedModelRenderer(this, 5, 15);
        this.Tail6.setRotationPoint(0.0F, 0.1F, 20.0F);
        this.Tail6.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 24, 0.0F);
        this.setRotateAngle(Tail6, -0.020420352248333655F, 0.0F, 0.0F);
        this.Heelleft = new AdvancedModelRenderer(this, 260, 130);
        this.Heelleft.mirror = true;
        this.Heelleft.setRotationPoint(0.0F, -3.64F, 9.6F);
        this.Heelleft.addBox(-2.0F, 0.0F, 0.0F, 4, 11, 5, 0.0F);
        this.setRotateAngle(Heelleft, 0.5009094953223726F, 0.0F, 0.0F);
        this.Lefttoesoleleft = new AdvancedModelRenderer(this, 500, 240);
        this.Lefttoesoleleft.setRotationPoint(-0.01F, -2.3F, 3.0F);
        this.Lefttoesoleleft.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Lefttoesoleleft, -0.4379031093253773F, 0.0F, 0.0F);
        this.Upperlefttoeleft_1.addChild(this.Lowerleftoeleft);
        this.Lowermiddletoeleft.addChild(this.Middletoesoleleft);
        this.Thighright.addChild(this.Upperlegbackright);
        this.Tail2.addChild(this.Tail3);
        this.Bodyfront.addChild(this.Leftshoulder);
        this.Neck1.addChild(this.Neck2);
        this.Neck2.addChild(this.Necklower);
        this.Thightleft.addChild(this.Upperlegfrontleft);
        this.Backhead.addChild(this.Browleft);
        this.Neck2.addChild(this.Neck3);
        this.Upperlefttoeright.addChild(this.Lowerlefttoeright);
        this.Heelleft.addChild(this.Soleleft);
        this.Soleright.addChild(this.Upperlefttoeright);
        this.Finger1middleright.addChild(this.Finger2middleright);
        this.Handleft.addChild(this.Finger1middleleft);
        this.Snout.addChild(this.Teeth3);
        this.Upperrighttoeright.addChild(this.Lowerrighttoeright);
        this.Lowerjaw.addChild(this.Teeth4);
        this.Leftshoulder.addChild(this.Upperarmleft);
        this.Upperarmright.addChild(this.Lowerarmright);
        this.Bodymain.addChild(this.Bodyfront);
        this.Handleft.addChild(this.Finger1upperleft);
        this.Handright.addChild(this.Finger1middleright);
        this.Lowermiddletoeright.addChild(this.Middletoesoleright);
        this.Lowerarmleft.addChild(this.Handleft);
        this.Finger1upperleft.addChild(this.Finger2upperleft);
        this.Lowerarmright.addChild(this.Handright);
        this.Lowerrighttoeright.addChild(this.Righttoesoleright);
        this.Lowerleftoeleft.addChild(this.Righttoesoleleft);
        this.Finger1upperright.addChild(this.Finger2upperright);
        this.Bodyfront.addChild(this.Neck1);
        this.Uppermiddletoeright.addChild(this.Lowermiddletoeright);
        this.Neck3.addChild(this.Backhead);
        this.Soleright.addChild(this.Uppermiddletoeright);
        this.Soleleft.addChild(this.Upperlefttoeleft);
        this.Backhead.addChild(this.Snout);
        this.Tail1.addChild(this.Tail2);
        this.Uppermiddletoeleft.addChild(this.Lowermiddletoeleft);
        this.Backhead.addChild(this.Lowerjaw);
        this.Thightleft.addChild(this.Upperlegbackleft);
        this.Soleright.addChild(this.Upperrighttoeright);
        this.Tail3.addChild(this.Tail4);
        this.Soleleft.addChild(this.Uppermiddletoeleft);
        this.Upperlefttoeleft.addChild(this.Lowerrighttoeleft);
        this.Lowerlegright.addChild(this.Heelright);
        this.Soleleft.addChild(this.Upperlefttoeleft_1);
        this.Backhead.addChild(this.Browright);
        this.Snout.addChild(this.Teeth2);
        this.Bodymain.addChild(this.Tail1);
        this.Tail4.addChild(this.Tail5);
        this.Thighright.addChild(this.Upperlegfrontright);
        this.Handright.addChild(this.Finger1upperright);
        this.Lowerjaw.addChild(this.Teeth5);
        this.Heelright.addChild(this.Soleright);
        this.Snout.addChild(this.Teeth1);
        this.Upperlegfrontright.addChild(this.Lowerlegright);
        this.Upperlegfrontleft.addChild(this.Lowerlegleft);
        this.Finger1middleleft.addChild(this.Finger2middleleft);
        this.Lowerjaw.addChild(this.Teeth6);
        this.Rightshoulder.addChild(this.Upperarmright);
        this.Bodyfront.addChild(this.Rightshoulder);
        this.Lowerlefttoeright.addChild(this.Lefttoesoleright);
        this.Upperarmleft.addChild(this.Lowerarmleft);
        this.Tail5.addChild(this.Tail6);
        this.Lowerlegleft.addChild(this.Heelleft);
        this.Lowerrighttoeleft.addChild(this.Lefttoesoleleft);
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Bodymain.render(f5);
        this.Thighright.render(f5);
        this.Thightleft.render(f5);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float rotation, float rotationYaw, float rotationPitch, float partialTicks, Entity entity)
    {
        resetToDefaultPose();
        this.faceTarget(rotationYaw, rotationPitch, 1.0F, Neck1, Neck2, Neck3, Backhead);

        limbSwing = entity.ticksExisted;
        limbSwingAmount = 0.5F;


        float globalSpeed = 0.3F;
        float globalHeight = 1.0F;
        float globalDegree = 1.0F;

        /*
        //Idle Animations
        //Neck
        walk(Neck1, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, tileentity.ticksExisted, 1);
        walk(Neck2, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, tileentity.ticksExisted, 1);
        walk(Neck3, 0.1F, 0.03F * globalHeight, true, 3.0F, 0.0F, tileentity.ticksExisted, 1);

        //Head
        walk(Backhead, 0.1F, 0.0F * globalHeight, true, 0.0F, 0.0F, tileentity.ticksExisted, 1);
        walk(Lowerjaw, 0.1F, 0.0F * globalHeight, true, 0.0F, -0.15F, tileentity.ticksExisted, 1);

        //Tail
        swing(Tail1, 0.05F, 0.15F * globalHeight, true, 0.0F, 0.0F, tileentity.ticksExisted, 1);
        swing(Tail2, 0.05F, 0.15F * globalHeight, true, 0.0F, 0.0F, tileentity.ticksExisted, 1);
        swing(Tail3, 0.05F, 0.05F * globalHeight, true, 0.0F, 0.0F, tileentity.ticksExisted, 1);
        swing(Tail4, 0.05F, 0.05F * globalHeight, true, 0.0F, 0.0F, tileentity.ticksExisted, 1);
        swing(Tail5, 0.05F, 0.05F * globalHeight, true, 0.0F, 0.0F, tileentity.ticksExisted, 1);

        //Left Arm
        walk(Leftshoulder, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        walk(Upperarmleft, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        walk(Lowerarmleft, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        walk(Handleft, 0.1F, 0.05F * globalHeight, false, 0.5F, 0.0F, tileentity.ticksExisted, 1);

        flap(Leftshoulder, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        flap(Upperarmleft, 0.1F, 0.04F * globalHeight, true, -0.5F, 0.0F, tileentity.ticksExisted, 1);
        flap(Lowerarmleft, 0.1F, 0.04F * globalHeight, true, -0.5F, 0.0F, tileentity.ticksExisted, 1);
        flap(Handleft, 0.1F, 0.04F * globalHeight, true, -0.5F, 0.0F, tileentity.ticksExisted, 1);

        //Right Arm
        walk(Rightshoulder, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        walk(Upperarmright, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        walk(Lowerarmright, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        walk(Handright, 0.1F, 0.05F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);

        flap(Rightshoulder, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        flap(Upperarmright, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        flap(Lowerarmright, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        flap(Handright, 0.1F, 0.04F * globalHeight, true, 0.5F, 0.0F, tileentity.ticksExisted, 1);
        */

        //Walking Animations
        //Body
        bob(Bodymain, 0.9F * globalSpeed, 0.6F * globalHeight, false, limbSwing, limbSwingAmount);

        //Right Leg
        walk(Thighright, 0.4F* globalSpeed, 0.2F * globalHeight, true, 0.0F, -0.1F, limbSwing, limbSwingAmount);
        walk(Upperlegfrontright, 0.4F* globalSpeed, 0.2F * globalHeight, true, 0.0F, 0.1F, limbSwing, limbSwingAmount);
        walk(Upperlegbackright, 0.4F* globalSpeed, 0.5F * globalHeight, true, 0.0F, 0.2F, limbSwing, limbSwingAmount);
        walk(Lowerlegright, 0.4F* globalSpeed, 0.2F * globalHeight, true, 0.0F, 0.1F, limbSwing, limbSwingAmount);
        walk(Heelright, 0.4F* globalSpeed, -0.4F * globalHeight, true, 0.0F, 0.1F, limbSwing, limbSwingAmount);

        //Left Leg
        walk(Thightleft, 0.4F* globalSpeed, 0.2F * globalHeight, false, -0.2F, -0.1F, limbSwing, limbSwingAmount);
        walk(Upperlegfrontleft, 0.4F* globalSpeed, 0.2F * globalHeight, false, -0.2F, -0.1F, limbSwing, limbSwingAmount);
        walk(Upperlegbackleft, 0.4F* globalSpeed, 0.2F * globalHeight, false, -0.2F, -0.1F, limbSwing, limbSwingAmount);
        walk(Lowerlegleft, 0.4F* globalSpeed, 0.2F * globalHeight, false, -0.2F, -0.1F, limbSwing, limbSwingAmount);
        walk(Heelleft, 0.4F* globalSpeed, -0.35F * globalHeight, false, -0.2F, -0.1F, limbSwing, limbSwingAmount);
        walk(Soleleft, 0.4F* globalSpeed, -0.25F * globalHeight, false, -0.2F, 0.2F, limbSwing, limbSwingAmount);

        //Left Arm
        walk(Leftshoulder, 0.05F* globalSpeed, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Upperarmleft, 0.05F* globalSpeed, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Lowerarmleft, 0.05F* globalSpeed, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Handleft, 0.05F* globalSpeed, 0.05F * globalHeight, false, 0.5F, 0.0F, entity.ticksExisted, 1);

        flap(Leftshoulder, 0.05F* globalSpeed, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Upperarmleft, 0.05F* globalSpeed, 0.04F * globalHeight, true, -0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Lowerarmleft, 0.05F* globalSpeed, 0.04F * globalHeight, true, -0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Handleft, 0.05F* globalSpeed, 0.04F * globalHeight, true, -0.5F, 0.0F, entity.ticksExisted, 1);

        //Right Arm
        walk(Rightshoulder, 0.05F* globalSpeed, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Upperarmright, 0.05F* globalSpeed, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Lowerarmright, 0.05F* globalSpeed, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        walk(Handright, 0.05F* globalSpeed, 0.05F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);

        flap(Rightshoulder, 0.05F* globalSpeed, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Upperarmright, 0.05F* globalSpeed, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Lowerarmright, 0.05F* globalSpeed, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);
        flap(Handright, 0.05F* globalSpeed, 0.04F * globalHeight, true, 0.5F, 0.0F, entity.ticksExisted, 1);

        //Neck
        walk(Neck1, 0.8F* globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Neck2, 0.8F* globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);
        walk(Neck3, 0.8F* globalSpeed, 0.03F * globalHeight, true, 3.0F, 0.0F, limbSwing, limbSwingAmount);

        //Head
        walk(Backhead, 0.1F* globalSpeed, 0.0F * globalHeight, true, 0.0F, 0.0F, entity.ticksExisted, 1);
        walk(Lowerjaw, 0.1F* globalSpeed, 0.01F * globalHeight, true, 0.0F, -0.15F, entity.ticksExisted, 1);

        //Tail
        swing(Tail1, 0.2F * globalSpeed, 0.15F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail2, 0.2F * globalSpeed, 0.15F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail3, 0.2F * globalSpeed, 0.05F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail4, 0.2F * globalSpeed, 0.05F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
        swing(Tail5, 0.2F * globalSpeed, 0.05F * globalHeight, true, 0, 0.0F, limbSwing, limbSwingAmount);
    }
}
