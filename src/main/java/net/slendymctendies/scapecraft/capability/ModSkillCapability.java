package net.slendymctendies.scapecraft.capability;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.capabilities.EntityCapability;
import net.neoforged.neoforge.items.IItemHandler;
import net.slendymctendies.scapecraft.ScapeCraft;

public class ModSkillCapability {
    public static final EntityCapability<IItemHandler, Void> SKILL_CAPABILITY =
            EntityCapability.createVoid(ResourceLocation.fromNamespaceAndPath(ScapeCraft.MOD_ID, "entity_skill_handler"),
                    IItemHandler.class);
}
