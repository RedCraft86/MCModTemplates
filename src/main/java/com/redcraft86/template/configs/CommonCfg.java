package com.redcraft86.template.configs;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonCfg {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

//    public static final ModConfigSpec.BooleanValue EXAMPLE_CFG = BUILDER
//            .comment("This is an example config")
//            .define("exampleCfg", true);

    public static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean isLoaded() { return SPEC.isLoaded(); }
}
