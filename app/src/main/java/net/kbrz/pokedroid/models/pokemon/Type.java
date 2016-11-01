package net.kbrz.pokedroid.models.pokemon;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.GenerationGameIndex;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class Type extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("damage_relations")
    private TypeRelations damageRelations;
    @SerializedName("game_indices")
    private List<GenerationGameIndex> gameIndices;
    @SerializedName("generation")
    private NamedApiResource generation;
    @SerializedName("move_damage_class")
    private NamedApiResource moveDamageClass;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("pokemon")
    private List<TypePokemon> pokemon;
    @SerializedName("moves")
    private List<NamedApiResource> moves;

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

    public TypeRelations getDamageRelations() {
        return damageRelations;
    }

    public void setDamageRelations(TypeRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    public List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public NamedApiResource getGeneration() {
        return generation;
    }

    public void setGeneration(NamedApiResource generation) {
        this.generation = generation;
    }

    public NamedApiResource getMoveDamageClass() {
        return moveDamageClass;
    }

    public void setMoveDamageClass(NamedApiResource moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<TypePokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<TypePokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<NamedApiResource> getMoves() {
        return moves;
    }

    public void setMoves(List<NamedApiResource> moves) {
        this.moves = moves;
    }
}
