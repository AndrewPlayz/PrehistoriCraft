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
        EntityRegistry.registerModEntity(EntityAcrocanthosaurus.class, "acrocanthosaurus", 100, PrehistoriCraft.instance, 21, 21, true);
        EntityRegistry.registerModEntity(EntityOrnithomimus.class, "ornithomimus", 101, PrehistoriCraft.instance, 21, 21, true);
        EntityRegistry.registerModEntity(EntityRugocaudia.class, "rugocaudia", 102, PrehistoriCraft.instance, 21, 21, true);
        EntityRegistry.registerModEntity(EntitySauropelta.class, "sauropelta", 103, PrehistoriCraft.instance, 21, 21, true);
        EntityRegistry.registerModEntity(EntitySauroposeidon.class, "sauroposeidon", 104, PrehistoriCraft.instance, 21, 21, true);
        EntityRegistry.registerModEntity(EntityTenontosaurus.class, "tenontosaurus", 105, PrehistoriCraft.instance, 21, 21, true);
    }

    protected ResourceLocation AnimalTexture;
}
