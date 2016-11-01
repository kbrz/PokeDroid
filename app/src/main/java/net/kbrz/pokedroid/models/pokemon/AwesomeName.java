package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class AwesomeName extends PokeDroidModel {

    @SerializedName("awesome_name")
    private String awesomeName;
    @SerializedName("language")
    private NamedApiResource language;

    public String getAwesomeName() {
        return awesomeName;
    }

    public void setAwesomeName(String awesomeName) {
        this.awesomeName = awesomeName;
    }

    public NamedApiResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource language) {
        this.language = language;
    }
}
