package ghozti.pokemon.game.battles;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.user.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WildBattles {

    private static void encounterMenu(){
        System.out.println("a wild " + BattleUtils.getPokemon().name + " has appeared!");
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

    public static void wildBattle(){
        encounterMenu();
        int choice = getUserChoice();

        if(choice == 1){
            Pokemon userPokemon = BattleUtils.getUPokemon();
            Pokemon wildPokemon = BattleUtils.getPokemon();

            while (userPokemon.HP > 0 || wildPokemon.HP > 0){
                System.out.println("Your move!");
                //wildPokemon.HP -= userPokemon.getMove(); TODO add 2 methods. 1. prints the moves menu and the other prints 2. gets the move
                //userPokemon.HP -= wildPokemon.getMove(); TODO also add a wild move method that will randomly call one of the 4 possible moves
            }

            if(userPokemon.HP <= 0){
                System.out.println("***YOU DEFEATED THE POKEMON***");
            }else if(wildPokemon.HP <= 0){
                System.out.println("***THE POKEMON DEFEATED YOUR POKEMON***");
                //TODO add something that can allow for the user to bring another pokemon
            }
        }else{
            System.out.println("***YOU FLED***");
            return;
        }
    }

}
