package ghozti.pokemon.game;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonLists;
import ghozti.pokemon.game.user.User;

public class Game {
    public Game(){
        start();
    }

    private void start(){
        User.pokemons.add(new Pokemon(100,1,1,1,"Bulbasaur","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));

        PokemonLists.setAllnames();
        System.out.println(User.pokemons.get(0).name);
        User.pokemons.get(0).printStats();
        User.pokemons.get(0).evolve();
        System.out.println(User.pokemons.get(0).name);
        User.pokemons.get(0).printStats();
        //TODO comment on all of the classes. Specifically pokemonUtils, Pokemon, WildBattles,PokemonCreator, Game structure, Usermethods, Battleutils.
    }
}