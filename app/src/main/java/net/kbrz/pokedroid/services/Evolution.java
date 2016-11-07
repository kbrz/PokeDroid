package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.evolution.EvolutionChain;
import net.kbrz.pokedroid.models.evolution.EvolutionTrigger;
import net.kbrz.pokedroid.models.lists.ApiResourceList;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Evolution {

    @GET("evolution-chain/")
    Call<ApiResourceList> getEvolutionChains(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("evolution-chain/{id}")
    Call<EvolutionChain> getEvolutionChain(@Path("id") int id);

    @GET("evolution-trigger/")
    Call<NamedApiResourceList> getEvolutionTriggers(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("evolution-trigger/{id}")
    Call<EvolutionTrigger> getEvolutionTrigger(@Path("id") int id);

    @GET("evolution-trigger/{name}")
    Call<EvolutionTrigger> getEvolutionTrigger(@Path("name") String name);

}
