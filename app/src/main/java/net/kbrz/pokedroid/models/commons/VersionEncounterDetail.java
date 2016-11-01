package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class VersionEncounterDetail extends PokeDroidModel {

    @SerializedName("version")
    private NamedApiResource version;
    @SerializedName("max_chance")
    private Integer maxChance;
    @SerializedName("encounter_details")
    private List<Encounter> encounterDetails;

    public NamedApiResource getVersion() {
        return version;
    }

    public void setVersion(NamedApiResource version) {
        this.version = version;
    }

    public Integer getMaxChance() {
        return maxChance;
    }

    public void setMaxChance(Integer maxChance) {
        this.maxChance = maxChance;
    }

    public List<Encounter> getEncounterDetails() {
        return encounterDetails;
    }

    public void setEncounterDetails(List<Encounter> encounterDetails) {
        this.encounterDetails = encounterDetails;
    }
}
