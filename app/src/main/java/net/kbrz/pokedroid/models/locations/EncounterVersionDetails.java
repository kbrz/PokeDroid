package net.kbrz.pokedroid.models.locations;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class EncounterVersionDetails extends PokeDroidModel {

    @SerializedName("rate")
    private Integer rate;
    @SerializedName("version")
    private NamedApiResource version;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public NamedApiResource getVersion() {
        return version;
    }

    public void setVersion(NamedApiResource version) {
        this.version = version;
    }
}
