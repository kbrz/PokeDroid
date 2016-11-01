package net.kbrz.pokedroid;

import net.kbrz.pokedroid.services.Berries;
import net.kbrz.pokedroid.services.Contests;
import net.kbrz.pokedroid.services.Encounters;
import net.kbrz.pokedroid.services.Evolution;
import net.kbrz.pokedroid.services.Games;
import net.kbrz.pokedroid.services.Items;
import net.kbrz.pokedroid.services.Locations;
import net.kbrz.pokedroid.services.Machines;
import net.kbrz.pokedroid.services.Moves;
import net.kbrz.pokedroid.services.Pokemons;
import net.kbrz.pokedroid.services.Utility;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Konrad Brzykcy.
 */

public class PokeDroid {

    private  Retrofit retrofit;
    private Berries berriesService;
    private Contests contestsService;
    private Encounters encountersService;
    private Evolution evolutionService;
    private Games gamesService;
    private Items itemsService;
    private Locations locationsService;
    private Machines machinesService;
    private Moves movesService;
    private Pokemons pokemonsService;
    private Utility utilityService;

    public PokeDroid() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public synchronized Berries getBerriesService() {
        if (berriesService == null) {
            berriesService = retrofit.create(Berries.class);
        }
        return berriesService;
    }

    public synchronized Contests getContestsService() {
        if (contestsService == null) {
            contestsService = retrofit.create(Contests.class);
        }
        return contestsService;
    }

    public synchronized Encounters getEncountersService() {
        if (encountersService == null) {
            encountersService = retrofit.create(Encounters.class);
        }
        return encountersService;
    }

    public synchronized Evolution getEvolutionService() {
        if (evolutionService == null) {
            evolutionService = retrofit.create(Evolution.class);
        }
        return evolutionService;
    }

    public synchronized Games getGamesService() {
        if (gamesService == null) {
            gamesService = retrofit.create(Games.class);
        }
        return gamesService;
    }

    public synchronized Items getItemsService() {
        if (itemsService == null) {
            itemsService = retrofit.create(Items.class);
        }
        return itemsService;
    }

    public synchronized Locations getLocationsService() {
        if (locationsService == null) {
            locationsService = retrofit.create(Locations.class);
        }
        return locationsService;
    }

    public synchronized Machines getMachinesService() {
        if (machinesService == null) {
            machinesService = retrofit.create(Machines.class);
        }
        return machinesService;
    }

    public synchronized Moves getMovesService() {
        if (movesService == null) {
            movesService = retrofit.create(Moves.class);
        }
        return movesService;
    }

    public synchronized Pokemons getPokemonsService() {
        if (pokemonsService == null) {
            pokemonsService = retrofit.create(Pokemons.class);
        }
        return pokemonsService;
    }

    public synchronized Utility getUtilityService() {
        if (utilityService == null) {
            utilityService = retrofit.create(Utility.class);
        }
        return utilityService;
    }
}
