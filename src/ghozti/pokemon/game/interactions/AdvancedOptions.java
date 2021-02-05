package ghozti.pokemon.game.interactions;

import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.pokemon.pokedex.Pokedex;
import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvancedOptions {

    private static void aoMenu(){
        System.out.println("Enter your choice: " + "\n" +
                "[0] cancel\n" + "[1] change name\n" + "[2] print pokedex\n" + "[3] remove a pokemon\n" + "[4] check rank");
        //will display a menu for the user
    }

    private static int getChoice(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
            if(choice < 0 || choice > 4){
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                choice = getChoice();
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = getChoice();
        }
        return choice;
        //will check for invalid inputs or anything that's not a number from 1-3
    }

    public static void advancedOptions(){
        aoMenu();
        switch (getChoice()){
            case 1:
                UserMethods.setName();
                break;
            case 2:
                Pokedex.printPokedex();
                break;
            case 3:
                PokemonUtils.removePokemon();
                break;
            case 4:
                System.out.println("RANK: " + User.userRank);
                System.out.println("XP: " + User.userXP);
                break;
        }
    }
}
