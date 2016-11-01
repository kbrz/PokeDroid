package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class NatureStatChange extends PokeDroidModel {

    @SerializedName("max_change")
    private Integer maxChange;
    @SerializedName("pokeathlon_stat")
    private NamedApiResource pokeathlonStat;

    public Integer getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    public NamedApiResource getPokeathlonStat() {
        return pokeathlonStat;
    }

    public void setPokeathlonStat(NamedApiResource pokeathlonStat) {
        this.pokeathlonStat = pokeathlonStat;
    }
}
