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

        System.out.println("Choose your pokemon!");
        PokemonUtils.printPokemon();

        try {
            pokemonchoice = scanner.nextInt();
            try {
                if (User.pokemons.get(pokemonchoice).HP <= 0){
                    System.out.println("***This pokemon does not have enough health for battle!***");
                    return getUPokemon();
                }
                return User.pokemons.get(pokemonchoice);
            }catch (IndexOutOfBoundsException e){
                System.out.println("***THIS POKEMON DOES NOT EXIST***");
                return getUPokemon();
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT (ENTER THE INDEX OF THE POKEMON)***");
            return getUPokemon();
        }
    }

    protected static int defeatMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Your Pokemon Was Defeated!");
        System.out.println("enter your choice: ");
        System.out.println("[1] choose another pokemon");
        System.out.println("[2] admit defeat");

        try {
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2){
                return choice;
            }else{
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                choice = defeatMenu();
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = defeatMenu();
        }
        return choice;
    }

    //TODO comment
}
