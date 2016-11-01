package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

/**
 * @author Konrad Brzykcy.
 */

public class VersionGameIndex extends PokeDroidModel {

    @SerializedName("game_index")
    private Integer gameIndex;
    @SerializedName("version")
    private NamedApiResource version;

}
