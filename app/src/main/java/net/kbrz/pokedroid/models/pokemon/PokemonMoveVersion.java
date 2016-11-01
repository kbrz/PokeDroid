package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class PokemonMoveVersion extends PokeDroidModel {

    @SerializedName("move_learn_method")
    private NamedApiResource moveLearnMethod;
    @SerializedName("version_group")
    private NamedApiResource versionGroup;
    @SerializedName("level_learned_at")
    private Integer levelLearnedAt;

    public NamedApiResource getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(NamedApiResource moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public NamedApiResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        this.versionGroup = versionGroup;
    }

    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }
}
