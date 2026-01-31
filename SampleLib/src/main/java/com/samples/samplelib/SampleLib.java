package com.samples.samplelib;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import com.samples.samplelib.configs.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SampleLib.MOD_ID)
public class SampleLib {
    public static final String MOD_ID = "samplelib";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SampleLib(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        context.registerConfig(ModConfig.Type.CLIENT, ClientCfg.SPEC);
        context.registerConfig(ModConfig.Type.COMMON, CommonCfg.SPEC);
    }
}