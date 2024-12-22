package net.slendymctendies.scapecraft.attribute;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slendymctendies.scapecraft.ScapeCraft;

public class ModAttributes extends Attributes {
    public static final DeferredRegister<Attribute> MOD_ATTRIBUTE = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, ScapeCraft.MOD_ID);

    //public static final Holder<Attribute> ARMOR = MOD_ATTRIBUTE.register("generic.armor", () -> new RangedAttribute("attribute.name.generic.armor", 0.0f, 0.0f, 40.0f).setSyncable(true));

    //"generic.armor", (new RangedAttribute("attribute.name.generic.armor", 0.0, 0.0, 30.0)).setSyncable(true)

    public static final Holder<Attribute> ATTACK_SKILL = MOD_ATTRIBUTE.register("scapecraft.attack_skill", () -> new RangedAttribute("attribute.name.attack.skill", 1, 1, 99).setSyncable(true));
    public static final Holder<Attribute> ATTACK_XP = MOD_ATTRIBUTE.register("scapecraft.attack_xp", () -> new RangedAttribute("attribute.name.attack.xp", 0, 0, 50000000).setSyncable(true));

    public static final Holder<Attribute> MINING_SKILL = MOD_ATTRIBUTE.register("scapecraft.mining_skill", () -> new RangedAttribute("attribute.name.mining.skill", 1, 1, 99).setSyncable(true));
    public static final Holder<Attribute> MINING_XP = MOD_ATTRIBUTE.register("scapecraft.mining_xp", () -> new RangedAttribute("attribute.name.mining.xp", 0, 0, 50000000).setSyncable(true));

    public static final Holder<Attribute> SMITHING_SKILL = MOD_ATTRIBUTE.register("scapecraft.smithing_skill", () -> new RangedAttribute("attribute.name.mining.skill", 1, 1, 99).setSyncable(true));
    public static Holder<Attribute> SMITHING_XP = MOD_ATTRIBUTE.register("scapecraft.smithing_xp", () -> new RangedAttribute("attribute.name.mining.xp", 0, 0, 50000000).setSyncable(true));

    public static void register(IEventBus eventBus) {
        MOD_ATTRIBUTE.register(eventBus);
    }
}
