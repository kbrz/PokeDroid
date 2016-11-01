package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class MoveBattleStylePreference extends PokeDroidModel {

    @SerializedName("low_hp_preference")
    private Integer lowHpPreference;
    @SerializedName("high_hp_preference")
    private Integer highHpPreference;
    @SerializedName("move_battle_style")
    private NamedApiResource moveBattleStyle;

    public Integer getLowHpPreference() {
        return lowHpPreference;
    }

    public void setLowHpPreference(Integer lowHpPreference) {
        this.lowHpPreference = lowHpPreference;
    }

    public Integer getHighHpPreference() {
        return highHpPreference;
    }

    public void setHighHpPreference(Integer highHpPreference) {
        this.highHpPreference = highHpPreference;
    }

    public NamedApiResource getMoveBattleStyle() {
        return moveBattleStyle;
    }

    public void setMoveBattleStyle(NamedApiResource moveBattleStyle) {
        this.moveBattleStyle = moveBattleStyle;
    }
}
