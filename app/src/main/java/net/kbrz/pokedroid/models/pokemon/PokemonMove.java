package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokemonMove extends PokeDroidModel {

    @SerializedName("move")
    private NamedApiResource move;
    @SerializedName("version_group_details")
    private List<PokemonMoveVersion> versionGroupDetails;

    public NamedApiResource getMove() {
        return move;
    }

    public void setMove(NamedApiResource move) {
        this.move = move;
    }

    public List<PokemonMoveVersion> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(List<PokemonMoveVersion> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }
}
