package com.kevinthegreat.skyblockmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = SkyblockMod.MOD_ID, name = SkyblockMod.MOD_NAME, version = SkyblockMod.VERSION, acceptedMinecraftVersions = "[1.8.9]", clientSideOnly = true)
public class SkyblockMod {

    public static final String MOD_ID = "skyblockmod";
    public static final String MOD_NAME = "SkyblockMod";
    public static final String VERSION = "1.0.0";
    public static SkyblockMod skyblockMod;
    public final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        skyblockMod = this;
        LOGGER.info(MOD_NAME + " initialized.");
    }
}