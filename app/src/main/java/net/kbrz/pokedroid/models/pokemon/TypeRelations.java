package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class TypeRelations extends PokeDroidModel {

    @SerializedName("no_damage_to")
    private List<NamedApiResource> noDamageTo;
    @SerializedName("half_damage_to")
    private List<NamedApiResource> halfDamageTo;
    @SerializedName("double_damage_to")
    private List<NamedApiResource> doubleTamageTo;
    @SerializedName("no_damage_from")
    private List<NamedApiResource> noDamageFrom;
    @SerializedName("half_damage_from")
    private List<NamedApiResource> halfDamageFrom;
    @SerializedName("double_damage_from")
    private List<NamedApiResource> doubleDamageFrom;

    public List<NamedApiResource> getNoDamageTo() {
        return noDamageTo;
    }

    public void setNoDamageTo(List<NamedApiResource> noDamageTo) {
        this.noDamageTo = noDamageTo;
    }

    public List<NamedApiResource> getHalfDamageTo() {
        return halfDamageTo;
    }

    public void setHalfDamageTo(List<NamedApiResource> halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
    }

    public List<NamedApiResource> getDoubleTamageTo() {
        return doubleTamageTo;
    }

    public void setDoubleTamageTo(List<NamedApiResource> doubleTamageTo) {
        this.doubleTamageTo = doubleTamageTo;
    }

    public List<NamedApiResource> getNoDamageFrom() {
        return noDamageFrom;
    }

    public void setNoDamageFrom(List<NamedApiResource> noDamageFrom) {
        this.noDamageFrom = noDamageFrom;
    }

    public List<NamedApiResource> getHalfDamageFrom() {
        return halfDamageFrom;
    }

    public void setHalfDamageFrom(List<NamedApiResource> halfDamageFrom) {
        this.halfDamageFrom = halfDamageFrom;
    }

    public List<NamedApiResource> getDoubleDamageFrom() {
        return doubleDamageFrom;
    }

    public void setDoubleDamageFrom(List<NamedApiResource> doubleDamageFrom) {
        this.doubleDamageFrom = doubleDamageFrom;
    }
}
