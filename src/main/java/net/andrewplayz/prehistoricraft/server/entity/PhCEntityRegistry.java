package net.andrewplayz.prehistoricraft.server.entity;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.content.IContentHandler;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityAcrocanthosaurus;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntityRugocaudia;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntitySauropelta;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntitySauroposeidon;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityOrnithomimus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityTenontosaurus;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class PhCEntityRegistry implements IContentHandler {

    @Override
    public void init() {

    }

    @Override
    public void gameRegistry() throws Exception {
        EntityRegistry.registerModEntity(EntityAcrocanthosaurus.class, "acrocanthosaurus", 1, PrehistoriCraft.instance, 0x995134, 0x94533A, true);
        EntityRegistry.registerModEntity(EntityOrnithomimus.class, "ornithomimus", 2, PrehistoriCraft.instance, 0x663300, 0x0073e6, true);
        EntityRegistry.registerModEntity(EntityRugocaudia.class, "rugocaudia", 3, PrehistoriCraft.instance, 0xf2f2f2, 0x003300, true);
        EntityRegistry.registerModEntity(EntitySauropelta.class, "sauropelta", 4, PrehistoriCraft.instance, 0x4d2600, 0x804000, true);
        EntityRegistry.registerModEntity(EntitySauroposeidon.class, "sauroposeidon", 5, PrehistoriCraft.instance, 0x264d00, 0x1a3300, true);
        EntityRegistry.registerModEntity(EntityTenontosaurus.class, "tenontosaurus", 6, PrehistoriCraft.instance, 0x446600, 0x213300, true);
    }

    protected ResourceLocation AnimalTexture;
}
