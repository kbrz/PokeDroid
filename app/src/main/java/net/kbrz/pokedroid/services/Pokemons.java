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

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Konrad Brzykcy.
 */

public interface Pokemons {

    @GET("ability/")
    Observable<NamedApiResourceList> getAbilities(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("ability/{id}")
    Observable<Ability> getAbility(@Path("id") int id);

    @GET("ability/{name}")
    Observable<Ability> getAbility(@Path("name") String name);

    @GET("characteristic/")
    Observable<ApiResourceList> getCharacteristics(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("characteristic/{id}")
    Observable<Characteristic> getCharacteristic(@Path("id") int id);

    @GET("egg-group/")
    Observable<NamedApiResourceList> getEggGroups(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("egg-group/{id}")
    Observable<EggGroup> getEggGroup(@Path("id") int id);

    @GET("egg-group/{name}")
    Observable<EggGroup> getEggGroup(@Path("name") String name);

    @GET("gender/")
    Observable<NamedApiResourceList> getGenders(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("gender/{id}")
    Observable<Gender> getGender(@Path("id") int id);

    @GET("gender/{name}")
    Observable<Gender> getGender(@Path("name") String name);

    @GET("growth-rate/")
    Observable<NamedApiResourceList> getGrowthRates(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("growth-rate/{id}")
    Observable<GrowthRate> getGrowthRate(@Path("id") int id);

    @GET("growth-rate/{name}")
    Observable<GrowthRate> getGrowthRate(@Path("name") String name);

    @GET("nature/")
    Observable<NamedApiResourceList> getNatures(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("nature/{id}")
    Observable<Nature> getNature(@Path("id") int id);

    @GET("nature/{name}")
    Observable<Nature> getNature(@Path("name") String name);

    @GET("pokeathlon-stat/")
    Observable<NamedApiResourceList> getPokeathlonStats(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokeathlon-stat/{id}")
    Observable<PokeathlonStat> getPokeathlonStat(@Path("id") int id);

    @GET("pokeathlon-stat/{name}")
    Observable<PokeathlonStat> getPokeathlonStat(@Path("name") String name);

    @GET("pokemon/")
    Observable<NamedApiResourceList> getPokemons(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon/{id}")
    Observable<Pokemon> getPokemon(@Path("id") int id);

    @GET("pokemon/{name}")
    Observable<Pokemon> getPokemon(@Path("name") String name);

    @GET("pokemon-color/")
    Observable<NamedApiResourceList> getPokemonColors(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-color/{id}")
    Observable<PokemonColor> getPokemonColor(@Path("id") int id);

    @GET("pokemon-color/{name}")
    Observable<PokemonColor> getPokemonColor(@Path("name") String name);

    @GET("pokemon-form/")
    Observable<NamedApiResourceList> getPokemonForms(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-form/{id}")
    Observable<PokemonForm> getPokemonForm(@Path("id") int id);

    @GET("pokemon-form/{name}")
    Observable<PokemonForm> getPokemonForm(@Path("name") String name);

    @GET("pokemon-habitat/")
    Observable<NamedApiResourceList> getPokemonHabitats(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-habitat/{id}")
    Observable<PokemonHabitat> getPokemonHabitat(@Path("id") int id);

    @GET("pokemon-habitat/{name}")
    Observable<PokemonHabitat> getPokemonHabitat(@Path("name") String name);

    @GET("pokemon-shape/")
    Observable<NamedApiResourceList> getPokemonShapes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-shape/{id}")
    Observable<PokemonShape> getPokemonShape(@Path("id") int id);

    @GET("pokemon-shape/{name}")
    Observable<PokemonShape> getPokemonShape(@Path("name") String name);

    @GET("pokemon-species/")
    Observable<NamedApiResourceList> getPokemonSpecieses(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("pokemon-species/{id}")
    Observable<PokemonSpecies> getPokemonSpecies(@Path("id") int id);

    @GET("pokemon-species/{name}")
    Observable<PokemonSpecies> getPokemonSpecies(@Path("name") String name);

    @GET("stat/")
    Observable<NamedApiResourceList> getStats(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("stat/{id}")
    Observable<Stat> getStat(@Path("id") int id);

    @GET("stat/{name}")
    Observable<Stat> getStat(@Path("name") String name);

    @GET("type/")
    Observable<NamedApiResourceList> getTypes(@Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("type/{id}")
    Observable<Type> getType(@Path("id") int id);

    @GET("type/{name}")
    Observable<Type> getType(@Path("name") String name);

}
