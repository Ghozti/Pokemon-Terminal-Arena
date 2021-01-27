package ghozti.pokemon.game;

import ghozti.pokemon.game.battles.WildBattles;
import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonLists;
import ghozti.pokemon.game.user.User;

public class Game {
    public Game(){
        start();
    }

    private void start(){
        User.pokemons.add(new Pokemon(100,1,1,3,"Talonflame","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));

        WildBattles.wildBattle();
        WildBattles.wildBattle();
        //TODO comment on all of the classes. Specifically pokemonUtils, Pokemon, WildBattles,PokemonCreator, Game structure, Usermethods, Battleutils.
    }
}
