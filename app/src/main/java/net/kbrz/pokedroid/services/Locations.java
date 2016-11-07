package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.lists.ApiResourceList;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;
import net.kbrz.pokedroid.models.locations.Location;
import net.kbrz.pokedroid.models.locations.LocationArea;
import net.kbrz.pokedroid.models.locations.PalParkArea;
import net.kbrz.pokedroid.models.locations.Region;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Locations {

    @GET("location/")
    Call<ApiResourceList> getLocations(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("location/{id}")
    Call<Location> getLocation(@Path("id") int id);

    @GET("location-area/")
    Call<ApiResourceList> getLocationAreas(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("location-area/{id}")
    Call<LocationArea> getLocationArea(@Path("id") int id);

    @GET("pal-park-area/")
    Call<NamedApiResourceList> getPalParkAreas(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pal-park-area/{id}")
    Call<PalParkArea> getPalParkArea(@Path("id") int id);

    @GET("pal-park-area/{name}")
    Call<PalParkArea> getPalParkArea(@Path("name") String name);

    @GET("region/")
    Call<NamedApiResourceList> getRegions(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("region/{id}")
    Call<Region> getRegion(@Path("id") int id);

    @GET("region/{name}")
    Call<Region> getRegion(@Path("name") String name);

}
