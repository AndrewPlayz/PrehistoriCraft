package net.andrewplayz.prehistoricraft.server.entity;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.content.IContentHandler;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityAcrocanthosaurus;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityDaspletosaurus;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityTroodon;
import net.andrewplayz.prehistoricraft.server.entity.neutral.*;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityHypacrosaurus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityOrnithomimus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityTenontosaurus;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class PhCEntityRegistryHandler implements IContentHandler {

    @Override
    public void init() {

    }

    @Override
    public void gameRegistry() throws Exception {
        EntityRegistry.registerModEntity(EntityAcrocanthosaurus.class, "acrocanthosaurus", 1, PrehistoriCraft.instance, 1024, 1, true, 0x995134, 0x94533A);
        EntityRegistry.registerModEntity(EntityOrnithomimus.class, "ornithomimus", 2, PrehistoriCraft.instance, 1024, 1, true, 0x663300, 0x0073e6);
        EntityRegistry.registerModEntity(EntityRugocaudia.class, "rugocaudia", 3, PrehistoriCraft.instance, 1024, 1, true, 0xf2f2f2, 0x003300);
        EntityRegistry.registerModEntity(EntitySauropelta.class, "sauropelta", 4, PrehistoriCraft.instance, 1024, 1, true, 0x4d2600, 0x804000);
        EntityRegistry.registerModEntity(EntitySauroposeidon.class, "sauroposeidon", 5, PrehistoriCraft.instance, 1024, 1, true, 0x264d00, 0x1a3300);
        EntityRegistry.registerModEntity(EntityTenontosaurus.class, "tenontosaurus", 6, PrehistoriCraft.instance, 1024, 1, true, 0x446600, 0x213300);
        EntityRegistry.registerModEntity(EntityAnodontosaurus.class, "anodontosaurus", 7, PrehistoriCraft.instance, 1024, 1, true, 0x483754, 0x9E94A6);
        EntityRegistry.registerModEntity(EntityDaspletosaurus.class, "daspletosaurus", 8, PrehistoriCraft.instance, 1024, 1, true, 0x2F2536, 0xD49753);
        EntityRegistry.registerModEntity(EntityEdmontonia.class, "edmontonia", 9, PrehistoriCraft.instance, 1024, 1, true, 0xDB6023, 0x8C807A);
        EntityRegistry.registerModEntity(EntityHypacrosaurus.class, "hypacrosaurus", 10, PrehistoriCraft.instance, 1024, 1, true, 0xDBDBDB, 0x3D3D3D);
        EntityRegistry.registerModEntity(EntityPachyrhinosaurusCanadensis.class, "pachyrhinosauruscanadensis", 11, PrehistoriCraft.instance, 1024, 1, true, 0xB56B21, 0x872518);
        EntityRegistry.registerModEntity(EntityPachyrhinosaurusLakustai.class, "pachyrhinosauruslakustai", 12, PrehistoriCraft.instance, 1024, 1, true, 0x96602A, 0x872518);
        EntityRegistry.registerModEntity(EntityTroodon.class, "troodon", 13, PrehistoriCraft.instance, 1024, 1, true, 0x4D4D61, 0xE3E3E3);
    }

    protected ResourceLocation AnimalTexture;
}
