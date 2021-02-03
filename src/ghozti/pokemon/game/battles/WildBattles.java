package ghozti.pokemon.game.battles;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.UserMethods;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WildBattles {

    private static void encounterMenu(Pokemon pokemon){
        System.out.println("A wild " + pokemon.name + " has appeared!");
        pokemon.printStats();
        //this will print the wild pokemon's stats since the wild pokemon's "catch" boolean is false at this stage.
        System.out.println("***WHAT WILL YOU DO?***");
        System.out.println("[1] battle \n" +
                "[2] Flee");
    }//this method only takes care of printing the start of the battle.

    private static int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        //this int will hold the user's input and choice for whether they wish to battle or not
        try {
            choice = scanner.nextInt();

            if (choice < 1 || choice > 2){
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                choice = getUserChoice();
            }//this statement checks to see if the user did not enter a valid NUMBER which can be any number <1 or 2>
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT AN INT***");
            choice = getUserChoice();//this will catch the exception if the user did not enter a number.
        }
        return choice;
    }//this will get the user's choice and check for invalid inputs the method will make sure the user only enter 1 or 2

    public static void wildBattle(){
        Pokemon wildPokemon = BattleUtils.getPokemon();
        //creates the wild pokemon obj

        encounterMenu(wildPokemon);
        //calls the encounter menu and passes on the wild pokemon name for the wild menu

        int choice = getUserChoice();
        //this will get the user's choice which be either 1 to fight or 2 to flee

        if(choice == 1){
            //this will happen if the user chooses "1"
            Pokemon userPokemon = BattleUtils.getUPokemon();
            //this will print the user's pokemon and ask the user to enter the index of their pokemon from the array list in User.java.
            while (userPokemon.HP > 0 || wildPokemon.HP > 0){//while the users pokemon or wild pokemon's health is not 0
                System.out.println("Your move!");//the user will always go first
                wildPokemon.HP -= userPokemon.getMove(wildPokemon,true);//the wild pokemon's health will be decreased by the user's move damage (check comments on method) wild battle is true because the user is allowed to attemp to catch here

                if(wildPokemon.catched){//in case the user chose to catch this statement will check to see if the user caught the pokemon. If so then the loop and battle stops.
                    PokemonUtils.addXp(10,userPokemon);
                    UserMethods.addItem(1,10);
                    return;
                }else if(wildPokemon.HP <= 0){//if the wild pokemon's hp is <= 0
                    System.out.println("***YOU DEFEATED THE " + wildPokemon.name.toUpperCase() + "***");//this will happen if the user kills the pokemon
                    PokemonUtils.addXp(10,userPokemon);
                    UserMethods.addItem(1,10);
                    return;
                }

                System.out.println("Your opponent's health: " + wildPokemon.HP);

                userPokemon.HP -= wildPokemon.wildAttack();//if the battle is still going on then the wild pokemon will choose a move at random and that will be decreased from the user's pokemon health.

                System.out.println("Your pokemon's health: " + userPokemon.HP);

                if(userPokemon.HP <= 0){//if the user's pokemon health is less than or equal to 0
                    System.out.println("***THE POKEMON DEFEATED YOUR POKEMON***");
                    int defeatChoice = BattleUtils.defeatMenu();//will call the method to ask the user if they wish to call another pokemon or to flee

                    if (defeatChoice == 1){//if the user chooses to call another pokemon
                        userPokemon = BattleUtils.getUPokemon();//will replace the last user pokemon with a new object and continue the battle.
                    }else if (defeatChoice == 2){//if the user admitted defeat
                        System.out.println("***YOU ADMITTED DEFEAT***");
                        PokemonUtils.addXp(5,userPokemon);
                        return;
                    }
                }
            }
        }else{
            System.out.println("***YOU FLED***");
        }//this will be the output if the user chose 2 from the beginning
    }
}