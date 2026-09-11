package com.mcmodding.samplelib.configs;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonCfg {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue UNFUNNY_NUMBER;

    static {
        BUILDER.push("unfunnySection");

        UNFUNNY_NUMBER = BUILDER.comment("This is an unfunny number... (I think)")
                .defineInRange("unfunnyNumber", 67, 0, 100);

        BUILDER.pop();
    }

    public static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean isLoaded() { return SPEC.isLoaded(); }
}
