package net.kbrz.pokedroid.models.berries;

import com.google.gson.annotations.SerializedName;

import net.kbrz.pokedroid.models.PokeDroidModel;
import net.kbrz.pokedroid.models.commons.NamedApiResource;

import java.util.List;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public class Berry extends PokeDroidModel {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("growth_time")
    private Integer growthTime;
    @SerializedName("max_harvest")
    private Integer maxHarvest;
    @SerializedName("natural_gift_power")
    private Integer naturalGiftPower;
    @SerializedName("size")
    private Integer size;
    @SerializedName("smoothness")
    private Integer smoothness;
    @SerializedName("soil_dryness")
    private Integer soilDryness;
    @SerializedName("firmness")
    private NamedApiResource firmness;
    @SerializedName("flavors")
    private List<BerryFlavorMap> flavors;
    @SerializedName("item")
    private NamedApiResource item;
    @SerializedName("natural_gift_type")
    private NamedApiResource naturalGiftType;

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

    public Integer getGrowthTime() {
        return growthTime;
    }

    public void setGrowthTime(Integer growthTime) {
        this.growthTime = growthTime;
    }

    public Integer getMaxHarvest() {
        return maxHarvest;
    }

    public void setMaxHarvest(Integer maxHarvest) {
        this.maxHarvest = maxHarvest;
    }

    public Integer getNaturalGiftPower() {
        return naturalGiftPower;
    }

    public void setNaturalGiftPower(Integer naturalGiftPower) {
        this.naturalGiftPower = naturalGiftPower;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(Integer smoothness) {
        this.smoothness = smoothness;
    }

    public Integer getSoilDryness() {
        return soilDryness;
    }

    public void setSoilDryness(Integer soilDryness) {
        this.soilDryness = soilDryness;
    }

    public NamedApiResource getFirmness() {
        return firmness;
    }

    public void setFirmness(NamedApiResource firmness) {
        this.firmness = firmness;
    }

    public List<BerryFlavorMap> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<BerryFlavorMap> flavors) {
        this.flavors = flavors;
    }

    public NamedApiResource getItem() {
        return item;
    }

    public void setItem(NamedApiResource item) {
        this.item = item;
    }

    public NamedApiResource getNaturalGiftType() {
        return naturalGiftType;
    }

    public void setNaturalGiftType(NamedApiResource naturalGiftType) {
        this.naturalGiftType = naturalGiftType;
    }
}
