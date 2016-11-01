package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokemonSpeciesGender extends PokeDroidModel {

    @SerializedName("rate")
    private Integer rate;
    @SerializedName("pokemon_species")
    private NamedApiResource pokemonSpecies;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public NamedApiResource getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(NamedApiResource pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }
}
