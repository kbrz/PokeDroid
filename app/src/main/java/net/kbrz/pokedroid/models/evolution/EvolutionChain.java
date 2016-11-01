package net.kbrz.pokedroid.models.evolution;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class EvolutionChain extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("baby_trigger_item")
    private NamedApiResource babyTriggerItem;
    @SerializedName("chain")
    private ChainLink chain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NamedApiResource getBabyTriggerItem() {
        return babyTriggerItem;
    }

    public void setBabyTriggerItem(NamedApiResource babyTriggerItem) {
        this.babyTriggerItem = babyTriggerItem;
    }

    public ChainLink getChain() {
        return chain;
    }

    public void setChain(ChainLink chain) {
        this.chain = chain;
    }
}
