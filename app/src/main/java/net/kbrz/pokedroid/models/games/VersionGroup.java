package net.kbrz.pokedroid.models.games;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class VersionGroup extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("order")
    private Integer order;
    @SerializedName("generation")
    private NamedApiResource generation;
    @SerializedName("move_learn_methods")
    private List<NamedApiResource> moveLearnMethods;
    @SerializedName("pokedexes")
    private List<NamedApiResource> pokedexes;
    @SerializedName("regions")
    private List<NamedApiResource> regions;
    @SerializedName("versions")
    private List<NamedApiResource> versions;

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public NamedApiResource getGeneration() {
        return generation;
    }

    public void setGeneration(NamedApiResource generation) {
        this.generation = generation;
    }

    public List<NamedApiResource> getMoveLearnMethods() {
        return moveLearnMethods;
    }

    public void setMoveLearnMethods(List<NamedApiResource> moveLearnMethods) {
        this.moveLearnMethods = moveLearnMethods;
    }

    public List<NamedApiResource> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<NamedApiResource> pokedexes) {
        this.pokedexes = pokedexes;
    }

    public List<NamedApiResource> getRegions() {
        return regions;
    }

    public void setRegions(List<NamedApiResource> regions) {
        this.regions = regions;
    }

    public List<NamedApiResource> getVersions() {
        return versions;
    }

    public void setVersions(List<NamedApiResource> versions) {
        this.versions = versions;
    }
}
