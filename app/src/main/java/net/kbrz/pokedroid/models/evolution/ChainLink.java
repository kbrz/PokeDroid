package net.kbrz.pokedroid.models.evolution;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

public class ChainLink extends PokeDroidModel {

    @SerializedName("is_baby")
    private Boolean isBaby;
    @SerializedName("species")
    private NamedApiResource species;
    @SerializedName("evolution_details")
    private List<EvolutionDetail> evolutionDetails;
    @SerializedName("evolves_to")
    private List<ChainLink> evolvesTo;

    public Boolean getBaby() {
        return isBaby;
    }

    public void setBaby(Boolean baby) {
        isBaby = baby;
    }

    public NamedApiResource getSpecies() {
        return species;
    }

    public void setSpecies(NamedApiResource species) {
        this.species = species;
    }

    public List<EvolutionDetail> getEvolutionDetails() {
        return evolutionDetails;
    }

    public void setEvolutionDetails(List<EvolutionDetail> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
    }

    public List<ChainLink> getEvolvesTo() {
        return evolvesTo;
    }

    public void setEvolvesTo(List<ChainLink> evolvesTo) {
        this.evolvesTo = evolvesTo;
    }
}
