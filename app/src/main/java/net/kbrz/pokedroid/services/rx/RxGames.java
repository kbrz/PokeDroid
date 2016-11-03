package net.kbrz.pokedroid.services.rx;

import net.kbrz.pokedroid.models.games.Generation;
import net.kbrz.pokedroid.models.games.Pokedex;
import net.kbrz.pokedroid.models.games.Version;
import net.kbrz.pokedroid.models.games.VersionGroup;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface RxGames {

    @GET("generation/")
    Observable<NamedApiResourceList> getGenerations(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("generation/{id}")
    Observable<Generation> getGeneration(@Path("id") int id);

    @GET("generation/{name}")
    Observable<Generation> getGeneration(@Path("name") String name);

    @GET("pokedex/")
    Observable<NamedApiResourceList> getPokedexes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokedex/{id}")
    Observable<Pokedex> getPokedex(@Path("id") int id);

    @GET("pokedex/{name}")
    Observable<Pokedex> getPokedex(@Path("name") String name);

    @GET("version/")
    Observable<NamedApiResourceList> getVersions(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("version/{id}")
    Observable<Version> getVersion(@Path("id") int id);

    @GET("version/{name}")
    Observable<Version> getVersion(@Path("name") String name);

    @GET("version-group/")
    Observable<NamedApiResourceList> getVersionGroups(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("version-group/{id}")
    Observable<VersionGroup> getVersionGroup(@Path("id") int id);

    @GET("version-group/{name}")
    Observable<VersionGroup> getVersionGroup(@Path("name") String name);

}
