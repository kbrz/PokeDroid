package net.kbrz.pokedroid.services.rx;

import net.kbrz.pokedroid.models.lists.NamedApiResourceList;
import net.kbrz.pokedroid.models.moves.Move;
import net.kbrz.pokedroid.models.moves.MoveAilment;
import net.kbrz.pokedroid.models.moves.MoveBattleStyle;
import net.kbrz.pokedroid.models.moves.MoveCategory;
import net.kbrz.pokedroid.models.moves.MoveDamageClass;
import net.kbrz.pokedroid.models.moves.MoveLearnMethod;
import net.kbrz.pokedroid.models.moves.MoveTarget;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface RxMoves {

    @GET("move/")
    Observable<NamedApiResourceList> getMoves(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move/{id}")
    Observable<Move> getMove(@Path("id") int id);

    @GET("move/{name}")
    Observable<Move> getMove(@Path("name") String name);

    @GET("move-ailment/")
    Observable<NamedApiResourceList> getMoveAilments(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-ailment/{id}")
    Observable<MoveAilment> getMoveAilment(@Path("id") int id);

    @GET("move-ailment/{name}")
    Observable<MoveAilment> getMoveAilment(@Path("name") String name);

    @GET("move-battle-style/")
    Observable<NamedApiResourceList> getMoveBattleStyles(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-battle-style/{id}")
    Observable<MoveBattleStyle> getMoveBattleStyle(@Path("id") int id);

    @GET("move-battle-style/{name}")
    Observable<MoveBattleStyle> getMoveBattleStyle(@Path("name") String name);

    @GET("move-category/")
    Observable<NamedApiResourceList> getMoveCategories(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-category/{id}")
    Observable<MoveCategory> getMoveCategory(@Path("id") int id);

    @GET("move-category/{name}")
    Observable<MoveCategory> getMoveCategory(@Path("name") String name);

    @GET("move-damage-class/")
    Observable<NamedApiResourceList> getMoveDamageClasses(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-damage-class/{id}")
    Observable<MoveDamageClass> getMoveDamageClass(@Path("id") int id);

    @GET("move-damage-class/{name}")
    Observable<MoveDamageClass> getMoveDamageClass(@Path("name") String name);

    @GET("move-learn-method/")
    Observable<NamedApiResourceList> getMoveLearnMethods(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-learn-method/{id}")
    Observable<MoveLearnMethod> getMoveLearnMethod(@Path("id") int id);

    @GET("move-learn-method/{name}")
    Observable<MoveLearnMethod> getMoveLearnMethod(@Path("name") String name);

    @GET("move-target/")
    Observable<NamedApiResourceList> getMoveTargets(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("move-target/{id}")
    Observable<MoveTarget> getMoveTarget(@Path("id") int id);

    @GET("move-target/{name}")
    Observable<MoveTarget> getMoveTarget(@Path("name") String name);

}
