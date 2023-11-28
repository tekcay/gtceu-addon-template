package gregicality.multiblocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.jetbrains.annotations.NotNull;

import gregtech.GTInternalTags;

import gregicality.TKCYSAInternalTags;
import gregicality.multiblocks.api.utils.TKCYSALog;
import gregicality.multiblocks.common.CommonProxy;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.metatileentities.TKCYSAMetaTileEntities;

@Mod(modid = TekCaySimpleAddon.MODID,
     name = TekCaySimpleAddon.NAME,
     version = TekCaySimpleAddon.VERSION,
     dependencies = GTInternalTags.DEP_VERSION_STRING)
public class TekCaySimpleAddon {

    public static final String MODID = "tkcysa";
    public static final String NAME = "TeK CaY Simple Addon";
    public static final String VERSION = TKCYSAInternalTags.VERSION;

    @SidedProxy(modId = MODID,
                clientSide = "gregicality.multiblocks.common.ClientProxy",
                serverSide = "gregicality.multiblocks.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void onPreInit(@NotNull FMLPreInitializationEvent event) {
        TKCYSALog.init(event.getModLog());

        GCYMMetaBlocks.init();
        TKCYSAMetaTileEntities.init();

        proxy.preLoad();
    }
}
