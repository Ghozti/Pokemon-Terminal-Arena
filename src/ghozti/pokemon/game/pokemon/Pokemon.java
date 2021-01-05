package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;

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
        this.evolutionStage =evolutionStage;
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
            System.err.println("not enough potions!");
        }else{
            HP = 100;
            healthPotions--;
            System.out.println("Health Has Been Restored");
        }
        //this method will reset the health to 100 and subtract the user's health potions by 1. It will also check to see if the user has more than 0 potions. If they have 0 then the method will send an error message
    }

    public static void catchPokemon() {
        Scanner scanner = new Scanner(System.in);
        //scanner object
        System.out.println("To Try To Catch This Pokemon You Must Use A Ball!");
        UserMethods.printInventory();
        System.out.println("What Will You Use?");
        //dialogue and printing
        int choice = scanner.nextInt();
        //hold the user's choice
        switch (choice){
            case 1:
                System.out.println("You Chose A PokeBall!");
                if(User.pokeball < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                }
                break;
            case 2:
                System.out.println("You Chose A GreatBall!");
                if(User.greatBall < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                }
                break;
            case 3:
                System.out.println("You Chose An UltraBall!");
                if(User.ultraBall < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                }
                break;
            case 4:
                System.out.println("You Chose A MasterBall!");
                if(User.masterBall < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                }
                break;
            case 5:
                System.out.println("You Chose A QuickBall!");
                if(User.quickBall < 1) {
                    System.out.println("***You Do Not Have Enough Of This Item***");
                    catchPokemon();
                }
                break;
        }

    }

    public void setV_name(String newName) {
        name = newName;
    }

    public void setV_HPAndLV(int hp, int lvl) {
        HP = hp;
        level = lvl;
    }

    public void setV_gender() {
        int tmp = (int) ( Math.random() * 2 + 1);
        //gets a random number from 1-2
        gender = tmp == 1 ? "Male" : "Female";
        //sets the gender to male if 1 otherwise it's female
    }
}
