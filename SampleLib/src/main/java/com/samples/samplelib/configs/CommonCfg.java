package com.samples.samplelib.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonCfg {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean isLoaded() { return SPEC.isLoaded(); }
}