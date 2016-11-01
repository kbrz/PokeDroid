package net.kbrz.pokedroid.models.moves;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class MoveStatChange extends PokeDroidModel {

    @SerializedName("change")
    private Integer change;
    @SerializedName("stat")
    private NamedApiResource stat;

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public NamedApiResource getStat() {
        return stat;
    }

    public void setStat(NamedApiResource stat) {
        this.stat = stat;
    }
}
