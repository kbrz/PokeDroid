package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

/**
 * @author Konrad Brzykcy.
 */

public class VersionGroupFlavorText extends PokeDroidModel {

    @SerializedName("text")
    private String text;
    @SerializedName("language")
    private NamedApiResource language;
    @SerializedName("version_group")
    private NamedApiResource versionGroup;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
