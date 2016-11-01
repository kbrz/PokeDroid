package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.Description;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class Characteristic extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("gene_modulo")
    private Integer geneModulo;
    @SerializedName("possible_values")
    private List<Integer> possibleValues;
    @SerializedName("descriptions")
    private List<Description> descriptions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGeneModulo() {
        return geneModulo;
    }

    public void setGeneModulo(Integer geneModulo) {
        this.geneModulo = geneModulo;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }
}
