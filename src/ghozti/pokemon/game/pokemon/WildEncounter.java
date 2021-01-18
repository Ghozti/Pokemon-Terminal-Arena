package ghozti.pokemon.game.pokemon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WildEncounter {

    public static void pokemonEncounter(){
        Pokemon pokemon = PokemonCreator.createPokemon();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean valid = false;

        System.out.println("a wild " + pokemon.name + " has appeared!");
        System.out.println("***WHAT WILL YOU DO?***");
        System.out.println("[1] battle \n" +
                "[2] Flee");
        try {
            while (!valid){
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2){
                    valid = true;
                }else{
                    System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT AN INT***");
            choice = scanner.nextInt();

        }
    }
}
