package net.kbrz.pokedroid.models.locations;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class EncounterMethodRate extends PokeDroidModel {

    @SerializedName("encounter_method")
    private NamedApiResource encounterMethod;
    @SerializedName("version_details")
    private List<EncounterVersionDetails> versionDetails;

    public NamedApiResource getEncounterMethod() {
        return encounterMethod;
    }

    public void setEncounterMethod(NamedApiResource encounterMethod) {
        this.encounterMethod = encounterMethod;
    }

    public List<EncounterVersionDetails> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
        this.versionDetails = versionDetails;
    }
}
