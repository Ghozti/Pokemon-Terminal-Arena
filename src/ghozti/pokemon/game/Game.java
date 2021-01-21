package ghozti.pokemon.game;

import ghozti.pokemon.game.battles.BattleUtils;
import ghozti.pokemon.game.battles.WildBattles;
import ghozti.pokemon.game.environment.Shop;
import ghozti.pokemon.game.interactions.GameStructure;
import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.pokemon.pokedex.Pokedex;
import ghozti.pokemon.game.user.User;

public class Game {
    public Game(){
        start();
    }

    private void start(){
        User.pokemons.add(new Pokemon(0,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));

        Pokedex pokedex = new Pokedex();
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.addNewPokemon("shdhs");
        pokedex.printPokedex();
        WildBattles.wildBattle();
    }
}
