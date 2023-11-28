package tekcay.simpleaddon.loaders.recipe.handlers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;

import tekcay.simpleaddon.api.unification.properties.AlloyBlastProperty;
import tekcay.simpleaddon.api.unification.properties.GCYMPropertyKey;

public final class TKCYSAMaterialRecipeHandler {

    private TKCYSAMaterialRecipeHandler() {}

    public static void register() {
        OrePrefix.ingot.addProcessingHandler(GCYMPropertyKey.ALLOY_BLAST,
                TKCYSAMaterialRecipeHandler::generateAlloyBlastRecipes);
    }

    /**
     * Generates alloy blast recipes for a material
     *
     * @param material the material to generate for
     * @param property the blast property of the material
     */
    public static void generateAlloyBlastRecipes(@Nullable OrePrefix unused, @NotNull Material material,
                                                 @NotNull AlloyBlastProperty property) {
        if (material.hasProperty(PropertyKey.BLAST)) {
            property.getRecipeProducer().produce(material, material.getProperty(PropertyKey.BLAST));
        }
    }
}
