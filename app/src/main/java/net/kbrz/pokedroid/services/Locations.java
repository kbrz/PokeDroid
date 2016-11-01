package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.APIResourceList;
import net.kbrz.pokedroid.models.locations.Location;
import net.kbrz.pokedroid.models.locations.LocationArea;
import net.kbrz.pokedroid.models.locations.PalParkArea;
import net.kbrz.pokedroid.models.locations.Region;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

public interface Locations {

    @GET("location/")
    Observable<APIResourceList> getLocations(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("location/{id}")
    Observable<Location> getLocation(@Path("id") int id);

    @GET("location-area/")
    Observable<APIResourceList> getLocationAreas(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("location-area/{id}")
    Observable<LocationArea> getLocationArea(@Path("id") int id);

    @GET("pal-park-area/")
    Observable<APIResourceList> getPalParkAreas(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pal-park-area/{id}")
    Observable<PalParkArea> getPalParkArea(@Path("id") int id);

    @GET("pal-park-area/{name}")
    Observable<PalParkArea> getPalParkArea(@Path("name") String name);

    @GET("region/")
    Observable<APIResourceList> getRegions(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("region/{id}")
    Observable<Region> getRegion(@Path("id") int id);

    @GET("region/{name}")
    Observable<Region> getRegion(@Path("name") String name);

}
