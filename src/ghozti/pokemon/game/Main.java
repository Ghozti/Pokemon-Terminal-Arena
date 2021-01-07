package ghozti.pokemon.game;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;

public class Main {

    public static void main(String[] args) {
        PokemonUtils.addPokemon(new Pokemon("s",1,1,1,1,"s","m",true));
        PokemonUtils.removePokemon();
    }
}
