package ghozti.pokemon.game.battles;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.UserMethods;
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

    public static void playerBattle(boolean ranked) {
        int pokeCount = 1;
        //this variable will be used to assert the ranked battles only call 3 pokemon.
        Pokemon enemyPokemon = BattleUtils.getPokemon();
        //creates the wild pokemon obj

        Pokemon uPokemon;
        //will represent the user's pokemon

        encounterMenu();

        if (getUserChoice() == 1) {
            System.out.println("Opponent's name: " + enemyPokemon.name);
            enemyPokemon.printStats();
            //will print the first pokemon's stats

            uPokemon = BattleUtils.getUPokemon();
            //will get the user's pokemon object

            while (uPokemon.HP > 0 || enemyPokemon.HP > 0) {
                System.out.println("Your move!: ");
                enemyPokemon.HP -= uPokemon.getMove(enemyPokemon, false);
                //wil get the move damage. The bool is set to false since the user cannot catch this pokemon

                if (enemyPokemon.HP <= 0) {
                    System.out.println("***YOU DEFEATED THE " + enemyPokemon.name + "***");
                    if (ranked && pokeCount <= 3) {
                        enemyPokemon = BattleUtils.getPokemon();
                        pokeCount++;

                        System.out.println("Your opponent has brought a new pokemon!");
                        System.out.println("name: " + enemyPokemon.name);
                        uPokemon.printStats();
                        //*once the user defeats the first pokemon in a ranked battle there will be 2 more called. The stats will also be printed.
                        //TODO make it so the pokemon created are the same or a higher level than the user's pokemon. ALSO THE AN EVO STAGE BASED ON THEIR USER"S RANK
                    } else if (ranked) {
                        UserMethods.addXp(5);
                        UserMethods.addItem(1, 20);
                        return;
                        //if the user wins against all 3 pokemon then the user's rank xp will increase by 5
                    } else {
                        UserMethods.addItem(1, 10);
                        PokemonUtils.addXp(15, uPokemon);
                        return;
                    }
                }

                System.out.println("Your opponent's health: " + enemyPokemon.HP);

                uPokemon.HP -= enemyPokemon.wildAttack();//it's wild but the function stays the same in terms of calling a random move

                System.out.println("Your pokemon's health: " + uPokemon.HP);

                if (uPokemon.HP <= 0) {//if the user's pokemon health is less than or equal to 0
                    System.out.println("***THE POKEMON DEFEATED YOUR POKEMON***");
                    int defeatChoice = BattleUtils.defeatMenu();//will call the method to ask the user if they wish to call another pokemon or to flee

                    if (defeatChoice == 1) {//if the user chooses to call another pokemon
                            uPokemon = BattleUtils.getUPokemon();//will replace the last user pokemon with a new object and continue the battle.
                    } else if (defeatChoice == 2) {//if the user admitted defeat
                        System.out.println("***YOU ADMITTED DEFEAT***");
                        if (ranked) {
                            UserMethods.addXp(-10);
                            //if the user looses the battle and it's ranked then the user's rank xp will decrease by 10
                        }
                        PokemonUtils.addXp(5, uPokemon);
                        return;
                    }
                }
            }
        } else {
            return;//if the user chooses 2
        }
    }
}