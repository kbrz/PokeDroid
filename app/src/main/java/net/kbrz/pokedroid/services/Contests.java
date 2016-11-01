package net.kbrz.pokedroid.services;


import net.kbrz.pokedroid.models.lists.ApiResourceList;
import net.kbrz.pokedroid.models.contests.ContestEffect;
import net.kbrz.pokedroid.models.contests.ContestType;
import net.kbrz.pokedroid.models.contests.SuperContestEffect;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

public interface Contests {

    @GET("contest-type/")
    Observable<ApiResourceList> getContestTypes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("contest-type/{id}")
    Observable<ContestType> getContestType(@Path("id") int id);

    @GET("contest-type/{name}")
    Observable<ContestType> getContestType(@Path("name") String name);

    @GET("contest-effect/")
    Observable<ApiResourceList> getContestEffects(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("contest-effect/{id}")
    Observable<ContestEffect> getContestEffect(@Path("id") int id);

    @GET("super-contest-effect/")
    Observable<ApiResourceList> getSuperContestEffects(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("super-contest-effect/{id}")
    Observable<SuperContestEffect> getSuperContestEffect(@Path("id") int id);

}
