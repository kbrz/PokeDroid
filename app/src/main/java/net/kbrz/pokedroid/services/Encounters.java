package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.encounters.EncounterCondition;
import net.kbrz.pokedroid.models.encounters.EncounterConditionValue;
import net.kbrz.pokedroid.models.encounters.EncounterMethod;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Encounters {

    @GET("encounter-method/")
    Call<NamedApiResourceList> getEncounterMethods(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("encounter-method/{id}")
    Call<EncounterMethod> getEncounterMethod(@Path("id") int id);

    @GET("encounter-method/{name}")
    Call<EncounterMethod> getEncounterMethod(@Path("name") String name);

    @GET("encounter-condition/")
    Call<NamedApiResourceList> getEncounterConditions(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("encounter-condition/{id}")
    Call<EncounterCondition> getEncounterCondition(@Path("id") int id);

    @GET("encounter-condition/{name}")
    Call<EncounterCondition> getEncounterCondition(@Path("name") String name);

    @GET("encounter-condition-value/")
    Call<NamedApiResourceList> getEncounterConditionValues(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("encounter-condition-value/{id}")
    Call<EncounterConditionValue> getEncounterConditionValue(@Path("id") int id);

    @GET("encounter-condition-value/{name}")
    Call<EncounterConditionValue> getEncounterConditionValue(@Path("name") String name);

}
