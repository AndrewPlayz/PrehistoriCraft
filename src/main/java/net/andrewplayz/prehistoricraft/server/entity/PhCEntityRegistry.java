package net.andrewplayz.prehistoricraft.server.entity;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.ilexiconn.llibrary.common.entity.EntityHelper;

public class PhCEntityRegistry implements IContentHandler {
    @Override
    public void init() {

    }

    @Override
    public void gameRegistry() throws Exception {
        EntityHelper.registerEntity("Acrocanthosaurus", EntityAcrocanthosaurus.class, 2, PrehistoriCraft.instance, 0x995134, 0x94533A);
        EntityHelper.registerEntity("Titanoceratops", EntityTitanoceratops.class, 3, PrehistoriCraft.instance, 0x7D5E1D, 0xAD8121);
        EntityHelper.registerEntity("Tenontosaurus", EntityTenontosaurus.class, 4, PrehistoriCraft.instance, 0x0C4706, 0x237819);
    }
}
