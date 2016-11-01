package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class Gender extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("pokemon_species_details")
    private List<PokemonSpeciesGender> pokemonSpeciesDetails;
    @SerializedName("required_for_evolution")
    private List<NamedApiResource> requiredForEvolution;

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

    public List<PokemonSpeciesGender> getPokemonSpeciesDetails() {
        return pokemonSpeciesDetails;
    }

    public void setPokemonSpeciesDetails(List<PokemonSpeciesGender> pokemonSpeciesDetails) {
        this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    }

    public List<NamedApiResource> getRequiredForEvolution() {
        return requiredForEvolution;
    }

    public void setRequiredForEvolution(List<NamedApiResource> requiredForEvolution) {
        this.requiredForEvolution = requiredForEvolution;
    }
}
