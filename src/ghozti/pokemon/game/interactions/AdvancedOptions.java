package ghozti.pokemon.game.interactions;

import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.pokemon.pokedex.Pokedex;
import ghozti.pokemon.game.user.UserMethods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvancedOptions {

    private static void aoMenu(){
        System.out.println("Enter your choice: " + "\n" +
                "[0] cancel\n" + "[1] change name\n" + "[2] print pokedex\n" + "[3] remove a pokemon");
        //will display a menu for the user
    }

    private static int getChoice(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
            if(choice < 0 || choice > 3){
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
        }
    }
}
