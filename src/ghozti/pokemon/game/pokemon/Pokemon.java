package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pokemon {

    final private int maxHP = 100;

    public int HP, level, speed, evolutionStage;
    public String type,name,gender;
    public boolean catched;

    public Pokemon(String type, int hp, int lvl, int spd,int evolutionStage, String nm, String gndr, Boolean ctch) {
        this.type = type;
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
        //dialogue and printing
        try {
            int choice = scanner.nextInt();
            //hold the user's choice
            if(choice == -1){
                return;
            }else if(choice == 1) {
                System.out.println("You Chose A PokeBall!");
                if (User.pokeball < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                } else {
                    //TODO do the rest of the method.
                    //MAYBE USE A FOR EACH LOOP TO REUSE CODE. FOR EX:
                    /*
                        int o = 1;
                        for(int i = 0; i < 5; i++){
                            if(i == o){
                               //dosomething
                            }else{
                                i++;
                                o++;
                            }
                        }
                     */
                }
            }else if(choice == 2) {
                System.out.println("You Chose A GreatBall!");
                if (User.greatBall < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                } else {

                }
            }else if(choice == 3) {
                System.out.println("You Chose An UltraBall!");
                if (User.ultraBall < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                } else {

                }
            }else if(choice == 4) {
                System.out.println("You Chose A MasterBall!");
                if (User.masterBall < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                } else {

                }
            }else if(choice == 5) {
                System.out.println("You Chose A QuickBall!");
                if (User.quickBall < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                } else {

                }
            }else{
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                catchPokemon();
            }
        }catch(InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            catchPokemon();
        }
    }
    /*
    this method works like the delete pokemon one. It tells the user what item they wish to use and check for invalid inputs. If there is an invalid input then the method will recall itself until there is a
    valid input.
    The method also has a cancel option. If the user enters -1 the method will end and go back to whatever comes next.
     */

    public void setV_name(String newName) {
        name = newName;
    }

    public void setV_HPAndLV(int hp, int lvl) {
        HP = hp;
        level = lvl;
    }

    public void setGender() {
        int tmp = (int) ( Math.random() * 2 + 1);
        //gets a random number from 1-2
        gender = tmp == 1 ? "Male" : "Female";
        //sets the gender to male if 1 otherwise it's female
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        //scanner object
        System.out.println("To Try To Catch This Pokemon You Must Use A Ball!");
        UserMethods.printInventory();
        System.out.println("What Will You Use?");
        System.out.println("***OR TYPE 0 TO EXIT***");
        //dialogue and printing
        try {
            int[] pokeballs = {0,User.pokeball, User.greatBall, User.ultraBall, User.masterBall, User.quickBall};
            int choice = scanner.nextInt();
            //hold the user's choice
                if (choice == 0) {
                    return;
                }
                try {
                    if (pokeballs[choice] > 0) {
                        pokeballs[choice]--;
                        System.out.println("***USED AN ITEM***");
                    }else {
                        System.out.println("***YOU DO NOT HAVE ENOUGH OF THIS ITEM***");
                        test();
                    }
                }catch (IndexOutOfBoundsException e){
                    System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                    test();
                }
        }catch(InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            test();
        }
    }
}
