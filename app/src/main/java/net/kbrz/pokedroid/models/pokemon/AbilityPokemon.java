package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class AbilityPokemon extends PokeDroidModel {

    @SerializedName("is_hidden")
    private Boolean isHidden;
    @SerializedName("slot")
    private Integer slot;
    @SerializedName("pokemon")
    private NamedApiResource pokemon;

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public NamedApiResource getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedApiResource pokemon) {
        this.pokemon = pokemon;
    }
}
