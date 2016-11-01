package net.kbrz.pokedroid.models.locations;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Name;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class PalParkArea extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("pokemon_encounters")
    private List<PalParkEncounterSpecies> pokemonEncounters;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PalParkEncounterSpecies> getPokemonEncounters() {
        return pokemonEncounters;
    }

    public void setPokemonEncounters(List<PalParkEncounterSpecies> pokemonEncounters) {
        this.pokemonEncounters = pokemonEncounters;
    }
}
