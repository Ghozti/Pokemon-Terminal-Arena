package ghozti.pokemon.game.environment.arena;

import ghozti.pokemon.game.battles.PlayerBattles;
import ghozti.pokemon.game.environment.arena.text.Text;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arena {

    public static void ArenaInit(){
        welcome();
        menu();
        int choice = getMenuChoice();
        switch (choice){
            case 1:
                fight();
            case 2:
                break;
        }
        //TODO call all the methods and interactions for the arena here
    }

    public static void menu(){
        System.out.println("Enter your choice! " + "\n" +
                "[1] battle" +
                "\n" +
                "[2] quit");
    }

    private static int getMenuChoice(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
            if (choice > 2 || choice < 1) choice = getMenuChoice();
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = getMenuChoice();
        }

        return choice;
    }

    private static void welcome(){
        System.out.println(Text.arenaWelcome);
    }

    private static void fight(){
        PlayerBattles.playerBattle(true);
    }
}
