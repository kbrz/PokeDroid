package net.kbrz.pokedroid.models.lists;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.ApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class ApiResourceList extends PokeDroidModel {

    @SerializedName("count")
    private Integer count;
    @SerializedName("next")
    private String next;
    @SerializedName("previous")
    private String previous;
    @SerializedName("results")
    private List<ApiResource> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<ApiResource> getResults() {
        return results;
    }

    public void setResults(List<ApiResource> results) {
        this.results = results;
    }
}
