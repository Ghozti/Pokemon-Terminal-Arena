package ghozti.pokemon.game.environment.arena;

import ghozti.pokemon.game.battles.PlayerBattles;
import ghozti.pokemon.game.environment.arena.text.Text;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arena {

    public static void ArenaInit(){
        welcome();
        //TODO call all the methods and interactions for the arena here
    }

    public static void menu(){
        System.out.println("Enter your choice! " + "\n" +
                "[1] battle" +
                "\n" +
                "[2] quit");
    }

    private static int getMenuChoice(){
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
        }

        return choice;
    }

    public static void welcome(){
        System.out.println(Text.arenaWelcome);
    }

    public static void fight(){
        PlayerBattles.playerBattle(true);
    }
}
