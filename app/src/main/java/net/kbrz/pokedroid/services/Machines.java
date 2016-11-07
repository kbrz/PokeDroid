package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.lists.ApiResourceList;
import net.kbrz.pokedroid.models.machines.Machine;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Machines {

    @GET("machine/")
    Call<ApiResourceList> getMachines(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("machine/{id}")
    Call<Machine> getMachine(@Path("id") int id);

}
