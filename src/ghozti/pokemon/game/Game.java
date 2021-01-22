package ghozti.pokemon.game;

import ghozti.pokemon.game.battles.WildBattles;
import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.user.User;

public class Game {
    public Game(){
        start();
    }

    private void start(){
        User.pokemons.add(new Pokemon(0,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));

        WildBattles.wildBattle();
    }
}
