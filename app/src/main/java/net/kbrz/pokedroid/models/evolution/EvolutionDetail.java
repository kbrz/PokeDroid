package net.kbrz.pokedroid.models.evolution;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

/**
 * @author Konrad Brzykcy.
 */

public class EvolutionDetail extends PokeDroidModel {

    @SerializedName("item")
    private NamedApiResource item;
    @SerializedName("trigger")
    private NamedApiResource trigger;
    @SerializedName("gender")
    private Integer gender;
    @SerializedName("held_item")
    private NamedApiResource heldItem;
    @SerializedName("known_move")
    private NamedApiResource knownMove;
    @SerializedName("known_move_type")
    private NamedApiResource knownMoveType;
    @SerializedName("location")
    private NamedApiResource location;
    @SerializedName("min_level")
    private Integer minLevel;
    @SerializedName("min_happiness")
    private Integer minHappiness;
    @SerializedName("min_beauty")
    private Integer minBeauty;
    @SerializedName("min_affection")
    private Integer minAffection;
    @SerializedName("needs_overworld_rain")
    private Boolean needsOverworldRain;
    @SerializedName("party_species")
    private NamedApiResource partySpecies;
    @SerializedName("party_type")
    private NamedApiResource partyType;
    @SerializedName("relative_physical_stats")
    private Integer relativePhysicalStats;
    @SerializedName("time_of_day")
    private String timeOfDay;
    @SerializedName("trade_species")
    private NamedApiResource tradeSpecies;
    @SerializedName("turn_upside_down")
    private Boolean turnUpsideDown;

    public NamedApiResource getItem() {
        return item;
    }

    public void setItem(NamedApiResource item) {
        this.item = item;
    }

    public NamedApiResource getTrigger() {
        return trigger;
    }

    public void setTrigger(NamedApiResource trigger) {
        this.trigger = trigger;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public NamedApiResource getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(NamedApiResource heldItem) {
        this.heldItem = heldItem;
    }

    public NamedApiResource getKnownMove() {
        return knownMove;
    }

    public void setKnownMove(NamedApiResource knownMove) {
        this.knownMove = knownMove;
    }

    public NamedApiResource getKnownMoveType() {
        return knownMoveType;
    }

    public void setKnownMoveType(NamedApiResource knownMoveType) {
        this.knownMoveType = knownMoveType;
    }

    public NamedApiResource getLocation() {
        return location;
    }

    public void setLocation(NamedApiResource location) {
        this.location = location;
    }

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public Integer getMinHappiness() {
        return minHappiness;
    }

    public void setMinHappiness(Integer minHappiness) {
        this.minHappiness = minHappiness;
    }

    public Integer getMinBeauty() {
        return minBeauty;
    }

    public void setMinBeauty(Integer minBeauty) {
        this.minBeauty = minBeauty;
    }

    public Integer getMinAffection() {
        return minAffection;
    }

    public void setMinAffection(Integer minAffection) {
        this.minAffection = minAffection;
    }

    public Boolean getNeedsOverworldRain() {
        return needsOverworldRain;
    }

    public void setNeedsOverworldRain(Boolean needsOverworldRain) {
        this.needsOverworldRain = needsOverworldRain;
    }

    public NamedApiResource getPartySpecies() {
        return partySpecies;
    }

    public void setPartySpecies(NamedApiResource partySpecies) {
        this.partySpecies = partySpecies;
    }

    public NamedApiResource getPartyType() {
        return partyType;
    }

    public void setPartyType(NamedApiResource partyType) {
        this.partyType = partyType;
    }

    public Integer getRelativePhysicalStats() {
        return relativePhysicalStats;
    }

    public void setRelativePhysicalStats(Integer relativePhysicalStats) {
        this.relativePhysicalStats = relativePhysicalStats;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public NamedApiResource getTradeSpecies() {
        return tradeSpecies;
    }

    public void setTradeSpecies(NamedApiResource tradeSpecies) {
        this.tradeSpecies = tradeSpecies;
    }

    public Boolean getTurnUpsideDown() {
        return turnUpsideDown;
    }

    public void setTurnUpsideDown(Boolean turnUpsideDown) {
        this.turnUpsideDown = turnUpsideDown;
    }
}
