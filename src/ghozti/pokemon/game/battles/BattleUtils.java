package ghozti.pokemon.game.battles;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonCreator;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BattleUtils {

    protected static Pokemon getPokemon(){
        return PokemonCreator.createPokemon();
    }

    protected static Pokemon getUPokemon(){
        Scanner scanner = new Scanner(System.in);
        int pokemonchoice;
        Pokemon uPokemon;
        Pokemon wPokemon;

        System.out.println("Choose your pokemon!");
        PokemonUtils.printPokemon();

        try {
            pokemonchoice = scanner.nextInt();
            try {
                return User.pokemons.get(pokemonchoice);
            }catch (IndexOutOfBoundsException e){
                System.out.println("***THIS POKEMON DOES NOT EXIST***");
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT (ENTER THE INDEX OF THE POKEMON)***");
        }
        return null;
    }//TODO CHECK FOR NULLS
}
