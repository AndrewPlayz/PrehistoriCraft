package net.andrewplayz.prehistoricraft.server.core;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityDaspletosaurus;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityTroodon;
import net.andrewplayz.prehistoricraft.server.entity.neutral.*;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityHypacrosaurus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityOrnithomimus;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class PhCEntities{
    public static void init() {
        EntityRegistry.registerModEntity(EntityOrnithomimus.class, "ornithomimus", 1, PrehistoriCraft.INSTANCE, 1024, 1, true, 0x663300, 0x0073e6);
        EntityRegistry.registerModEntity(EntityAnodontosaurus.class, "anodontosaurus", 2, PrehistoriCraft.INSTANCE, 1024, 1, true, 0x483754, 0x9E94A6);
        EntityRegistry.registerModEntity(EntityDaspletosaurus.class, "daspletosaurus", 3, PrehistoriCraft.INSTANCE, 1024, 1, true, 0x2F2536, 0xD49753);
        EntityRegistry.registerModEntity(EntityEdmontonia.class, "edmontonia", 4, PrehistoriCraft.INSTANCE, 1024, 1, true, 0xDB6023, 0x8C807A);
        EntityRegistry.registerModEntity(EntityHypacrosaurus.class, "hypacrosaurus", 5, PrehistoriCraft.INSTANCE, 1024, 1, true, 0xDBDBDB, 0x3D3D3D);
        EntityRegistry.registerModEntity(EntityPachyrhinosaurusCanadensis.class, "pachyrhinosauruscanadensis", 6, PrehistoriCraft.INSTANCE, 1024, 1, true, 0x331a00, 0xC2C4C4);
        EntityRegistry.registerModEntity(EntityPachyrhinosaurusLakustai.class, "pachyrhinosauruslakustai", 7, PrehistoriCraft.INSTANCE, 1024, 1, true, 0x1a0d00, 0xC2C4C4);
        EntityRegistry.registerModEntity(EntityTroodon.class, "troodon", 8, PrehistoriCraft.INSTANCE, 1024, 1, true, 0x4D4D61, 0xE3E3E3);
    }
}
