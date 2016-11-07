package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.items.Item;
import net.kbrz.pokedroid.models.items.ItemAttribute;
import net.kbrz.pokedroid.models.items.ItemCategory;
import net.kbrz.pokedroid.models.items.ItemFlingEffect;
import net.kbrz.pokedroid.models.items.ItemPocket;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Items {

    @GET("item/")
    Call<NamedApiResourceList> getItems(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item/{id}")
    Call<Item> getItem(@Path("id") int id);

    @GET("item/{name}")
    Call<Item> getItem(@Path("name") String name);

    @GET("item-attribute/")
    Call<NamedApiResourceList> getItemAttributes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item-attribute/{id}")
    Call<ItemAttribute> getItemAttribute(@Path("id") int id);

    @GET("item-attribute/{name}")
    Call<ItemAttribute> getItemAttribute(@Path("name") String name);

    @GET("item-category/")
    Call<NamedApiResourceList> getItemCategories(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item-category/{id}")
    Call<ItemCategory> getItemCategory(@Path("id") int id);

    @GET("item-category/{name}")
    Call<ItemCategory> getItemCategory(@Path("name") String name);

    @GET("item-fling-effect/")
    Call<NamedApiResourceList> getItemFlingEffects(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item-fling-effect/{id}")
    Call<ItemFlingEffect> getItemFlingEffect(@Path("id") int id);

    @GET("item-fling-effect/{name}")
    Call<ItemFlingEffect> getItemFlingEffect(@Path("name") String name);

    @GET("item-pocket/")
    Call<NamedApiResourceList> getItemPockets(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("item-pocket/{id}")
    Call<ItemPocket> getItemPocket(@Path("id") int id);

    @GET("item-pocket/{name}")
    Call<ItemPocket> getItemPocket(@Path("name") String name);

}
