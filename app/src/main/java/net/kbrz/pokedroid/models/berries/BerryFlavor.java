package net.kbrz.pokedroid.models.berries;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class BerryFlavor extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("berries")
    private List<FlavorBerryMap> berries;
    @SerializedName("contest_type")
    private NamedApiResource contestType;
    @SerializedName("names")
    private List<Name> names;

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

    public List<FlavorBerryMap> getBerries() {
        return berries;
    }

    public void setBerries(List<FlavorBerryMap> berries) {
        this.berries = berries;
    }

    public NamedApiResource getContestType() {
        return contestType;
    }

    public void setContestType(NamedApiResource contestType) {
        this.contestType = contestType;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}
