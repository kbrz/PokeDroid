package net.kbrz.pokedroid.models.contests;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class ContestType extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("berry_flavor")
    private NamedApiResource berryFlavor;
    @SerializedName("names")
    private List<ContestName> names;

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

    public NamedApiResource getBerryFlavor() {
        return berryFlavor;
    }

    public void setBerryFlavor(NamedApiResource berryFlavor) {
        this.berryFlavor = berryFlavor;
    }

    public List<ContestName> getNames() {
        return names;
    }

    public void setNames(List<ContestName> names) {
        this.names = names;
    }
}
