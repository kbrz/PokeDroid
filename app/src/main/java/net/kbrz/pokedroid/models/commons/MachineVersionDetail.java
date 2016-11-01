package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class MachineVersionDetail extends PokeDroidModel {

    @SerializedName("machine")
    private ApiResource machine;
    @SerializedName("version_group")
    private NamedApiResource versionGroup;

    public ApiResource getMachine() {
        return machine;
    }

    public void setMachine(ApiResource machine) {
        this.machine = machine;
    }

    public NamedApiResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        this.versionGroup = versionGroup;
    }
}
