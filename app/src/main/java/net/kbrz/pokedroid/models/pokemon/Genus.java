package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class Genus extends PokeDroidModel {

    @SerializedName("genus")
    private String genus;
    @SerializedName("language")
    private NamedApiResource language;

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public NamedApiResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource language) {
        this.language = language;
    }
}
