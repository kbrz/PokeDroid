package net.kbrz.pokedroid.models.locations;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class LocationArea extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("game_index")
    private Integer gameIndex;
    @SerializedName("encounter_method_rates")
    private List<EncounterMethodRate> encounterMethodRates;
    @SerializedName("location")
    private NamedApiResource location;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("pokemon_encounters")
    private List<PokemonEncounter> pokemonEncounters;

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

    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    public List<EncounterMethodRate> getEncounterMethodRates() {
        return encounterMethodRates;
    }

    public void setEncounterMethodRates(List<EncounterMethodRate> encounterMethodRates) {
        this.encounterMethodRates = encounterMethodRates;
    }

    public NamedApiResource getLocation() {
        return location;
    }

    public void setLocation(NamedApiResource location) {
        this.location = location;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PokemonEncounter> getPokemonEncounters() {
        return pokemonEncounters;
    }

    public void setPokemonEncounters(List<PokemonEncounter> pokemonEncounters) {
        this.pokemonEncounters = pokemonEncounters;
    }
}
