package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class NaturePokeathlonStatAffectSets extends PokeDroidModel {

    @SerializedName("increase")
    private List<NaturePokeathlonStatAffect> increase;
    @SerializedName("decrease")
    private List<NaturePokeathlonStatAffect> decrease;

    public List<NaturePokeathlonStatAffect> getIncrease() {
        return increase;
    }

    public void setIncrease(List<NaturePokeathlonStatAffect> increase) {
        this.increase = increase;
    }

    public List<NaturePokeathlonStatAffect> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<NaturePokeathlonStatAffect> decrease) {
        this.decrease = decrease;
    }
}
