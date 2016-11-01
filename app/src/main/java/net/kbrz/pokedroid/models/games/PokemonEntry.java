package net.kbrz.pokedroid.models.games;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokemonEntry extends PokeDroidModel {

    @SerializedName("entry_number")
    private Integer entryNumber;
    @SerializedName("pokemon_species")
    private NamedApiResource pokemonSpecies;

    public Integer getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    public NamedApiResource getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(NamedApiResource pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }
}
