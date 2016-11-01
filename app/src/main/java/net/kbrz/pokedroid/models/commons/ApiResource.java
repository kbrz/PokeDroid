package net.kbrz.pokedroid.models.commons;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class ApiResource extends PokeDroidModel {

    @SerializedName("url")
    private String url;
    private Integer id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        if (id == null) {
            Pattern pattern = Pattern.compile("/(\\d+)/");
            Matcher matcher = pattern.matcher(url);
            if (matcher.find()) {
                id = Integer.parseInt(matcher.group(0).replaceAll("/", ""));
            }
        }
        return id;
    }
}
