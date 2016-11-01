package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class NatureStatAffectSets extends PokeDroidModel {

    @SerializedName("increase")
    private List<NamedApiResource> increase;
    @SerializedName("decrease")
    private List<NamedApiResource> decrease;

    public List<NamedApiResource> getIncrease() {
        return increase;
    }

    public void setIncrease(List<NamedApiResource> increase) {
        this.increase = increase;
    }

    public List<NamedApiResource> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<NamedApiResource> decrease) {
        this.decrease = decrease;
    }
}
