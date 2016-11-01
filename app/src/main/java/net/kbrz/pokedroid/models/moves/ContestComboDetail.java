package net.kbrz.pokedroid.models.moves;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class ContestComboDetail extends PokeDroidModel {

    @SerializedName("use_before")
    private List<NamedApiResource> useBefore;
    @SerializedName("use_after")
    private List<NamedApiResource> useAfter;

    public List<NamedApiResource> getUseBefore() {
        return useBefore;
    }

    public void setUseBefore(List<NamedApiResource> useBefore) {
        this.useBefore = useBefore;
    }

    public List<NamedApiResource> getUseAfter() {
        return useAfter;
    }

    public void setUseAfter(List<NamedApiResource> useAfter) {
        this.useAfter = useAfter;
    }
}
