package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Name;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class PokeathlonStat extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("affecting_natures")
    private NaturePokeathlonStatAffectSets affectingNatures;

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

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public NaturePokeathlonStatAffectSets getAffectingNatures() {
        return affectingNatures;
    }

    public void setAffectingNatures(NaturePokeathlonStatAffectSets affectingNatures) {
        this.affectingNatures = affectingNatures;
    }
}
