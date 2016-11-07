package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.games.Generation;
import net.kbrz.pokedroid.models.games.Pokedex;
import net.kbrz.pokedroid.models.games.Version;
import net.kbrz.pokedroid.models.games.VersionGroup;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Games {

    @GET("generation/")
    Call<NamedApiResourceList> getGenerations(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("generation/{id}")
    Call<Generation> getGeneration(@Path("id") int id);

    @GET("generation/{name}")
    Call<Generation> getGeneration(@Path("name") String name);

    @GET("pokedex/")
    Call<NamedApiResourceList> getPokedexes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokedex/{id}")
    Call<Pokedex> getPokedex(@Path("id") int id);

    @GET("pokedex/{name}")
    Call<Pokedex> getPokedex(@Path("name") String name);

    @GET("version/")
    Call<NamedApiResourceList> getVersions(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("version/{id}")
    Call<Version> getVersion(@Path("id") int id);

    @GET("version/{name}")
    Call<Version> getVersion(@Path("name") String name);

    @GET("version-group/")
    Call<NamedApiResourceList> getVersionGroups(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("version-group/{id}")
    Call<VersionGroup> getVersionGroup(@Path("id") int id);

    @GET("version-group/{name}")
    Call<VersionGroup> getVersionGroup(@Path("name") String name);

}
