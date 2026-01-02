package com.redcraft86.template;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import com.redcraft86.template.configs.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TemplateMod.MOD_ID)
public class TemplateMod {
    public static final String MOD_ID = "template";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TemplateMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        context.registerConfig(ModConfig.Type.CLIENT, ClientCfg.SPEC);
        context.registerConfig(ModConfig.Type.COMMON, CommonCfg.SPEC);
    }
}