package net.kbrz.pokedroid.models.items;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class ItemHolderPokemonVersionDetail extends PokeDroidModel {

    @SerializedName("rarity")
    private String rarity;
    @SerializedName("version")
    private NamedApiResource version;

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public NamedApiResource getVersion() {
        return version;
    }

    public void setVersion(NamedApiResource version) {
        this.version = version;
    }
}
