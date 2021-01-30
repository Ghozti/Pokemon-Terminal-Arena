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

        Pokemon enemyPokemon = BattleUtils.getPokemon();
        //creates the wild pokemon obj

        Pokemon uPokemon;
        //will represent the user's pokemon

        encounterMenu();

        if (getUserChoice() == 1){
            uPokemon = BattleUtils.getUPokemon();
            //will get the user's pokemon object

            while (uPokemon.HP > 0 || enemyPokemon.HP > 0){
                System.out.println("Your move!: ");
                enemyPokemon.HP -= uPokemon.getMove(enemyPokemon,false);
                //wil get the move damage. The bool is set to false since the user cannot catch this pokemon

                if (enemyPokemon.HP <= 0){
                    System.out.println("***YOU DEFEATED THE " + enemyPokemon.name.toUpperCase() + "***");
                    //TODO make it so normal battles call 2 to 3 pokemon and ranked call 5
                }

                System.out.println("Your opponent's health: " + enemyPokemon.HP);

                uPokemon.HP -= enemyPokemon.wildAttack();//it's wild but the function stays the same in terms of calling a radom move
            }
        }else{
            return;
        }
        //calls the encounter menu and prints
    }
}