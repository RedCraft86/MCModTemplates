package com.samples.samplemod;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import com.samples.samplemod.configs.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SampleMod.MOD_ID)
public class SampleMod {
    public static final String MOD_ID = "samplemod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SampleMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        context.registerConfig(ModConfig.Type.CLIENT, ClientCfg.SPEC);
        context.registerConfig(ModConfig.Type.COMMON, CommonCfg.SPEC);
    }
}