package net.kbrz.pokedroid.models.games;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class Generation extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("abilities")
    private List<NamedApiResource> abilities;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("main_region")
    private NamedApiResource mainRegion;
    @SerializedName("moves")
    private List<NamedApiResource> moves;
    @SerializedName("pokemon_species")
    private List<NamedApiResource> pokemonSpecies;
    @SerializedName("types")
    private List<NamedApiResource> types;
    @SerializedName("version_groups")
    private List<NamedApiResource> versionGroups;

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

    public List<NamedApiResource> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<NamedApiResource> abilities) {
        this.abilities = abilities;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public NamedApiResource getMainRegion() {
        return mainRegion;
    }

    public void setMainRegion(NamedApiResource mainRegion) {
        this.mainRegion = mainRegion;
    }

    public List<NamedApiResource> getMoves() {
        return moves;
    }

    public void setMoves(List<NamedApiResource> moves) {
        this.moves = moves;
    }

    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(List<NamedApiResource> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    public List<NamedApiResource> getTypes() {
        return types;
    }

    public void setTypes(List<NamedApiResource> types) {
        this.types = types;
    }

    public List<NamedApiResource> getVersionGroups() {
        return versionGroups;
    }

    public void setVersionGroups(List<NamedApiResource> versionGroups) {
        this.versionGroups = versionGroups;
    }
}
