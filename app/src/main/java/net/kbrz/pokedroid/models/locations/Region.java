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
public class Region extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("locations")
    private List<NamedApiResource> locations;
    @SerializedName("main_generation")
    private NamedApiResource mainGeneration;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("pokedexes")
    private List<NamedApiResource> pokedexes;
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

    public List<NamedApiResource> getLocations() {
        return locations;
    }

    public void setLocations(List<NamedApiResource> locations) {
        this.locations = locations;
    }

    public NamedApiResource getMainGeneration() {
        return mainGeneration;
    }

    public void setMainGeneration(NamedApiResource mainGeneration) {
        this.mainGeneration = mainGeneration;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<NamedApiResource> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<NamedApiResource> pokedexes) {
        this.pokedexes = pokedexes;
    }

    public List<NamedApiResource> getVersionGroups() {
        return versionGroups;
    }

    public void setVersionGroups(List<NamedApiResource> versionGroups) {
        this.versionGroups = versionGroups;
    }
}
