package net.kbrz.pokedroid.models.moves;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Description;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class MoveLearnMethod extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("descriptions")
    private List<Description> descriptions;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("version_groups")
    private List<NamedApiResource> versionGroups;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<NamedApiResource> getVersionGroups() {
        return versionGroups;
    }

    public void setVersionGroups(List<NamedApiResource> versionGroups) {
        this.versionGroups = versionGroups;
    }
}
