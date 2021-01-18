package ghozti.pokemon.game.pokemon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WildEncounter {

    private static void encounterMenu(){
        Pokemon pokemon = PokemonCreator.createPokemon();

        System.out.println("a wild " + pokemon.name + " has appeared!");
        System.out.println("***WHAT WILL YOU DO?***");
        System.out.println("[1] battle \n" +
                "[2] Flee");

    }//this will create the pokemon and print the menu

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

    public void WildBattle(){

    }
}
