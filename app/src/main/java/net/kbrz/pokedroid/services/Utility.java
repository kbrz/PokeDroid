package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.lists.NamedApiResourceList;
import net.kbrz.pokedroid.models.utility.Language;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Utility {

    @GET("language/")
    Call<NamedApiResourceList> getLanguages(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("language/{id}")
    Call<Language> getLanguage(@Path("id") int id);

    @GET("language/{name}")
    Call<Language> getLanguage(@Path("name") String name);

}
