package net.kbrz.pokedroid.models.berries;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class FlavorBerryMap extends PokeDroidModel {

    @SerializedName("potency")
    private Integer potency;
    @SerializedName("berry")
    private NamedApiResource berry;

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public NamedApiResource getBerry() {
        return berry;
    }

    public void setBerry(NamedApiResource berry) {
        this.berry = berry;
    }
}
