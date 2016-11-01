package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PalParkEncounterArea extends PokeDroidModel {

    @SerializedName("base_score")
    private Integer baseScore;
    @SerializedName("rate")
    private Integer rate;
    @SerializedName("area")
    private NamedApiResource area;

    public Integer getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public NamedApiResource getArea() {
        return area;
    }

    public void setArea(NamedApiResource area) {
        this.area = area;
    }
}
