package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.ApiResource;
import net.kbrz.pokedroid.models.commons.Description;
import net.kbrz.pokedroid.models.commons.FlavorText;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class PokemonSpecies extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("order")
    private Integer order;
    @SerializedName("gender_rate")
    private Integer genderRate;
    @SerializedName("capture_rate")
    private Integer captureRate;
    @SerializedName("base_happiness")
    private Integer baseHappiness;
    @SerializedName("is_baby")
    private Boolean isBaby;
    @SerializedName("hatch_counter")
    private Integer hatchCounter;
    @SerializedName("has_gender_differences")
    private Boolean hasGenderDifferences;
    @SerializedName("forms_switchable")
    private Boolean formsSwitchable;
    @SerializedName("growth_rate")
    private NamedApiResource growthRate;
    @SerializedName("pokedex_numbers")
    private List<PokemonSpeciesDexEntry> pokedexNumbers;
    @SerializedName("egg_groups")
    private List<NamedApiResource> eggGroups;
    @SerializedName("color")
    private NamedApiResource color;
    @SerializedName("shape")
    private NamedApiResource shape;
    @SerializedName("evolves_from_species")
    private NamedApiResource evolvesFromSpecies;
    @SerializedName("evolution_chain")
    private ApiResource evolutionChain;
    @SerializedName("habitat")
    private NamedApiResource habitat;
    @SerializedName("generation")
    private NamedApiResource generation;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("pal_park_encounters")
    private List<PalParkEncounterArea> palParkEncounters;
    @SerializedName("flavor_text_entries")
    private List<FlavorText> flavorTextEntries;
    @SerializedName("form_descriptions")
    private List<Description> formDescriptions;
    @SerializedName("genera")
    private List<Genus> genera;
    @SerializedName("varieties")
    private List<PokemonSpeciesVariety> varieties;

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

    public Integer getGenderRate() {
        return genderRate;
    }

    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }

    public Integer getCaptureRate() {
        return captureRate;
    }

    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    public Boolean getBaby() {
        return isBaby;
    }

    public void setBaby(Boolean baby) {
        isBaby = baby;
    }

    public Integer getHatchCounter() {
        return hatchCounter;
    }

    public void setHatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
    }

    public Boolean getHasGenderDifferences() {
        return hasGenderDifferences;
    }

    public void setHasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    public Boolean getFormsSwitchable() {
        return formsSwitchable;
    }

    public void setFormsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }

    public NamedApiResource getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(NamedApiResource growthRate) {
        this.growthRate = growthRate;
    }

    public List<PokemonSpeciesDexEntry> getPokedexNumbers() {
        return pokedexNumbers;
    }

    public void setPokedexNumbers(List<PokemonSpeciesDexEntry> pokedexNumbers) {
        this.pokedexNumbers = pokedexNumbers;
    }

    public List<NamedApiResource> getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(List<NamedApiResource> eggGroups) {
        this.eggGroups = eggGroups;
    }

    public NamedApiResource getColor() {
        return color;
    }

    public void setColor(NamedApiResource color) {
        this.color = color;
    }

    public NamedApiResource getShape() {
        return shape;
    }

    public void setShape(NamedApiResource shape) {
        this.shape = shape;
    }

    public NamedApiResource getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }

    public void setEvolvesFromSpecies(NamedApiResource evolvesFromSpecies) {
        this.evolvesFromSpecies = evolvesFromSpecies;
    }

    public ApiResource getEvolutionChain() {
        return evolutionChain;
    }

    public void setEvolutionChain(ApiResource evolutionChain) {
        this.evolutionChain = evolutionChain;
    }

    public NamedApiResource getHabitat() {
        return habitat;
    }

    public void setHabitat(NamedApiResource habitat) {
        this.habitat = habitat;
    }

    public NamedApiResource getGeneration() {
        return generation;
    }

    public void setGeneration(NamedApiResource generation) {
        this.generation = generation;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PalParkEncounterArea> getPalParkEncounters() {
        return palParkEncounters;
    }

    public void setPalParkEncounters(List<PalParkEncounterArea> palParkEncounters) {
        this.palParkEncounters = palParkEncounters;
    }

    public List<FlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public List<Description> getFormDescriptions() {
        return formDescriptions;
    }

    public void setFormDescriptions(List<Description> formDescriptions) {
        this.formDescriptions = formDescriptions;
    }

    public List<Genus> getGenera() {
        return genera;
    }

    public void setGenera(List<Genus> genera) {
        this.genera = genera;
    }

    public List<PokemonSpeciesVariety> getVarieties() {
        return varieties;
    }

    public void setVarieties(List<PokemonSpeciesVariety> varieties) {
        this.varieties = varieties;
    }
}
