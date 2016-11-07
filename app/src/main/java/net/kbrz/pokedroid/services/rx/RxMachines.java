package net.kbrz.pokedroid.services.rx;

import net.kbrz.pokedroid.models.lists.ApiResourceList;
import net.kbrz.pokedroid.models.machines.Machine;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface RxMachines {

    @GET("machine/")
    Observable<ApiResourceList> getMachines(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("machine/{id}")
    Observable<Machine> getMachine(@Path("id") int id);

}
