package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.APIResourceList;
import net.kbrz.pokedroid.models.items.Item;
import net.kbrz.pokedroid.models.items.ItemAttribute;
import net.kbrz.pokedroid.models.items.ItemCategory;
import net.kbrz.pokedroid.models.items.ItemFlingEffect;
import net.kbrz.pokedroid.models.items.ItemPocket;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

public interface Items {

    @GET("item/")
    Observable<APIResourceList> getItems(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item/{id}")
    Observable<Item> getItem(@Path("id") int id);

    @GET("item/{name}")
    Observable<Item> getItem(@Path("name") String name);

    @GET("item-attribute/")
    Observable<APIResourceList> getItemAttributes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item-attribute/{id}")
    Observable<ItemAttribute> getItemAttribute(@Path("id") int id);

    @GET("item-attribute/{name}")
    Observable<ItemAttribute> getItemAttribute(@Path("name") String name);

    @GET("item-category/")
    Observable<APIResourceList> getItemCategories(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item-category/{id}")
    Observable<ItemCategory> getItemCategory(@Path("id") int id);

    @GET("item-category/{name}")
    Observable<ItemCategory> getItemCategory(@Path("name") String name);

    @GET("item-fling-effect/")
    Observable<APIResourceList> getItemFlingEffects(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item-fling-effect/{id}")
    Observable<ItemFlingEffect> getItemFlingEffect(@Path("id") int id);

    @GET("item-fling-effect/{name}")
    Observable<ItemFlingEffect> getItemFlingEffect(@Path("name") String name);

    @GET("item-pocket/")
    Observable<APIResourceList> getItemPockets(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item-pocket/{id}")
    Observable<ItemPocket> getItemPocket(@Path("id") int id);

    @GET("item-pocket/{name}")
    Observable<ItemPocket> getItemPocket(@Path("name") String name);

}
