package net.kbrz.pokedroid.models.moves;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

/**
 * @author Konrad Brzykcy.
 */

public class ContestComboSets extends PokeDroidModel {

    @SerializedName("normal")
    private ContestComboDetail normal;
    @SerializedName("super")
    private ContestComboDetail superCcd;

    public ContestComboDetail getNormal() {
        return normal;
    }

    public void setNormal(ContestComboDetail normal) {
        this.normal = normal;
    }

    public ContestComboDetail getSuperCcd() {
        return superCcd;
    }

    public void setSuperCcd(ContestComboDetail superCcd) {
        this.superCcd = superCcd;
    }
}
