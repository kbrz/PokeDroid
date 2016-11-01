package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokemonStat extends PokeDroidModel {

    @SerializedName("stat")
    private NamedApiResource stat;
    @SerializedName("effort")
    private Integer effort;
    @SerializedName("base_stat")
    private Integer baseStat;

    public NamedApiResource getStat() {
        return stat;
    }

    public void setStat(NamedApiResource stat) {
        this.stat = stat;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public Integer getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }
}
