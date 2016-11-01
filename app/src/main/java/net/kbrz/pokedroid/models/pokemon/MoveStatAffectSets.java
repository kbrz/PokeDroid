package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class MoveStatAffectSets extends PokeDroidModel {

    @SerializedName("increase")
    private List<MoveStatAffect> increase;
    @SerializedName("decrease")
    private List<MoveStatAffect> decrease;

    public List<MoveStatAffect> getIncrease() {
        return increase;
    }

    public void setIncrease(List<MoveStatAffect> increase) {
        this.increase = increase;
    }

    public List<MoveStatAffect> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<MoveStatAffect> decrease) {
        this.decrease = decrease;
    }
}
