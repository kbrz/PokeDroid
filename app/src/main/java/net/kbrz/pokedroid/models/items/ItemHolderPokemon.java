package net.kbrz.pokedroid.models.items;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class ItemHolderPokemon extends PokeDroidModel {

    @SerializedName("pokemon")
    private String pokemon;
    @SerializedName("version_details")
    private List<ItemHolderPokemonVersionDetail> versionDetails;

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public List<ItemHolderPokemonVersionDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<ItemHolderPokemonVersionDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }
}
