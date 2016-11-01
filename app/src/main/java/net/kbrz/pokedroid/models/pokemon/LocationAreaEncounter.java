package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;
import net.kbrz.pokedroid.models.commons.VersionEncounterDetail;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class LocationAreaEncounter extends PokeDroidModel {

    @SerializedName("location_area")
    private NamedApiResource locationArea;
    @SerializedName("version_details")
    private List<VersionEncounterDetail> versionDetails;

    public NamedApiResource getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(NamedApiResource locationArea) {
        this.locationArea = locationArea;
    }

    public List<VersionEncounterDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }
}
