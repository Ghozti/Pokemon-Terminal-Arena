package ghozti.pokemon.game.environment;

import java.util.Scanner;

public class GameStructure {
    public static int optionMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        String[] options = new String[5];
        options[0] = "[1] Check Inventory";
        options[1] = "[2] Go to Nearest Pokemon Center";
        options[2] = "[3] Go to wild grass";
        options[3] = "[4] Check pokemon(s)";
        options[4] = "[5] Look for a battle";

        for (String i : options){
            System.out.println(i);
        }
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice < 1 || choice > 6){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            optionMenu();
        }
        return choice;
    }

    public static void option1(){

    }

    public static void option2(){

    }

    public static void option3(){

    }

    public static void option4(){

    }

    public static void option5(){

    }
}
