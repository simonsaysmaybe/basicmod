package com.matheus.mccourse.item;

import com.matheus.mccourse.McCourseMod;
import com.matheus.mccourse.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot",
                    () -> new Item(new Item.Properties().group(McCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_WIRE =
            Registration.ITEMS.register("copper_wire",
                    () -> new Item(new Item.Properties().group(McCourseMod.COURSE_TAB)));

    public static void register(){ }

}
