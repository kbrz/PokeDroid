package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class PokemonHeldItem extends PokeDroidModel {

    @SerializedName("item")
    private NamedApiResource item;
    @SerializedName("version_details")
    private List<PokemonHeldItemVersion> versionDetails;

    public NamedApiResource getItem() {
        return item;
    }

    public void setItem(NamedApiResource item) {
        this.item = item;
    }

    public List<PokemonHeldItemVersion> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
        this.versionDetails = versionDetails;
    }
}
