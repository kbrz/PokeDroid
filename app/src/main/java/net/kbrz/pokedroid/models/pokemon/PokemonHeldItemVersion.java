package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokemonHeldItemVersion extends PokeDroidModel {

    @SerializedName("version")
    private NamedApiResource version;
    @SerializedName("rarity")
    private Integer rarity;

    public NamedApiResource getVersion() {
        return version;
    }

    public void setVersion(NamedApiResource version) {
        this.version = version;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }
}
