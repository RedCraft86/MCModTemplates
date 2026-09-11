package com.mcmodding.samplelib.configs;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ClientCfg {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue FUNNY_BOOLEAN;

    static {
        BUILDER.push("funnySection");

        FUNNY_BOOLEAN = BUILDER.comment("This is a funny boolean... (I think)")
                .define("funnyBoolean", true);

        BUILDER.pop();
    }

    public static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean isLoaded() { return SPEC.isLoaded(); }
}
