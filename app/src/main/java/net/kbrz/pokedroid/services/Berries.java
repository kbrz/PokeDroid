package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.berries.Berry;
import net.kbrz.pokedroid.models.berries.BerryFirmness;
import net.kbrz.pokedroid.models.berries.BerryFlavor;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Berries {

    @GET("berry/")
    Call<NamedApiResourceList> getBerries(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("berry/{id}")
    Call<Berry> getBerry(@Path("id") int id);

    @GET("berry/{name}")
    Call<Berry> getBerry(@Path("name") String name);

    @GET("berry-firmness/")
    Call<NamedApiResourceList> getBerryFirmnesses(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("berry-firmness/{id}")
    Call<BerryFirmness> getBerryFirmness(@Path("id") int id);

    @GET("berry-firmness/{name}")
    Call<BerryFirmness> getBerryFirmness(@Path("name") String name);

    @GET("berry-flavor/")
    Call<NamedApiResourceList> getBerryFlavors(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("berry-flavor/{id}")
    Call<BerryFlavor> getBerryFlavor(@Path("id") int id);

    @GET("berry-flavor/{name}")
    Call<BerryFlavor> getBerryFlavor(@Path("name") String name);

}
