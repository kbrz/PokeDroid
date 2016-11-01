package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class Description extends PokeDroidModel {

    @SerializedName("description")
    private String description;
    @SerializedName("language")
    private NamedApiResource language;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NamedApiResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource language) {
        this.language = language;
    }
}
