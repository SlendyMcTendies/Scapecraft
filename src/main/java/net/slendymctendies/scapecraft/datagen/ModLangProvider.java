package net.slendymctendies.scapecraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.slendymctendies.scapecraft.ScapeCraft;

import java.util.HashMap;
import java.util.Map;

public class ModLangProvider extends LanguageProvider {
    private String localization;

    public static enum Locale {
        EN_US("en_us");

        public String localeString;
        Locale(String localization) {localeString = localization;}
    }

    public ModLangProvider(PackOutput outputLocalization, String locale) {
        super(outputLocalization, ScapeCraft.MOD_ID, locale);
    }

    public static final Translation KEYBIND_CATEGORY = Translation.Builder.start("category.scapecraft")
            .addLocale(Locale.EN_US, "ScapeCraft").build();

    public static final Translation OPEN_SKILL_OVERVIEW = Translation.Builder.start("key.scapecraft.skilloverview")
            .addLocale(Locale.EN_US, "Open Skill Menu").build();

    @Override
    protected void addTranslations() {

    }

    public static record Translation(String key, Map<String, String> localeMap) {
        public MutableComponent asComponent() {
            return Component.translatable(key());
        }
        public MutableComponent asComponent(Object...obj) {
            return Component.translatable(key(), obj);
        }
        public static class Builder {
            private final String key;
            private Map<String, String> localeMap;
            private Builder(String key) {this.key = key; localeMap = new HashMap<>();}

            public static Builder start(String key) {
                return new Builder(key);
            }

            public Builder addLocale(Locale locale, String translation) {
                this.localeMap.put(locale.localeString, translation);
                return this;
            }

            public Translation build() {
                return new Translation(key, localeMap);
            }
        }
    }
}

