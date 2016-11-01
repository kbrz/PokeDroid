package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.APIResourceList;
import net.kbrz.pokedroid.models.machines.Machine;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

public interface Machines {

    @GET("machine/")
    Observable<APIResourceList> getMachines(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("machine/{id}")
    Observable<Machine> getMachine(@Path("id") int id);

}
