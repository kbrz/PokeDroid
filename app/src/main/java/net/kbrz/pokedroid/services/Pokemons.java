package net.kbrz.pokedroid.services;

import net.kbrz.pokedroid.models.lists.ApiResourceList;
import net.kbrz.pokedroid.models.lists.NamedApiResourceList;
import net.kbrz.pokedroid.models.pokemon.Ability;
import net.kbrz.pokedroid.models.pokemon.Characteristic;
import net.kbrz.pokedroid.models.pokemon.EggGroup;
import net.kbrz.pokedroid.models.pokemon.Gender;
import net.kbrz.pokedroid.models.pokemon.GrowthRate;
import net.kbrz.pokedroid.models.pokemon.Nature;
import net.kbrz.pokedroid.models.pokemon.PokeathlonStat;
import net.kbrz.pokedroid.models.pokemon.Pokemon;
import net.kbrz.pokedroid.models.pokemon.PokemonColor;
import net.kbrz.pokedroid.models.pokemon.PokemonForm;
import net.kbrz.pokedroid.models.pokemon.PokemonHabitat;
import net.kbrz.pokedroid.models.pokemon.PokemonShape;
import net.kbrz.pokedroid.models.pokemon.PokemonSpecies;
import net.kbrz.pokedroid.models.pokemon.Stat;
import net.kbrz.pokedroid.models.pokemon.Type;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings("unused")
public interface Pokemons {

    @GET("ability/")
    Call<NamedApiResourceList> getAbilities(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("ability/{id}")
    Call<Ability> getAbility(@Path("id") int id);

    @GET("ability/{name}")
    Call<Ability> getAbility(@Path("name") String name);

    @GET("characteristic/")
    Call<ApiResourceList> getCharacteristics(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("characteristic/{id}")
    Call<Characteristic> getCharacteristic(@Path("id") int id);

    @GET("egg-group/")
    Call<NamedApiResourceList> getEggGroups(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("egg-group/{id}")
    Call<EggGroup> getEggGroup(@Path("id") int id);

    @GET("egg-group/{name}")
    Call<EggGroup> getEggGroup(@Path("name") String name);

    @GET("gender/")
    Call<NamedApiResourceList> getGenders(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("gender/{id}")
    Call<Gender> getGender(@Path("id") int id);

    @GET("gender/{name}")
    Call<Gender> getGender(@Path("name") String name);

    @GET("growth-rate/")
    Call<NamedApiResourceList> getGrowthRates(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("growth-rate/{id}")
    Call<GrowthRate> getGrowthRate(@Path("id") int id);

    @GET("growth-rate/{name}")
    Call<GrowthRate> getGrowthRate(@Path("name") String name);

    @GET("nature/")
    Call<NamedApiResourceList> getNatures(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("nature/{id}")
    Call<Nature> getNature(@Path("id") int id);

    @GET("nature/{name}")
    Call<Nature> getNature(@Path("name") String name);

    @GET("pokeathlon-stat/")
    Call<NamedApiResourceList> getPokeathlonStats(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokeathlon-stat/{id}")
    Call<PokeathlonStat> getPokeathlonStat(@Path("id") int id);

    @GET("pokeathlon-stat/{name}")
    Call<PokeathlonStat> getPokeathlonStat(@Path("name") String name);

    @GET("pokemon/")
    Call<NamedApiResourceList> getPokemons(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon/{id}")
    Call<Pokemon> getPokemon(@Path("id") int id);

    @GET("pokemon/{name}")
    Call<Pokemon> getPokemon(@Path("name") String name);

    @GET("pokemon-color/")
    Call<NamedApiResourceList> getPokemonColors(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-color/{id}")
    Call<PokemonColor> getPokemonColor(@Path("id") int id);

    @GET("pokemon-color/{name}")
    Call<PokemonColor> getPokemonColor(@Path("name") String name);

    @GET("pokemon-form/")
    Call<NamedApiResourceList> getPokemonForms(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-form/{id}")
    Call<PokemonForm> getPokemonForm(@Path("id") int id);

    @GET("pokemon-form/{name}")
    Call<PokemonForm> getPokemonForm(@Path("name") String name);

    @GET("pokemon-habitat/")
    Call<NamedApiResourceList> getPokemonHabitats(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-habitat/{id}")
    Call<PokemonHabitat> getPokemonHabitat(@Path("id") int id);

    @GET("pokemon-habitat/{name}")
    Call<PokemonHabitat> getPokemonHabitat(@Path("name") String name);

    @GET("pokemon-shape/")
    Call<NamedApiResourceList> getPokemonShapes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-shape/{id}")
    Call<PokemonShape> getPokemonShape(@Path("id") int id);

    @GET("pokemon-shape/{name}")
    Call<PokemonShape> getPokemonShape(@Path("name") String name);

    @GET("pokemon-species/")
    Call<NamedApiResourceList> getPokemonSpecies(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-species/{id}")
    Call<PokemonSpecies> getPokemonSpecies(@Path("id") int id);

    @GET("pokemon-species/{name}")
    Call<PokemonSpecies> getPokemonSpecies(@Path("name") String name);

    @GET("stat/")
    Call<NamedApiResourceList> getStats(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("stat/{id}")
    Call<Stat> getStat(@Path("id") int id);

    @GET("stat/{name}")
    Call<Stat> getStat(@Path("name") String name);

    @GET("type/")
    Call<NamedApiResourceList> getTypes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("type/{id}")
    Call<Type> getType(@Path("id") int id);

    @GET("type/{name}")
    Call<Type> getType(@Path("name") String name);

}
