package ghozti.pokemon.game.battles;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonLists;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WildBattles {

    private static void encounterMenu(String name){
        System.out.println("A wild " + name + " has appeared!");
        System.out.println("***WHAT WILL YOU DO?***");
        System.out.println("[1] battle \n" +
                "[2] Flee");
    }//this will print the menu

    private static int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        try {
            choice = scanner.nextInt();

            if (choice < 1 || choice > 2){
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                choice = getUserChoice();
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT AN INT***");
            choice = getUserChoice();
        }
        return choice;//TODO  ***test this***
    }//this will get the user's choice and check for invalid inputs

    public static void wildBattle(){
        Pokemon wildPokemon = BattleUtils.getPokemon();

        encounterMenu(wildPokemon.name);
        int choice = getUserChoice();

        if(choice == 1){
            Pokemon userPokemon = BattleUtils.getUPokemon();
            for (String i : PokemonLists.evl1moves){
                System.out.println(i);
            }
            while (userPokemon.HP > 0 || wildPokemon.HP > 0){
                //System.out.println("Your move!");
                //wildPokemon.HP -= userPokemon.getMove(); TODO add 2 methods. 1. prints the moves menu and the other prints 2. gets the move one of the moves should be the catched method
                //userPokemon.HP -= wildPokemon.getMove(); TODO also add a wild move method that will randomly call one of the 4 possible moves
                if(userPokemon.HP <= 0){
                    System.out.println("***THE POKEMON DEFEATED YOUR POKEMON***");
                    int defeatChoice = BattleUtils.defeatMenu();
                    if (defeatChoice == 1){
                        userPokemon = BattleUtils.getUPokemon();
                    }else if (defeatChoice == 2){
                        System.out.println("***YOU ADMITTED DEFEAT***");
                        break;
                    }
                }else if(wildPokemon.HP <= 0){
                    System.out.println("***YOU DEFEATED THE " + wildPokemon.name.toUpperCase() + "***");
                    //TODO add the xp and money adders
                    return;
                }
            }
        }else{
            System.out.println("***YOU FLED***");
            return;
        }
    }

    //TODO comment
}
