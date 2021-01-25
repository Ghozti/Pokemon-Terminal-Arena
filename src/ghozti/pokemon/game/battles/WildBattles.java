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
    }//this will get the user's choice and check for invalid inputs the method will make sure the user only enter 1 or 2

    public static void wildBattle(){
        Pokemon wildPokemon = BattleUtils.getPokemon();
        //creates the wild pokemon obj

        encounterMenu(wildPokemon.name);
        //calls the encounter menu and passes on the wild pokemon name for the wild menu

        int choice = getUserChoice();
        //this will get the user's choice which be either 1 to fight or 2 to flee

        if(choice == 1){
            //this will happen if the user chooses "1"
            Pokemon userPokemon = BattleUtils.getUPokemon();
            //this will print the user's pokemon and ask the user to enter the index of their pokemon from the array list in User.java.
            while (userPokemon.HP > 0 || wildPokemon.HP > 0){
                System.out.println("Your move!");
                wildPokemon.HP -= userPokemon.getMove();
                System.out.println("Your opponent's health: " + wildPokemon.HP);
                userPokemon.HP -= wildPokemon.wildAttack();
                System.out.println("Your pokemon's health: " + userPokemon.HP);
                if(userPokemon.HP <= 0){//if the user's pokemon health is less than or equal to 0
                    System.out.println("***THE POKEMON DEFEATED YOUR POKEMON***");
                    int defeatChoice = BattleUtils.defeatMenu();//will call the method to ask the user if they wish to call another pokemon or to flee
                    if (defeatChoice == 1){//if the user chooses to call another pokemon
                        userPokemon = BattleUtils.getUPokemon();//will replace the last user pokemon with a new object and continue the battle.
                    }else if (defeatChoice == 2){//if the user admitted defeat
                        System.out.println("***YOU ADMITTED DEFEAT***");
                        break;//will end the battle
                    }
                }else if(wildPokemon.HP <= 0){//if the wild pokemon's hp is <= 0
                    System.out.println("***YOU DEFEATED THE " + wildPokemon.name.toUpperCase() + "***");//this will happen if the user kills the pokemon
                    //TODO add the xp and money adders
                    return;
                }
            }
        }else{
            System.out.println("***YOU FLED***");
            return;
        }//this will be the output if the user chose 2 from the beginning
    }
}
