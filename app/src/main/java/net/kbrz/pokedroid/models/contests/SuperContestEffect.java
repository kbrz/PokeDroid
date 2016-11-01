package net.kbrz.pokedroid.models.contests;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.FlavorText;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class SuperContestEffect extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("appeal")
    private Integer appeal;
    @SerializedName("flavor_text_entries")
    private List<FlavorText> flavorTextEntries;
    @SerializedName("moves")
    private List<NamedApiResource> moves;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppeal() {
        return appeal;
    }

    public void setAppeal(Integer appeal) {
        this.appeal = appeal;
    }

    public List<FlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public List<NamedApiResource> getMoves() {
        return moves;
    }

    public void setMoves(List<NamedApiResource> moves) {
        this.moves = moves;
    }
}
