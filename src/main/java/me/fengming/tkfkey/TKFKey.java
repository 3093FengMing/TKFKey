package me.fengming.tkfkey;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = TKFKey.MODID)
@Mod(modid = TKFKey.MODID, name = TKFKey.NAME, version = TKFKey.VERSION)
public class TKFKey
{
    public static final String MODID = "tkfkey";
    public static final String NAME = "TKF Key";
    public static final String VERSION = "1.0";
    private static Logger logger;

    public static Item KEY_ITEM;
    public static final CreativeTabs TKF_KEY_TAB = new CreativeTabs("tkf_key_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(KEY_ITEM);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                KEY_ITEM = new KeyItem().setRegistryName("tkfkey:key").setUnlocalizedName("tkfkey").setCreativeTab(TKF_KEY_TAB)
        );
        logger.info(KEY_ITEM.getRegistryName());
    }
}
