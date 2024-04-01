package me.fengming.tkfkey;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class KeyItem extends Item {
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (stack.getTagCompound() == null) return;
        int id = stack.getTagCompound().getInteger("id");
        if (id == 0) return;
        tooltip.add("钥匙ID：" + id);
    }
}
