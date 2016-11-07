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
import net.kbrz.pokedroid.services.rx.RxBerries;
import net.kbrz.pokedroid.services.rx.RxContests;
import net.kbrz.pokedroid.services.rx.RxEncounters;
import net.kbrz.pokedroid.services.rx.RxEvolution;
import net.kbrz.pokedroid.services.rx.RxGames;
import net.kbrz.pokedroid.services.rx.RxItems;
import net.kbrz.pokedroid.services.rx.RxLocations;
import net.kbrz.pokedroid.services.rx.RxMachines;
import net.kbrz.pokedroid.services.rx.RxMoves;
import net.kbrz.pokedroid.services.rx.RxPokemons;
import net.kbrz.pokedroid.services.rx.RxUtility;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Konrad Brzykcy.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class PokeDroid {

    private final Retrofit retrofit;
    private Rx rx;
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

    public synchronized Rx getRx() {
        if (rx == null) {
            rx = new Rx();
        }
        return rx;
    }

    public class Rx {

        private RxBerries rxBerriesService;
        private RxContests rxContestsService;
        private RxEncounters rxEncountersService;
        private RxEvolution rxEvolutionService;
        private RxGames rxGamesService;
        private RxItems rxItemsService;
        private RxLocations rxLocationsService;
        private RxMachines rxMachinesService;
        private RxMoves rxMovesService;
        private RxPokemons rxPokemonsService;
        private RxUtility rxUtilityService;

        public synchronized RxBerries getBerriesService() {
            if (rxBerriesService == null) {
                rxBerriesService = retrofit.create(RxBerries.class);
            }
            return rxBerriesService;
        }

        public synchronized RxContests getContestsService() {
            if (rxContestsService == null) {
                rxContestsService = retrofit.create(RxContests.class);
            }
            return rxContestsService;
        }

        public synchronized RxEncounters getEncountersService() {
            if (rxEncountersService == null) {
                rxEncountersService = retrofit.create(RxEncounters.class);
            }
            return rxEncountersService;
        }

        public synchronized RxEvolution getEvolutionService() {
            if (rxEvolutionService == null) {
                rxEvolutionService = retrofit.create(RxEvolution.class);
            }
            return rxEvolutionService;
        }

        public synchronized RxGames getGamesService() {
            if (rxGamesService == null) {
                rxGamesService = retrofit.create(RxGames.class);
            }
            return rxGamesService;
        }

        public synchronized RxItems getItemsService() {
            if (rxItemsService == null) {
                rxItemsService = retrofit.create(RxItems.class);
            }
            return rxItemsService;
        }

        public synchronized RxLocations getLocationsService() {
            if (rxLocationsService == null) {
                rxLocationsService = retrofit.create(RxLocations.class);
            }
            return rxLocationsService;
        }

        public synchronized RxMachines getMachinesService() {
            if (rxMachinesService == null) {
                rxMachinesService = retrofit.create(RxMachines.class);
            }
            return rxMachinesService;
        }

        public synchronized RxMoves getMovesService() {
            if (rxMovesService == null) {
                rxMovesService = retrofit.create(RxMoves.class);
            }
            return rxMovesService;
        }

        public synchronized RxPokemons getPokemonsService() {
            if (rxPokemonsService == null) {
                rxPokemonsService = retrofit.create(RxPokemons.class);
            }
            return rxPokemonsService;
        }

        public synchronized RxUtility getUtilityService() {
            if (rxUtilityService == null) {
                rxUtilityService = retrofit.create(RxUtility.class);
            }
            return rxUtilityService;
        }

    }
}
