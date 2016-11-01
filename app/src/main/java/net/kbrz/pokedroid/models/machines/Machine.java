package net.kbrz.pokedroid.models.machines;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class Machine extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("item")
    private NamedApiResource item;
    @SerializedName("move")
    private NamedApiResource move;
    @SerializedName("version_group")
    private NamedApiResource versionGroup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NamedApiResource getItem() {
        return item;
    }

    public void setItem(NamedApiResource item) {
        this.item = item;
    }

    public NamedApiResource getMove() {
        return move;
    }

    public void setMove(NamedApiResource move) {
        this.move = move;
    }

    public NamedApiResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        this.versionGroup = versionGroup;
    }
}
