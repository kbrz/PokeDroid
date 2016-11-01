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
public class PokemonForm extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("order")
    private Integer order;
    @SerializedName("form_order")
    private Integer formOrder;
    @SerializedName("is_default")
    private Boolean isDefault;
    @SerializedName("is_battle_only")
    private Boolean isBattleOnly;
    @SerializedName("is_mega")
    private Boolean isMega;
    @SerializedName("form_name")
    private String formName;
    @SerializedName("pokemon")
    private NamedApiResource pokemon;
    @SerializedName("sprites")
    private PokemonFormSprites sprites;
    @SerializedName("version_group")
    private NamedApiResource versionGroup;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("form_names")
    private List<Name> formNames;

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getFormOrder() {
        return formOrder;
    }

    public void setFormOrder(Integer formOrder) {
        this.formOrder = formOrder;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getBattleOnly() {
        return isBattleOnly;
    }

    public void setBattleOnly(Boolean battleOnly) {
        isBattleOnly = battleOnly;
    }

    public Boolean getMega() {
        return isMega;
    }

    public void setMega(Boolean mega) {
        isMega = mega;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public NamedApiResource getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedApiResource pokemon) {
        this.pokemon = pokemon;
    }

    public PokemonFormSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonFormSprites sprites) {
        this.sprites = sprites;
    }

    public NamedApiResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        this.versionGroup = versionGroup;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<Name> getFormNames() {
        return formNames;
    }

    public void setFormNames(List<Name> formNames) {
        this.formNames = formNames;
    }
}
