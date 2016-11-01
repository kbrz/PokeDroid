package net.kbrz.pokedroid.models.items;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

/**
 * @author Konrad Brzykcy.
 */

public class ItemSprites extends PokeDroidModel {

    @SerializedName("default")
    private String defaultDesc;

    public String getDefaultDesc() {
        return defaultDesc;
    }

    public void setDefaultDesc(String defaultDesc) {
        this.defaultDesc = defaultDesc;
    }
}
