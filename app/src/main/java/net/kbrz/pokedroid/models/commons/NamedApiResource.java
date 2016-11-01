package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class NamedApiResource extends ApiResource {

    @SerializedName("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
