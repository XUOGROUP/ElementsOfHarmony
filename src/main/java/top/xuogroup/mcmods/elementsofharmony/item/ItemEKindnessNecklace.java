package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.material.MaterialEKindness;

public class ItemEKindnessNecklace extends ArmorItem {
    private static final IArmorMaterial materialEKindness = new MaterialEKindness();
    public ItemEKindnessNecklace(){
        super(materialEKindness, EquipmentSlotType.CHEST, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
