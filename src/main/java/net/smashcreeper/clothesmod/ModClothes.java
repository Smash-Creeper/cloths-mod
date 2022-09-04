package net.smashcreeper.clothesmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smashcreeper.clothesmod.items.ModArmorMaterials;


public class ModClothes {

    public static final Item Test_Hat = registerItem("test_hat",
        new ArmorItem(ModArmorMaterials.CLOTHES, EquipmentSlot.HEAD,
                new FabricItemSettings().group(ModInit.CLOTHES)));
    public static final Item Test_Shirt = registerItem("test_shirt",
        new ArmorItem(ModArmorMaterials.CLOTHES, EquipmentSlot.CHEST,
                new FabricItemSettings().group(ModInit.CLOTHES)));
    public static final Item Test_Pants = registerItem("test_pants",
        new ArmorItem(ModArmorMaterials.CLOTHES, EquipmentSlot.LEGS,
                new FabricItemSettings().group(ModInit.CLOTHES)));
    public static final Item Test_Shoes = registerItem("test_shoes",
        new ArmorItem(ModArmorMaterials.CLOTHES, EquipmentSlot.FEET,
                new FabricItemSettings().group(ModInit.CLOTHES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ModInit.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ModInit.LOGGER.info("Registering Mod Items for " + ModInit.MOD_ID);
    }
}
