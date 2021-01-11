package ghozti.pokemon.game.environment;

import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Shop {

    private static int shopMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to the PokeCenter!, what would you like to buy?");
        System.out.println("***OPTIONS***");
        String[] list = new String[6];

        list[0] = "[1] Pokeball ($10 per ball)";
        list[1] = "[2] Great Ball ($20 per ball)";
        list[2] = "[3] Quick Ball ($15 per ball)";
        list[3] = "[4] Ultra Ball ($45 per ball)";
        list[4] = "[5] Master Ball ($550 per ball)";
        list[5] = "[6] Health Potion ($10 per potion)";
        list[6] = "[7] Heal All Pokemon";
        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("***INVENTORY***");
        UserMethods.printInventory();
        try {
            choice = scanner.nextInt();
            if(choice == 0){
                return 0;
            }else if(choice > 0 && choice < 8){
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

    public static void shop(){
        int[] costs = {0, 10, 20, 15, 45, 550, 10};
        Scanner scanner = new Scanner(System.in);
        int choice = shopMenu();
        if(choice == 0){
            return;
        }

        if(choice == 7){
            for (int i = 0; i < User.pokemons.size(); i++){
                User.pokemons.get(i).HP = 100;
            }
            System.out.println("***Healed All Pokemon***");
        }
        int amount;

        System.out.println("Great! How Many Do You Want?");
        amount = scanner.nextInt();

        if(costs[choice] * amount > User.money){
            System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
            shop();
        }else{
            User.money -= (amount * 10);
            UserMethods.addItem(choice,amount);
        }
    }
}
