package net.kbrz.pokedroid.services.rx;

import net.kbrz.pokedroid.models.encounters.EncounterCondition;
import net.kbrz.pokedroid.models.encounters.EncounterConditionValue;
import net.kbrz.pokedroid.models.encounters.EncounterMethod;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface RxEncounters {

    @GET("encounter-method/")
    Observable<NamedApiResourceList> getEncounterMethods(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("encounter-method/{id}")
    Observable<EncounterMethod> getEncounterMethod(@Path("id") int id);

    @GET("encounter-method/{name}")
    Observable<EncounterMethod> getEncounterMethod(@Path("name") String name);

    @GET("encounter-condition/")
    Observable<NamedApiResourceList> getEncounterConditions(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("encounter-condition/{id}")
    Observable<EncounterCondition> getEncounterCondition(@Path("id") int id);

    @GET("encounter-condition/{name}")
    Observable<EncounterCondition> getEncounterCondition(@Path("name") String name);

    @GET("encounter-condition-value/")
    Observable<NamedApiResourceList> getEncounterConditionValues(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("encounter-condition-value/{id}")
    Observable<EncounterConditionValue> getEncounterConditionValue(@Path("id") int id);

    @GET("encounter-condition-value/{name}")
    Observable<EncounterConditionValue> getEncounterConditionValue(@Path("name") String name);

}
