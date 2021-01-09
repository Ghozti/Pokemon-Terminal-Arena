package ghozti.pokemon.game.environment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {

    private static int shopMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to the PokeCenter!, what would you like to buy?");
        String[] list = new String[6];

        list[0] = "[1] Pokeball ($10 per ball)";
        list[1] = "[2] Great Ball ($20 per ball)";
        list[2] = "[3] Quick Ball ($15 per ball)";
        list[3] = "[4] Ultra Ball ($45 per ball)";
        list[4] = "[5] Master Ball ($550 per ball)";
        list[5] = "[6] Health Potion ($ per potion)";
        for (String i : list) {
            System.out.println(i);
        }
        try {
            choice = scanner.nextInt();
            if(choice == 0){
                return 0;
            }else if(choice > 0 && choice < 7){
                return choice;
            }else{
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                shopMenu();
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            shopMenu();
        }
        return 0;
    }

    private static void messages(int ind){
        String[] messages = new String[2];
        messages[0] = "Great!, how many do you want?";
        messages[1] = "Not enough cash!";
    }

    private static void buyItem(int item, String itemName){

    }
}
