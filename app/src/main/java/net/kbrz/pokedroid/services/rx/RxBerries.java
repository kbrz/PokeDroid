package net.kbrz.pokedroid.services.rx;

import net.kbrz.pokedroid.models.berries.Berry;
import net.kbrz.pokedroid.models.berries.BerryFirmness;
import net.kbrz.pokedroid.models.berries.BerryFlavor;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface RxBerries {

    @GET("berry/")
    Observable<NamedApiResourceList> getBerries(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("berry/{id}")
    Observable<Berry> getBerry(@Path("id") int id);

    @GET("berry/{name}")
    Observable<Berry> getBerry(@Path("name") String name);

    @GET("berry-firmness/")
    Observable<NamedApiResourceList> getBerryFirmnesses(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("berry-firmness/{id}")
    Observable<BerryFirmness> getBerryFirmness(@Path("id") int id);

    @GET("berry-firmness/{name}")
    Observable<BerryFirmness> getBerryFirmness(@Path("name") String name);

    @GET("berry-flavor/")
    Observable<NamedApiResourceList> getBerryFlavors(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("berry-flavor/{id}")
    Observable<BerryFlavor> getBerryFlavor(@Path("id") int id);

    @GET("berry-flavor/{name}")
    Observable<BerryFlavor> getBerryFlavor(@Path("name") String name);

}
