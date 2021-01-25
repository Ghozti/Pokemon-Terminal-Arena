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
        User.pokemons.add(new Pokemon(0,1,1,3,"Talonflame","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));

        PokemonLists.setAllnames();
        User.pokemons.get(0).getMove();
        //WildBattles.wildBattle();
    }
}
