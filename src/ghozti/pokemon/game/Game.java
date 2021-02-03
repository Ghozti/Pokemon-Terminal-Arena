package ghozti.pokemon.game;

import ghozti.pokemon.game.interactions.GameStructure;
import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonLists;
import ghozti.pokemon.game.user.User;

public class Game {
    public Game(){
        start();
    }

    private void start(){
        PokemonLists.setAllnames();

        User.pokemons.add(new Pokemon(100,1,1,1,"Bulbasaur","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(100,1,1,3,"Max","male",true));

        GameStructure.mainMenu();
        //PlayerBattles.playerBattle(false);
    }
}