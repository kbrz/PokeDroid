package net.kbrz.pokedroid.models.items;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.ApiResource;
import net.kbrz.pokedroid.models.commons.GenerationGameIndex;
import net.kbrz.pokedroid.models.commons.MachineVersionDetail;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;
import net.kbrz.pokedroid.models.commons.VerboseEffect;
import net.kbrz.pokedroid.models.commons.VersionGroupFlavorText;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class Item extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("cost")
    private Integer cost;
    @SerializedName("fling_power")
    private Integer flingPower;
    @SerializedName("fling_effect")
    private NamedApiResource flingEffect;
    @SerializedName("attributes")
    private List<NamedApiResource> attributes;
    @SerializedName("category")
    private ItemCategory category;
    @SerializedName("effect_entries")
    private VerboseEffect effectEntries;
    @SerializedName("flavor_text_entries")
    private List<VersionGroupFlavorText> flavorTextEntries;
    @SerializedName("game_indices")
    private List<GenerationGameIndex> gameIndices;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("sprites")
    private ItemSprites sprites;
    @SerializedName("held_by_pokemon")
    private List<ItemHolderPokemon> heldByPokemon;
    @SerializedName("baby_trigger_for")
    private ApiResource babyTriggerFor;
    @SerializedName("machines")
    private List<MachineVersionDetail> machines;

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

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getFlingPower() {
        return flingPower;
    }

    public void setFlingPower(Integer flingPower) {
        this.flingPower = flingPower;
    }

    public NamedApiResource getFlingEffect() {
        return flingEffect;
    }

    public void setFlingEffect(NamedApiResource flingEffect) {
        this.flingEffect = flingEffect;
    }

    public List<NamedApiResource> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<NamedApiResource> attributes) {
        this.attributes = attributes;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public void setCategory(ItemCategory category) {
        this.category = category;
    }

    public VerboseEffect getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(VerboseEffect effectEntries) {
        this.effectEntries = effectEntries;
    }

    public List<VersionGroupFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<VersionGroupFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public ItemSprites getSprites() {
        return sprites;
    }

    public void setSprites(ItemSprites sprites) {
        this.sprites = sprites;
    }

    public List<ItemHolderPokemon> getHeldByPokemon() {
        return heldByPokemon;
    }

    public void setHeldByPokemon(List<ItemHolderPokemon> heldByPokemon) {
        this.heldByPokemon = heldByPokemon;
    }

    public ApiResource getBabyTriggerFor() {
        return babyTriggerFor;
    }

    public void setBabyTriggerFor(ApiResource babyTriggerFor) {
        this.babyTriggerFor = babyTriggerFor;
    }

    public List<MachineVersionDetail> getMachines() {
        return machines;
    }

    public void setMachines(List<MachineVersionDetail> machines) {
        this.machines = machines;
    }
}
