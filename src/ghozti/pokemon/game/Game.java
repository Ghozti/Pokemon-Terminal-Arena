package ghozti.pokemon.game;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonCreator;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.User;

public class Game {
    public Game(){
        start();
    }

    private void start(){
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));


        for (int i = 0; i < 1000; i++) {
            Pokemon pokemon = PokemonCreator.createPokemon();
            System.out.println(pokemon.gender + " " + "[" + pokemon.name + "]" + " " + pokemon.level + " " + pokemon.HP + " " + pokemon.evolutionStage + " " + pokemon.speed);
        }
    }
}
