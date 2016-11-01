package net.kbrz.pokedroid.models.games;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Description;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class Pokedex extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("is_main_series")
    private Boolean isMainSeries;
    @SerializedName("descriptions")
    private List<Description> descriptions;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("pokemon_entries")
    private List<PokemonEntry> pokemonEntries;
    @SerializedName("region")
    private NamedApiResource region;
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

    public Boolean getMainSeries() {
        return isMainSeries;
    }

    public void setMainSeries(Boolean mainSeries) {
        isMainSeries = mainSeries;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PokemonEntry> getPokemonEntries() {
        return pokemonEntries;
    }

    public void setPokemonEntries(List<PokemonEntry> pokemonEntries) {
        this.pokemonEntries = pokemonEntries;
    }

    public NamedApiResource getRegion() {
        return region;
    }

    public void setRegion(NamedApiResource region) {
        this.region = region;
    }

    public List<NamedApiResource> getVersionGroups() {
        return versionGroups;
    }

    public void setVersionGroups(List<NamedApiResource> versionGroups) {
        this.versionGroups = versionGroups;
    }
}
