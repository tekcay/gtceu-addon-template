package gregicality.multiblocks.loaders.recipe;

import gregicality.multiblocks.loaders.recipe.handlers.GCYMMaterialRecipeHandler;

public final class TKCYSARecipeLoader {

    private TKCYSARecipeLoader() {}

    public static void init() {
        GCYMMetaTileEntityLoader.init();
        GCYMCasingLoader.init();
        GCYMMixerRecipes.init();
        GCYMMiscRecipes.init();
        GCYMMaterialRecipeHandler.register();
        ManualABSRecipes.register();
    }
}
