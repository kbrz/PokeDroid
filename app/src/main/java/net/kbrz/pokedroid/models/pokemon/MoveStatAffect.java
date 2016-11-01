package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class MoveStatAffect extends PokeDroidModel {

    @SerializedName("change")
    private Integer change;
    @SerializedName("move")
    private NamedApiResource move;

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public NamedApiResource getMove() {
        return move;
    }

    public void setMove(NamedApiResource move) {
        this.move = move;
    }
}
