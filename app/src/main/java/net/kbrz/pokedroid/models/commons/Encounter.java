package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class Encounter extends PokeDroidModel {

    @SerializedName("min_level")
    private Integer minLevel;
    @SerializedName("max_level")
    private Integer maxLevel;
    @SerializedName("condition_values")
    private List<NamedApiResource> conditionValues;
    @SerializedName("chance")
    private Integer chance;
    @SerializedName("method")
    private NamedApiResource method;

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public List<NamedApiResource> getConditionValues() {
        return conditionValues;
    }

    public void setConditionValues(List<NamedApiResource> conditionValues) {
        this.conditionValues = conditionValues;
    }

    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    public NamedApiResource getMethod() {
        return method;
    }

    public void setMethod(NamedApiResource method) {
        this.method = method;
    }
}
