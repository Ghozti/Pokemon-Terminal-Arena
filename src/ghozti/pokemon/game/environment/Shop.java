package ghozti.pokemon.game.environment;

import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;

import java.util.InputMismatchException;
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
        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("***INVENTORY***");
        UserMethods.printInventory();
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

    public static void shop(){
        Scanner scanner = new Scanner(System.in);
        int choice = shopMenu();
        int amount;

        switch (choice){
            case 1:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(amount * 10 > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                }else{
                    User.money -= (amount * 10);
                    System.out.println("***ADDED " + amount + " POKEBALL(S) TO YOUR INVENTORY!***");
                }
            case 2:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(amount * 20 > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                }else{
                    User.money -= (amount * 20);
                    System.out.println("***ADDED " + amount + " POKEBALL(S) TO YOUR INVENTORY!***");
                }
            case 3:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(amount * 15 > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                }else{
                    User.money -= (amount * 15);
                    System.out.println("***ADDED " + amount + " POKEBALL(S) TO YOUR INVENTORY!***");
                }
            case 4:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(amount * 45 > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                }else{
                    User.money -= (amount * 45);
                    System.out.println("***ADDED " + amount + " POKEBALL(S) TO YOUR INVENTORY!***");
                }
            case 5:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(amount * 550 > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                }else{
                    User.money -= (amount * 550);
                    System.out.println("***ADDED " + amount + " POKEBALL(S) TO YOUR INVENTORY!***");
                }
            case 6:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(amount * 10 > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                }else{
                    User.money -= (amount * 10);
                    System.out.println("***ADDED " + amount + " POKEBALL(S) TO YOUR INVENTORY!***");
                }
        }
    }
}
