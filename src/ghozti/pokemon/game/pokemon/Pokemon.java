package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pokemon {

    final private int maxHP = 100;

    public int HP, level, speed, evolutionStage;
    public String name,gender;
    public boolean catched;

    public Pokemon(int hp, int lvl, int spd,int evolutionStage, String nm, String gndr, Boolean ctch) {
        HP = hp;
        level = lvl;
        speed = spd;
        this.evolutionStage = evolutionStage;
        name = nm;
        gender = gndr;
        catched = ctch;
        //pokemon constructor
    }

    public int move1() {
        return 0;
    }

    public int move2() {
        return 0;
    }

    public int move3() {
        return 0;
    }

    public int move4() {
        return 0;
    }

    public int attack() {
        return 0;
    }

    public int wildAttack() {
        return 0;
    }

    public void battle(Pokemon pokemon) {
        while(HP > 0 || pokemon.HP > 0){
            System.out.println("Your Move!");
            attack();
            if(pokemon.HP <= 0){
                System.out.println("You Won!");
                break;
            }
            System.out.println("Opponents Move!");
            pokemon.attack();
            if(HP <= 0){
                System.out.println("You Lost!");
                break;
            }
        }
    }

    // methods from PokemonMethods^
    // methods from PokemonUtils v

    public void checkForMaxlevel() {
        if(level > 100) level = 100;
        //this will check to see if the level is over 100. If so it will set it back to 100
    }

    public void useHealthPotion(int healthPotions) {
        if(healthPotions < 1){
            System.out.println("***not enough potions!***");
        }else{
            HP = 100;
            healthPotions--;
            System.out.println("Health Has Been Restored");
        }
        /*this method will reset the health to 100 and subtract the user's health potions by 1. It will also check to see if the user has more than 0 potions.
        If they have 0 then the method will send an error message
         */
    }

    public static void catchPokemon() {
        Scanner scanner = new Scanner(System.in);
        //scanner object
        System.out.println("To Try To Catch This Pokemon You Must Use A Ball!");
        UserMethods.printInventory();
        System.out.println("What Will You Use?");
        System.out.println("***OR TYPE 0 TO EXIT***");
        //dialogue and printing

        int chance = PokemonUtils.randomizer(0,100);

        try {
            int[] pokeballs = {0, User.pokeball, User.greatBall, User.ultraBall, User.masterBall, User.quickBall};
            int choice = scanner.nextInt();
            //hold the user's choice
            if (choice == 0) {
                return;
            }
            try {
                if (pokeballs[choice] > 0) {
                    pokeballs[choice]--;
                    System.out.println("***USED AN ITEM***");
                } else {
                    System.out.println("***YOU DO NOT HAVE ENOUGH OF THIS ITEM***");
                    catchPokemon();
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                catchPokemon();
            }
        }catch (InputMismatchException e) {
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            catchPokemon();
        }
    }

    /*
    this method works like the delete pokemon one.
    The method also has a cancel option. If the user enters 0 the method will end and go back to whatever comes next.
    The method also checks for invalid inputs like strings or a number out of range from the array list.
    It also checks to see if the selected option is greater than 0. If so the method will execute otherwise it will alert the user that
    They do not have enough of the item. Then it will recall itself.
     */

    public void setName(String newName) {
        name = newName;
    }

    //will allow to change the pokemon's name
}
