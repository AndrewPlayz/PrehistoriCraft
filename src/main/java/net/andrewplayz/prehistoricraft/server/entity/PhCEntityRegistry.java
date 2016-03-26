package net.andrewplayz.prehistoricraft.server.entity;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityAcrocanthosaurus;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntityRugocaudia;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntitySauropelta;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntitySauroposeidon;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityOrnithomimus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityTenontosaurus;
import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.ilexiconn.llibrary.common.entity.EntityHelper;
import net.minecraft.util.ResourceLocation;

public class PhCEntityRegistry implements IContentHandler {
    @Override
    public void init() {

    }

    @Override
    public void gameRegistry() throws Exception {
        EntityHelper.registerEntity("acrocanthosaurus", EntityAcrocanthosaurus.class, 1, PrehistoriCraft.instance, 0x995134, 0x94533A);
        EntityHelper.registerEntity("ornithomimus", EntityOrnithomimus.class, 2, PrehistoriCraft.instance, 0x663300, 0x0073e6);
        EntityHelper.registerEntity("rugocaudia", EntityRugocaudia.class, 3, PrehistoriCraft.instance, 0xf2f2f2, 0x003300);
        EntityHelper.registerEntity("sauropelta", EntitySauropelta.class, 4, PrehistoriCraft.instance, 0x4d2600, 0x804000);
        EntityHelper.registerEntity("sauroposeidon", EntitySauroposeidon.class, 5, PrehistoriCraft.instance, 0x264d00, 0x1a3300);
        EntityHelper.registerEntity("tenontosaurus", EntityTenontosaurus.class, 6, PrehistoriCraft.instance, 0x446600, 0x213300);
    }

    protected ResourceLocation AnimalTexture;
}
