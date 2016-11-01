package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.ApiResource;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class Stat extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("game_index")
    private Integer gameIndex;
    @SerializedName("is_battle_only")
    private Boolean isBattleOnly;
    @SerializedName("affecting_moves")
    private MoveStatAffectSets affectingMoves;
    @SerializedName("affecting_natures")
    private NatureStatAffectSets affectingNatures;
    @SerializedName("characteristics")
    private List<ApiResource> characteristics;
    @SerializedName("move_damage_class")
    private NamedApiResource moveDamageClass;
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

    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    public Boolean getBattleOnly() {
        return isBattleOnly;
    }

    public void setBattleOnly(Boolean battleOnly) {
        isBattleOnly = battleOnly;
    }

    public MoveStatAffectSets getAffectingMoves() {
        return affectingMoves;
    }

    public void setAffectingMoves(MoveStatAffectSets affectingMoves) {
        this.affectingMoves = affectingMoves;
    }

    public NatureStatAffectSets getAffectingNatures() {
        return affectingNatures;
    }

    public void setAffectingNatures(NatureStatAffectSets affectingNatures) {
        this.affectingNatures = affectingNatures;
    }

    public List<ApiResource> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<ApiResource> characteristics) {
        this.characteristics = characteristics;
    }

    public NamedApiResource getMoveDamageClass() {
        return moveDamageClass;
    }

    public void setMoveDamageClass(NamedApiResource moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}
