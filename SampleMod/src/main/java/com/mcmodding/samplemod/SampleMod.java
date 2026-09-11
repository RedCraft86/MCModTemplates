package com.mcmodding.samplemod;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import com.mcmodding.samplemod.configs.*;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

@Mod(SampleMod.MOD_ID)
public class SampleMod {
    public static final String MOD_ID = "samplemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SampleMod(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.CLIENT, ClientCfg.SPEC);
        modContainer.registerConfig(ModConfig.Type.COMMON, CommonCfg.SPEC);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
