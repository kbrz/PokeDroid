package net.kbrz.pokedroid.models.locations;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class PalParkEncounterSpecies extends PokemonEncounter {

    @SerializedName("base_score")
    private Integer baseScore;
    @SerializedName("rate")
    private Integer rate;
    @SerializedName("pokemon_species")
    private NamedApiResource pokemonSpecies;

    public Integer getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
    }

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
