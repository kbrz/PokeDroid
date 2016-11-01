package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokemonSpeciesVariety extends PokeDroidModel {

    @SerializedName("is_default")
    private Boolean isDefault;
    @SerializedName("pokemon")
    private NamedApiResource pokemon;

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public NamedApiResource getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedApiResource pokemon) {
        this.pokemon = pokemon;
    }
}
