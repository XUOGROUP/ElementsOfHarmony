package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;

public class ItemEHonestyIngot extends Item {
    public ItemEHonestyIngot(){
        super(new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
