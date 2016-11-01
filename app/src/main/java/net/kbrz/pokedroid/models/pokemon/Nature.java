package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class Nature extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("decreased_stat")
    private NamedApiResource decreasedStat;
    @SerializedName("increased_stat")
    private NamedApiResource increasedStat;
    @SerializedName("hates_flavor")
    private NamedApiResource hatesFlavor;
    @SerializedName("likes_flavor")
    private NamedApiResource likesFlavor;
    @SerializedName("pokeathlon_stat_changes")
    private List<NatureStatChange> pokeathlonStatChanges;
    @SerializedName("move_battle_style_preferences")
    private List<MoveBattleStylePreference> moveBattleStylePreferences;
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

    public NamedApiResource getDecreasedStat() {
        return decreasedStat;
    }

    public void setDecreasedStat(NamedApiResource decreasedStat) {
        this.decreasedStat = decreasedStat;
    }

    public NamedApiResource getIncreasedStat() {
        return increasedStat;
    }

    public void setIncreasedStat(NamedApiResource increasedStat) {
        this.increasedStat = increasedStat;
    }

    public NamedApiResource getHatesFlavor() {
        return hatesFlavor;
    }

    public void setHatesFlavor(NamedApiResource hatesFlavor) {
        this.hatesFlavor = hatesFlavor;
    }

    public NamedApiResource getLikesFlavor() {
        return likesFlavor;
    }

    public void setLikesFlavor(NamedApiResource likesFlavor) {
        this.likesFlavor = likesFlavor;
    }

    public List<NatureStatChange> getPokeathlonStatChanges() {
        return pokeathlonStatChanges;
    }

    public void setPokeathlonStatChanges(List<NatureStatChange> pokeathlonStatChanges) {
        this.pokeathlonStatChanges = pokeathlonStatChanges;
    }

    public List<MoveBattleStylePreference> getMoveBattleStylePreferences() {
        return moveBattleStylePreferences;
    }

    public void setMoveBattleStylePreferences(List<MoveBattleStylePreference> moveBattleStylePreferences) {
        this.moveBattleStylePreferences = moveBattleStylePreferences;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}
