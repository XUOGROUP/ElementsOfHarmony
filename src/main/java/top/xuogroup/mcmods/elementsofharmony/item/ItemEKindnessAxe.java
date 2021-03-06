package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEKindness;

public class ItemEKindnessAxe extends AxeItem {
    private static final IItemTier tireEKindness = new TireEKindness();
    public ItemEKindnessAxe(){
        super(tireEKindness, 6.0F, -3.0F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
