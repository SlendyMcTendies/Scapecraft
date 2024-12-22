package net.slendymctendies.scapecraft.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.entity.Entity;

public record ModPlayerMiningSkill(Entity playerEntity, int MiningLevel, int MiningExperience) {
    //public final Codec<ModPlayerMiningSkill> MOD_PLAYER_MINING_SKILL_CODEC =
    /*
    public final Codec<ModPlayerMiningSkill> MOD_PLAYER_MINING_LEVEL = RecordCodecBuilder.create(modPlayerMiningSkillInstance ->
            modPlayerMiningSkillInstance.group(Entity.), )

     */
}
