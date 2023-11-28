package gregicality.multiblocks.api.utils;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;

import gregicality.multiblocks.TekCaySimpleAddon;

public final class GCYMUtil {

    public static @NotNull ResourceLocation gcymId(@NotNull String path) {
        return new ResourceLocation(TekCaySimpleAddon.MODID, path);
    }

    private GCYMUtil() {}
}
