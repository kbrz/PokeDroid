package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class PokemonShape extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("awesome_names")
    private List<AwesomeName> awesomeNames;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("pokemon_species")
    private List<NamedApiResource> pokemonSpecies;

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

    public List<AwesomeName> getAwesomeNames() {
        return awesomeNames;
    }

    public void setAwesomeNames(List<AwesomeName> awesomeNames) {
        this.awesomeNames = awesomeNames;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(List<NamedApiResource> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }
}
