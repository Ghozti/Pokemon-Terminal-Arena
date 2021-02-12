package ghozti.pokemon.game.user;

import java.util.Scanner;

public class UserMethods extends User{

    public static void setName(){
        System.out.println("Enter your name!");
        Scanner scanner = new Scanner(System.in);

        User.name = scanner.nextLine();
        //sets the user's name to whatever they want.
    }

    public static void addItem(int item,int count){
        switch(item){
            case 1:
                money += count;
                System.out.println("added " + count + " dollar(s) to your inventory!");
                break;
            case 2:
                healthPotions += count;
                System.out.println("added " + count + " health potion(s) to your inventory!");
                break;
            case 3:
                pokeball += count;
                System.out.println("added " + count + " poke ball(s) to your inventory!");
                break;
            case 4:
                greatBall += count;
                System.out.println("added " + count + " great ball(s) to your inventory!");
                break;
            case 5:
                ultraBall += count;
                System.out.println("added " + count + " ultra ball(s) to your inventory!");
                break;
            case 6:
                masterBall += count;
                System.out.println("added " + count + " master ball(s) to your inventory!");
                break;
            case 7:
                quickBall += count;
                System.out.println("added " + count + " quick ball(s) to your inventory!");
                break;
        }
        /*
            *Whats this does is basically take an argument in the form of a char. Depending on the char inputted, the method will add an item to the user's inventory.
            * I don't think i will need an invalid input checker since i am the only one that will use this method.
        */
    }

    public static void printInventory(){
        System.out.println("INVENTORY: ");
        System.out.println("$ " + money);
        System.out.println("1. " + pokeball + " PokeBall(s)");
        System.out.println("2. " + greatBall + " GreatBalls(s)");
        System.out.println("3. " + ultraBall + " UltraBall(s)");
        System.out.println("4. " + masterBall + " MasterBall(s)");
        System.out.println("5. " + quickBall + " QuickBall(s)");
        System.out.println("6. " + healthPotions + " HealthPotion(s)");
        //will display the user's inventory. simple
    }

    private static void checkRank(){
        if(User.userXP < 50){
            User.userRank = 1;
        }else if(User.userXP >= 50 && User.userXP < 100){
            User.userRank = 2;
        }else if(User.userXP >= 100){
            User.userRank = 3;
        }
        /*
        * okay so what this does is check if the user's xp meets a certain range for the method to then set a rank
         */
    }

    public static void addXp(int xp){
        User.userXP += xp;
        System.out.println("Gained " + xp + "xp");
        checkRank();
        //what this does is add xp to the user. Also it calls the addRank method every time to see if the user is eligible to meet a certain rank
    }
}
