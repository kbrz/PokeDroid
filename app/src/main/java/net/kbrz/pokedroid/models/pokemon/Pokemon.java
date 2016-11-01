package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;
import net.kbrz.pokedroid.models.commons.VersionGameIndex;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class Pokemon extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("base_experience")
    private Integer baseExperience;
    @SerializedName("height")
    private Integer height;
    @SerializedName("is_default")
    private Boolean isDefault;
    @SerializedName("order")
    private Integer order;
    @SerializedName("weight")
    private Integer weight;
    @SerializedName("abilities")
    private List<PokemonAbility> abilities;
    @SerializedName("forms")
    private List<NamedApiResource> forms;
    @SerializedName("game_indices")
    private List<VersionGameIndex> gameIndices;
    @SerializedName("held_items")
    private List<PokemonHeldItem> heldItems;
    @SerializedName("location_area_encounters")
    private String locationAreaEncounters;
    @SerializedName("moves")
    private List<PokemonMove> moves;
    @SerializedName("sprites")
    private PokemonSprites sprites;
    @SerializedName("species")
    private NamedApiResource species;
    @SerializedName("stats")
    private List<PokemonStat> stats;
    @SerializedName("types")
    private List<PokemonType> types;

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

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public List<NamedApiResource> getForms() {
        return forms;
    }

    public void setForms(List<NamedApiResource> forms) {
        this.forms = forms;
    }

    public List<VersionGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<VersionGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public List<PokemonHeldItem> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(List<PokemonHeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public List<PokemonMove> getMoves() {
        return moves;
    }

    public void setMoves(List<PokemonMove> moves) {
        this.moves = moves;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    public NamedApiResource getSpecies() {
        return species;
    }

    public void setSpecies(NamedApiResource species) {
        this.species = species;
    }

    public List<PokemonStat> getStats() {
        return stats;
    }

    public void setStats(List<PokemonStat> stats) {
        this.stats = stats;
    }

    public List<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }
}
