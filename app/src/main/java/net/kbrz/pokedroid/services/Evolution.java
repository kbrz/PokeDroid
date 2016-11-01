package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.APIResourceList;
import net.kbrz.pokedroid.models.evolution.EvolutionChain;
import net.kbrz.pokedroid.models.evolution.EvolutionTrigger;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

public interface Evolution {

    @GET("evolution-chain/")
    Observable<APIResourceList> getEvolutionChains(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("evolution-chain/{id}")
    Observable<EvolutionChain> getEvolutionChain(@Path("id") int id);

    @GET("evolution-trigger/")
    Observable<APIResourceList> getEvolutionTriggers(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("evolution-trigger/{id}")
    Observable<EvolutionTrigger> getEvolutionTrigger(@Path("id") int id);

    @GET("evolution-trigger/{name}")
    Observable<EvolutionTrigger> getEvolutionTrigger(@Path("name") String name);

}
