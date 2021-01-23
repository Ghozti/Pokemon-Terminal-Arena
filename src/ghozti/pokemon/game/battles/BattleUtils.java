package ghozti.pokemon.game.battles;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonCreator;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BattleUtils {

    protected static Pokemon getPokemon(){
        return PokemonCreator.createPokemon();
    }//will create a random pokemon object

    protected static Pokemon getUPokemon(){
        Scanner scanner = new Scanner(System.in);
        int pokemonchoice;

        System.out.println("Choose your pokemon!");
        PokemonUtils.printPokemon();//will print the pokemon

        try {
            pokemonchoice = scanner.nextInt();//holds the user's choice
            try {
                if (User.pokemons.get(pokemonchoice).HP <= 0){
                    System.out.println("***This pokemon does not have enough health for battle!***");
                    return getUPokemon();
                }//this will happen if the pokemon's health is 0 or less
                return User.pokemons.get(pokemonchoice);//if the pokemon is valid it will return the pokemon the user chose
            }catch (IndexOutOfBoundsException e){
                System.out.println("***THIS POKEMON DOES NOT EXIST***");
                return getUPokemon();//if the index is invalid it will recall the method to get a valid pokemon.
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT (ENTER THE INDEX OF THE POKEMON)***");
            return getUPokemon();//if the user did not enter a number this will be called
        }
    }//this is the method used to get the user's object. It will ask he user to enter the index of their pokemon and the method will make sure they enter a valid index

    protected static int defeatMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;//variable holding the user's choice

        System.out.println("Your Pokemon Was Defeated!");
        System.out.println("enter your choice: ");
        System.out.println("[1] choose another pokemon");
        System.out.println("[2] admit defeat");
        //dialouge stuff

        try {
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2){
                return choice;
            }else{
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                choice = defeatMenu();
            }//if the user's choice is not 1 or 2
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = defeatMenu();
        }//if the user's choice is not an int
        return choice;
    }//this method will be called whenever the user gets defeated during battle and return either 1 or 2
}
