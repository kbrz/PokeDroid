package net.kbrz.pokedroid.models.moves;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.ApiResource;
import net.kbrz.pokedroid.models.commons.MachineVersionDetail;
import net.kbrz.pokedroid.models.commons.Name;
import net.kbrz.pokedroid.models.commons.NamedApiResource;
import net.kbrz.pokedroid.models.commons.VerboseEffect;
import net.kbrz.pokedroid.models.pokemon.AbilityEffectChange;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class Move extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("accuracy")
    private Integer accuracy;
    @SerializedName("effect_chance")
    private Integer effectChance;
    @SerializedName("pp")
    private Integer pp;
    @SerializedName("priority")
    private Integer priority;
    @SerializedName("power")
    private Integer power;
    @SerializedName("contest_combos")
    private ContestComboSets contestCombos;
    @SerializedName("contest_type")
    private NamedApiResource contestType;
    @SerializedName("contest_effect")
    private ApiResource contestEffect;
    @SerializedName("damage_class")
    private NamedApiResource damageClass;
    @SerializedName("effect_entries")
    private List<VerboseEffect> effectEntries;
    @SerializedName("effect_changes")
    private List<AbilityEffectChange> effectChanges;
    @SerializedName("flavor_text_entries")
    private MoveFlavorText flavorTextEntries;
    @SerializedName("generation")
    private NamedApiResource generation;
    @SerializedName("machines")
    private List<MachineVersionDetail> machines;
    @SerializedName("meta")
    private MoveMetaData meta;
    @SerializedName("names")
    private List<Name> names;
    @SerializedName("past_values")
    private List<PastMoveStatValues> pastValues;
    @SerializedName("stat_changes")
    private List<MoveStatChange> statChanges;
    @SerializedName("super_contest_effect")
    private ApiResource superContestEffect;
    @SerializedName("target")
    private NamedApiResource target;
    @SerializedName("type")
    private NamedApiResource type;

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

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public ContestComboSets getContestCombos() {
        return contestCombos;
    }

    public void setContestCombos(ContestComboSets contestCombos) {
        this.contestCombos = contestCombos;
    }

    public NamedApiResource getContestType() {
        return contestType;
    }

    public void setContestType(NamedApiResource contestType) {
        this.contestType = contestType;
    }

    public ApiResource getContestEffect() {
        return contestEffect;
    }

    public void setContestEffect(ApiResource contestEffect) {
        this.contestEffect = contestEffect;
    }

    public NamedApiResource getDamageClass() {
        return damageClass;
    }

    public void setDamageClass(NamedApiResource damageClass) {
        this.damageClass = damageClass;
    }

    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public List<AbilityEffectChange> getEffectChanges() {
        return effectChanges;
    }

    public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
        this.effectChanges = effectChanges;
    }

    public MoveFlavorText getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(MoveFlavorText flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public NamedApiResource getGeneration() {
        return generation;
    }

    public void setGeneration(NamedApiResource generation) {
        this.generation = generation;
    }

    public List<MachineVersionDetail> getMachines() {
        return machines;
    }

    public void setMachines(List<MachineVersionDetail> machines) {
        this.machines = machines;
    }

    public MoveMetaData getMeta() {
        return meta;
    }

    public void setMeta(MoveMetaData meta) {
        this.meta = meta;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PastMoveStatValues> getPastValues() {
        return pastValues;
    }

    public void setPastValues(List<PastMoveStatValues> pastValues) {
        this.pastValues = pastValues;
    }

    public List<MoveStatChange> getStatChanges() {
        return statChanges;
    }

    public void setStatChanges(List<MoveStatChange> statChanges) {
        this.statChanges = statChanges;
    }

    public ApiResource getSuperContestEffect() {
        return superContestEffect;
    }

    public void setSuperContestEffect(ApiResource superContestEffect) {
        this.superContestEffect = superContestEffect;
    }

    public NamedApiResource getTarget() {
        return target;
    }

    public void setTarget(NamedApiResource target) {
        this.target = target;
    }

    public NamedApiResource getType() {
        return type;
    }

    public void setType(NamedApiResource type) {
        this.type = type;
    }
}
