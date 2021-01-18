package ghozti.pokemon.game.battles;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonCreator;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WildEncounter {

    private static Pokemon getPokemon(){
        return PokemonCreator.createPokemon();
    }//will create the wild pokemon

    private static void encounterMenu(){
        System.out.println("a wild " + getPokemon().name + " has appeared!");
        System.out.println("***WHAT WILL YOU DO?***");
        System.out.println("[1] battle \n" +
                "[2] Flee");

    }//this will print the menu

    private static int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        try {
            choice = scanner.nextInt();

            if (choice != 1 || choice != 2){
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                getUserChoice();
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT AN INT***");
            encounterMenu();
        }

        return choice;
    }//this will get the user's choice and check for invalid inputs

    private void wildBattle(){
        Scanner scanner = new Scanner(System.in);
        int pokemonchoice;
        Pokemon uPokemon;
        Pokemon wPokemon;

        System.out.println("Choose your pokemon!");
        PokemonUtils.printPokemon();
        pokemonchoice = scanner.nextInt();

        try {
            uPokemon = User.pokemons.get(pokemonchoice);
            while (uPokemon.HP != 0){
                System.out.println("Your Move!");
                //TODO create a print moves methods in Pokemon for the user to choose.
                //TODO create some methods for the battles that can be used for both wild and pva battles
                //TODO work on pokemon moves for testing
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("***THIS POKEMON DOES NOT EXIST***");
            wildBattle();
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER THE POKEMON'S INDEX ONLY***");
            wildBattle();
        }
    }
}
