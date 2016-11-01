package net.kbrz.pokedroid.models.moves;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;
import net.kbrz.pokedroid.models.commons.VerboseEffect;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PastMoveStatValues extends PokeDroidModel {

    @SerializedName("accuracy")
    private Integer accuracy;
    @SerializedName("effect_chance")
    private Integer effectChance;
    @SerializedName("power")
    private Integer power;
    @SerializedName("pp")
    private Integer pp;
    @SerializedName("effect_entries")
    private List<VerboseEffect> effectEntries;
    @SerializedName("type")
    private NamedApiResource type;
    @SerializedName("version_group")
    private NamedApiResource versionGroup;

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public NamedApiResource getType() {
        return type;
    }

    public void setType(NamedApiResource type) {
        this.type = type;
    }

    public NamedApiResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        this.versionGroup = versionGroup;
    }
}
