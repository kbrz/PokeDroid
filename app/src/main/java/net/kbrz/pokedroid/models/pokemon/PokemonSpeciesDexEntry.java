package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokemonSpeciesDexEntry extends PokeDroidModel {

    @SerializedName("entry_number")
    private Integer entryNumber;
    @SerializedName("pokedex")
    private NamedApiResource pokedex;

    public Integer getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    public NamedApiResource getPokedex() {
        return pokedex;
    }

    public void setPokedex(NamedApiResource pokedex) {
        this.pokedex = pokedex;
    }
}
