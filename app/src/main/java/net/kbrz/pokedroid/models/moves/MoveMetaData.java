package net.kbrz.pokedroid.models.moves;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class MoveMetaData extends PokeDroidModel {

    @SerializedName("ailment")
    private NamedApiResource ailment;
    @SerializedName("category")
    private NamedApiResource category;
    @SerializedName("min_hits")
    private Integer minHits;
    @SerializedName("max_hits")
    private Integer maxHits;
    @SerializedName("min_turns")
    private Integer minTurns;
    @SerializedName("max_turns")
    private Integer maxTurns;
    @SerializedName("drain")
    private Integer drain;
    @SerializedName("healing")
    private Integer healing;
    @SerializedName("crit_rate")
    private Integer critRate;
    @SerializedName("ailment_chance")
    private Integer ailmentChance;
    @SerializedName("flinch_chance")
    private Integer flinchChance;
    @SerializedName("stat_chance")
    private Integer statChance;

    public NamedApiResource getAilment() {
        return ailment;
    }

    public void setAilment(NamedApiResource ailment) {
        this.ailment = ailment;
    }

    public NamedApiResource getCategory() {
        return category;
    }

    public void setCategory(NamedApiResource category) {
        this.category = category;
    }

    public Integer getMinHits() {
        return minHits;
    }

    public void setMinHits(Integer minHits) {
        this.minHits = minHits;
    }

    public Integer getMaxHits() {
        return maxHits;
    }

    public void setMaxHits(Integer maxHits) {
        this.maxHits = maxHits;
    }

    public Integer getMinTurns() {
        return minTurns;
    }

    public void setMinTurns(Integer minTurns) {
        this.minTurns = minTurns;
    }

    public Integer getMaxTurns() {
        return maxTurns;
    }

    public void setMaxTurns(Integer maxTurns) {
        this.maxTurns = maxTurns;
    }

    public Integer getDrain() {
        return drain;
    }

    public void setDrain(Integer drain) {
        this.drain = drain;
    }

    public Integer getHealing() {
        return healing;
    }

    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    public Integer getCritRate() {
        return critRate;
    }

    public void setCritRate(Integer critRate) {
        this.critRate = critRate;
    }

    public Integer getAilmentChance() {
        return ailmentChance;
    }

    public void setAilmentChance(Integer ailmentChance) {
        this.ailmentChance = ailmentChance;
    }

    public Integer getFlinchChance() {
        return flinchChance;
    }

    public void setFlinchChance(Integer flinchChance) {
        this.flinchChance = flinchChance;
    }

    public Integer getStatChance() {
        return statChance;
    }

    public void setStatChance(Integer statChance) {
        this.statChance = statChance;
    }
}
