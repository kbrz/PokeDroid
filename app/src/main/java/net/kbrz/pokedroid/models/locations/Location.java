package net.kbrz.pokedroid.models.locations;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.GenerationGameIndex;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class Location extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("region")
    private NamedApiResource region;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("game_indices")
    private List<GenerationGameIndex> gameIndices;
    @SerializedName("areas")
    private List<NamedApiResource> areas;

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

    public NamedApiResource getRegion() {
        return region;
    }

    public void setRegion(NamedApiResource region) {
        this.region = region;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public List<NamedApiResource> getAreas() {
        return areas;
    }

    public void setAreas(List<NamedApiResource> areas) {
        this.areas = areas;
    }
}
