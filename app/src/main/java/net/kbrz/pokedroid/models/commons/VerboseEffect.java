package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

/**
 * @author Konrad Brzykcy.
 */

public class VerboseEffect extends PokeDroidModel {

    @SerializedName("effect")
    private String effect;
    @SerializedName("short_effect")
    private String shortEffect;
    @SerializedName("language")
    private NamedApiResource language;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getShortEffect() {
        return shortEffect;
    }

    public void setShortEffect(String shortEffect) {
        this.shortEffect = shortEffect;
    }

    public NamedApiResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource language) {
        this.language = language;
    }
}
