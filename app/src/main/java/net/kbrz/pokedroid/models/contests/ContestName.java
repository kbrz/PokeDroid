package net.kbrz.pokedroid.models.contests;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class ContestName extends PokeDroidModel {

    @SerializedName("name")
    private String name;
    @SerializedName("color")
    private String color;
    @SerializedName("language")
    private NamedApiResource language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public NamedApiResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource language) {
        this.language = language;
    }
}
