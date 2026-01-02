package com.redcraft86.template.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientCfg {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    // public static final ForgeConfigSpec.ConfigValue<List<? extends String>> SOME_PROPERTY;

//    static {
//         Initialization
//         SOME_PROPERTY = Some builder value
//    }

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean isLoaded() { return SPEC.isLoaded(); }
}