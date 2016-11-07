package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.lists.NamedApiResourceList;
import net.kbrz.pokedroid.models.moves.Move;
import net.kbrz.pokedroid.models.moves.MoveAilment;
import net.kbrz.pokedroid.models.moves.MoveBattleStyle;
import net.kbrz.pokedroid.models.moves.MoveCategory;
import net.kbrz.pokedroid.models.moves.MoveDamageClass;
import net.kbrz.pokedroid.models.moves.MoveLearnMethod;
import net.kbrz.pokedroid.models.moves.MoveTarget;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Moves {

    @GET("move/")
    Call<NamedApiResourceList> getMoves(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move/{id}")
    Call<Move> getMove(@Path("id") int id);

    @GET("move/{name}")
    Call<Move> getMove(@Path("name") String name);

    @GET("move-ailment/")
    Call<NamedApiResourceList> getMoveAilments(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-ailment/{id}")
    Call<MoveAilment> getMoveAilment(@Path("id") int id);

    @GET("move-ailment/{name}")
    Call<MoveAilment> getMoveAilment(@Path("name") String name);

    @GET("move-battle-style/")
    Call<NamedApiResourceList> getMoveBattleStyles(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-battle-style/{id}")
    Call<MoveBattleStyle> getMoveBattleStyle(@Path("id") int id);

    @GET("move-battle-style/{name}")
    Call<MoveBattleStyle> getMoveBattleStyle(@Path("name") String name);

    @GET("move-category/")
    Call<NamedApiResourceList> getMoveCategories(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-category/{id}")
    Call<MoveCategory> getMoveCategory(@Path("id") int id);

    @GET("move-category/{name}")
    Call<MoveCategory> getMoveCategory(@Path("name") String name);

    @GET("move-damage-class/")
    Call<NamedApiResourceList> getMoveDamageClasses(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-damage-class/{id}")
    Call<MoveDamageClass> getMoveDamageClass(@Path("id") int id);

    @GET("move-damage-class/{name}")
    Call<MoveDamageClass> getMoveDamageClass(@Path("name") String name);

    @GET("move-learn-method/")
    Call<NamedApiResourceList> getMoveLearnMethods(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-learn-method/{id}")
    Call<MoveLearnMethod> getMoveLearnMethod(@Path("id") int id);

    @GET("move-learn-method/{name}")
    Call<MoveLearnMethod> getMoveLearnMethod(@Path("name") String name);

    @GET("move-target/")
    Call<NamedApiResourceList> getMoveTargets(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-target/{id}")
    Call<MoveTarget> getMoveTarget(@Path("id") int id);

    @GET("move-target/{name}")
    Call<MoveTarget> getMoveTarget(@Path("name") String name);

}
