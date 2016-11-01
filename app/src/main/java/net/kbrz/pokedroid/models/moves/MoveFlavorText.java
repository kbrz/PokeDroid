package net.kbrz.pokedroid.models.moves;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class MoveFlavorText extends PokeDroidModel {

    @SerializedName("flavor_text")
    private String flavorText;
    @SerializedName("language")
    private NamedApiResource language;
    @SerializedName("version_group")
    private NamedApiResource versionGroup;

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public NamedApiResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource language) {
        this.language = language;
    }

    public NamedApiResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        this.versionGroup = versionGroup;
    }
}
