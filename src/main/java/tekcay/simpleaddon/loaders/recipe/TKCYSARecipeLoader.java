package tekcay.simpleaddon.loaders.recipe;

import tekcay.simpleaddon.loaders.recipe.handlers.TKCYSAMaterialRecipeHandler;

public final class TKCYSARecipeLoader {

    private TKCYSARecipeLoader() {}

    public static void init() {
        TKCYSAMaterialRecipeHandler.register();
    }
}
