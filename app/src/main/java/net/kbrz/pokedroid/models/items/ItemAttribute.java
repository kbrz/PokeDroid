package net.kbrz.pokedroid.models.items;

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
public class ItemAttribute extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("items")
    private List<NamedApiResource> items;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("descriptions")
    private List<Description> descriptions;

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

    public List<NamedApiResource> getItems() {
        return items;
    }

    public void setItems(List<NamedApiResource> items) {
        this.items = items;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }
}
