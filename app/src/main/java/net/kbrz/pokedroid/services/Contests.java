package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.contests.ContestEffect;
import net.kbrz.pokedroid.models.contests.ContestType;
import net.kbrz.pokedroid.models.contests.SuperContestEffect;
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
public interface Contests {

    @GET("contest-type/")
    Call<NamedApiResourceList> getContestTypes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("contest-type/{id}")
    Call<ContestType> getContestType(@Path("id") int id);

    @GET("contest-type/{name}")
    Call<ContestType> getContestType(@Path("name") String name);

    @GET("contest-effect/")
    Call<ApiResourceList> getContestEffects(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("contest-effect/{id}")
    Call<ContestEffect> getContestEffect(@Path("id") int id);

    @GET("super-contest-effect/")
    Call<ApiResourceList> getSuperContestEffects(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("super-contest-effect/{id}")
    Call<SuperContestEffect> getSuperContestEffect(@Path("id") int id);

}
