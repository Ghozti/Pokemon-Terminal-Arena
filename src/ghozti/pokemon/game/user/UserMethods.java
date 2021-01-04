package ghozti.pokemon.game.user;

public class UserMethods extends User{

    public static void setName(String name1){
        name = name1;
        //sets the user's name to whatever they want.
    }

    public static void addItem(char item,int count){
        switch(item){
            case 'm':
                money += count;
                System.out.println("added " + count + " dollar(s) to your inventory!");
                break;
            case 'h':
                healthPotions += count;
                System.out.println("added " + count + " health potion(s) to your inventory!");
                break;
            case 'p':
                pokeball += count;
                System.out.println("added " + count + " poke ball(s) to your inventory!");
                break;
            case 'g':
                greatBall += count;
                System.out.println("added " + count + " great ball(s) to your inventory!");
                break;
            case 'u':
                ultraBall += count;
                System.out.println("added " + count + " ultra ball(s) to your inventory!");
                break;
            case 'M':
                masterBall += masterBall;
                System.out.println("added " + count + " master ball(s) to your inventory!");
                break;
            case 'q':
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
        System.out.println("$ " + money);
        System.out.println(pokeball + " PokeBall(s)");
        System.out.println(greatBall + " GreatBalls(s)");
        System.out.println(ultraBall + " UltraBalls");
        System.out.println(masterBall + " MasterBall(s)");
        System.out.println(quickBall + " QuickBall(s)");
        System.out.println(healthPotions + " HeathPotions");
        //will display the user's inventory. simple
    }
}
