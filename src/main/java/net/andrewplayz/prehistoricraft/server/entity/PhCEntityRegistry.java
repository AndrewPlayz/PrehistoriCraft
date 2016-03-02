package net.andrewplayz.prehistoricraft.server.entity;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityAcrocanthosaurus;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityElasmotherium;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityHyena;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntityTitanoceratops;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityTenontosaurus;
import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.ilexiconn.llibrary.common.entity.EntityHelper;

public class PhCEntityRegistry implements IContentHandler {
    @Override
    public void init() {

    }

    @Override
    public void gameRegistry() throws Exception {
        EntityHelper.registerEntity("Hyena", EntityHyena.class, 0, PrehistoriCraft.instance, 0xBF9039, 0xDEB364);
        EntityHelper.registerEntity("Elasmotherium", EntityElasmotherium.class, 1, PrehistoriCraft.instance, 0x5C2F12, 0x7A4523);
        EntityHelper.registerEntity("Acrocanthosaurus", EntityAcrocanthosaurus.class, 2, PrehistoriCraft.instance, 0x995134, 0x94533A);
        EntityHelper.registerEntity("Titanoceratops", EntityTitanoceratops.class, 3, PrehistoriCraft.instance, 0x7D5E1D, 0xAD8121);
        EntityHelper.registerEntity("Tenontosaurus", EntityTenontosaurus.class, 4, PrehistoriCraft.instance, 0x0C4706, 0x237819);
    }
}
