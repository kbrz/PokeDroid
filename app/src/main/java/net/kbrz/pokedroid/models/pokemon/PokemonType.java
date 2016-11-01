package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokemonType extends PokeDroidModel {

    @SerializedName("slot")
    private Integer slot;
    @SerializedName("type")
    private NamedApiResource type;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public NamedApiResource getType() {
        return type;
    }

    public void setType(NamedApiResource type) {
        this.type = type;
    }
}
