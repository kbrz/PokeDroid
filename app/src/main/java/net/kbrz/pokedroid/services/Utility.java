package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.lists.NamedApiResourceList;
import net.kbrz.pokedroid.models.utility.Language;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

public interface Utility {

    @GET("language/")
    Observable<NamedApiResourceList> getLanguages(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("language/{id}")
    Observable<Language> getLanguage(@Path("id") int id);

    @GET("language/{name}")
    Observable<Language> getLanguage(@Path("name") String name);

}
