package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class NaturePokeathlonStatAffect extends PokeDroidModel {

    @SerializedName("max_change")
    private Integer maxChange;
    @SerializedName("nature")
    private NamedApiResource nature;

    public Integer getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    public NamedApiResource getNature() {
        return nature;
    }

    public void setNature(NamedApiResource nature) {
        this.nature = nature;
    }
}
