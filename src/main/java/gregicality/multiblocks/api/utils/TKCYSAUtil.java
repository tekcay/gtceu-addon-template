package gregicality.multiblocks.api.utils;

import gregicality.multiblocks.TekCaySimpleAddon;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public final class TKCYSAUtil {

    public static @NotNull ResourceLocation tkcysa(@NotNull String path) {
        return new ResourceLocation(TekCaySimpleAddon.MODID, path);
    }

    private TKCYSAUtil() {}
}
