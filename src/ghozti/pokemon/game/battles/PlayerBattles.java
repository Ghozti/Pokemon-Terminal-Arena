package ghozti.pokemon.game.battles;

import ghozti.pokemon.game.pokemon.Pokemon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerBattles {

    private static void encounterMenu() {
        System.out.println("A challenger has challenged you to a battle!");

        System.out.println("***WHAT WILL YOU DO?***");
        System.out.println("[1] battle \n" +
                "[2] Flee");
    }

    private static int getUserChoice(){
        int choice;
        Scanner scanner = new Scanner(System.in);

        try {
            choice = scanner.nextInt();

            if (choice < 1 || choice > 2){
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                choice = getUserChoice();
            }else{
                return choice;
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = getUserChoice();
        }
        return choice;
    }

    public static void playerBattle(boolean ranked){

        Pokemon wildPokemon = BattleUtils.getPokemon();
        //creates the wild pokemon obj

        encounterMenu();
        //calls the encounter menu and prints
    }
}
