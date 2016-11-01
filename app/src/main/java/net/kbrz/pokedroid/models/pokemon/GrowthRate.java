package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Description;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class GrowthRate extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("formula")
    private String formula;
    @SerializedName("descriptions")
    private List<Description> descriptions;
    @SerializedName("levels")
    private List<GrowthRateExperienceLevel> levels;
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

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<GrowthRateExperienceLevel> getLevels() {
        return levels;
    }

    public void setLevels(List<GrowthRateExperienceLevel> levels) {
        this.levels = levels;
    }

    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(List<NamedApiResource> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }
}
