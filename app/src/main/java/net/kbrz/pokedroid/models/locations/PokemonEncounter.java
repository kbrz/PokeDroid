package net.kbrz.pokedroid.models.locations;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;
import net.kbrz.pokedroid.models.commons.VersionEncounterDetail;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class PokemonEncounter extends PokeDroidModel {

    @SerializedName("pokemon")
    private NamedApiResource pokemon;
    @SerializedName("version_details")
    private List<VersionEncounterDetail> versionDetails;

    public NamedApiResource getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedApiResource pokemon) {
        this.pokemon = pokemon;
    }

    public List<VersionEncounterDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }
}
