package net.kbrz.pokedroid.models.berries;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class BerryFlavorMap extends PokeDroidModel {

    @SerializedName("potency")
    private Integer potency;
    @SerializedName("flavor")
    private NamedApiResource flavor;

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public NamedApiResource getFlavor() {
        return flavor;
    }

    public void setFlavor(NamedApiResource flavor) {
        this.flavor = flavor;
    }
}
