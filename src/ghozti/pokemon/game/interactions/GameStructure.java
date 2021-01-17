package ghozti.pokemon.game.interactions;


import ghozti.pokemon.game.environment.Shop;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameStructure {

    public static int optionMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        String[] options = new String[5];
        options[0] = "[1] Check Inventory";
        options[1] = "[2] Go to Nearest Pokemon Center";
        options[2] = "[3] Go to wild grass";
        options[3] = "[4] Check pokemon";
        options[4] = "[5] Look for a battle";

        for (String i : options){
            System.out.println(i);
        }
        System.out.println("Enter your choice: ");

        choice = scanner.nextInt();

        if (choice < 1 || choice > 6) {
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            optionMenu();
        }

        return choice;
    }
    //this method will print out options the user can input and check to see if it is valid. If so it will return the choice #

    public static void checkInventory(){
        UserMethods.printInventory();
    }
    //this will call the print inventory method.

    public static void goToNearestPokemonCenter(){
        Shop.shop();
        //this will call the shop method.
    }

    public static void goToWildGrass(){
        //This method will allow the user to search for wild pokemon to catch
    }

    public static void checkPokemon(){
        Scanner scanner = new Scanner(System.in);

        PokemonUtils.printPokemon();
        System.out.println("***PRINT MORE DETAILS?***");
        System.out.println("[1] yes\n" + "[2] no");

        try {
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 2) {
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                checkPokemon();
            }

            boolean printDetails = choice == 1 ? true : false;

            if (printDetails) {
                for (int i = 0; i < User.pokemons.size(); i++) {
                    System.out.println("[ " + i + " ]" + "" + User.pokemons.get(i).name);
                    System.out.println("[HP]" + "" + User.pokemons.get(i).HP);
                    System.out.println("[Level]" + "" + User.pokemons.get(i).level);
                    System.out.println("[Speed]" + "" + User.pokemons.get(i).speed);
                    System.out.println("[Evolve Stage]" + "" + User.pokemons.get(i).evolutionStage);
                    System.out.println("[Name]" + "" + User.pokemons.get(i).name);
                    System.out.println("[Gender]" + "" + User.pokemons.get(i).gender);
                    System.out.println("");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            checkPokemon();
        }
    }

    /*
        This will print out the basic pokemon info like names. Then after it will ask the user if they want more detailed info. If so it will print out every attribute in the pokemon class
        The method also checks for invalid inputs
     */

    public static void lookForBattle(){
        //TODO call the main battle method
    }

    public static void mainMenu(){
        int choice = optionMenu();

        switch (choice){
            case 1:
                checkInventory();
                break;
            case 2:
                goToNearestPokemonCenter();
                break;
            case 3:
                goToWildGrass();
                break;
            case 4:
                checkPokemon();
                break;
            case 5:
                lookForBattle();
                break;
        }
    }
}
