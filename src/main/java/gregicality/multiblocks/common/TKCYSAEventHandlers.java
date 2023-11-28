package gregicality.multiblocks.common;

import gregicality.multiblocks.TekCaySimpleAddon;
import gregicality.multiblocks.api.unification.TKCYSAMaterials;
import gregicality.multiblocks.api.unification.TKCYSAMaterialFlagAddition;
import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.PostMaterialEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
@Mod.EventBusSubscriber(modid = TekCaySimpleAddon.MODID)
public final class TKCYSAEventHandlers {

    private TKCYSAEventHandlers() {}

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerMaterials(MaterialEvent event) {
        TKCYSAMaterials.init();
    }

    @SubscribeEvent
    public static void registerMaterialsPost(PostMaterialEvent event) {
        TKCYSAMaterialFlagAddition.initLate();
    }
}
