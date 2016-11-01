package net.kbrz.pokedroid.models.contests;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Effect;
import net.kbrz.pokedroid.models.commons.FlavorText;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class ContestEffect extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("appeal")
    private Integer appeal;
    @SerializedName("jam")
    private Integer jam;
    @SerializedName("effect_entries")
    private List<Effect> effectEntries;
    @SerializedName("flavor_text_entries")
    private List<FlavorText> flavorTextEntries;

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

    public Integer getJam() {
        return jam;
    }

    public void setJam(Integer jam) {
        this.jam = jam;
    }

    public List<Effect> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<Effect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public List<FlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }
}
