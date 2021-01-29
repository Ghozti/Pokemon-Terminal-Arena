package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.user.User;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PokemonUtils{

    public static int randomizer(int num, int num2){
        return (int) ( Math.random() * num2 + num);
    }//this util can be used anywhere. It will create random number in between whatever numbers specified in the argument

    public static void printPokemon(boolean explicit){//explicit is the bool which represents if the user wants to display more in dept stats
        for (int i = 0; i < User.pokemons.size(); i++) {
            System.out.println("[ " + i + " ]" + "" + User.pokemons.get(i).name);//will print the pokemon by index and name
            if (explicit) {
                User.pokemons.get(i).printStats();//if explicit is true, this will be called which will print the pokemon's stats such as level, HP, etc
            }
        }
        //will print pokemon
    }

    public static void addPokemon(Pokemon pokemon){
        User.pokemons.add(pokemon);
        System.out.println("Added: " + pokemon.name + " to your inventory!");
        //adds a pokemon object to the User.pokemons arraylist
        pokemon.catched = true;
        //sets the pokemon's catch boolean to true
    }

    public static void removePokemon(){
        try {
            Scanner scanner = new Scanner(System.in);
            printPokemon(false);
            System.out.println("***Enter the index of the pokemon that you want to remove***");
            System.out.println("***Or Enter [-1] to cancel***");
            try {
                int ind = scanner.nextInt();
                if(ind == -1){
                    return;
                }
                User.pokemons.remove(ind);
                System.out.println("removed the pokemon from your inventory");
            }catch (InputMismatchException e){
                System.out.println("***THIS IS NOT AN INT***");
                removePokemon();
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("***YOU EITHER ENTERED A NEGATIVE NUMBER OR A NUMBER THAT DOES NOT MATCH AN INDEX...PLEASE ENTER A VALID NUMBER***");
            removePokemon();
        }
    }

    /*
    *this method will ask the user to enter the index of the pokemon that they wish to remove. The method also checks for invalid inputs/index out of bounds.
    * If the method captures an invalid input it will call itself again until the user does it right.
    * The method also has a cancel option. If the user enters -1 the method will end and go back to whatever comes next.
     */

    /*************************************************
     * XP SYSTEM BELOW********************************
     ************************************************/

    public static void addXp(int amount, Pokemon pokemon){
        
        int required = 0;//this int will hold the requirement to gain a level based on the pokemon's evolution stage
        
        if(pokemon.evolutionStage == 1) required = 50;//the required xp per level will change by 25 every evo stage going up
        else if(pokemon.evolutionStage == 2) required = 75;
        else if(pokemon.evolutionStage == 3) required = 100;

        pokemon.XP += amount;
        System.out.println("added " + amount + "XP");
        
        if(pokemon.XP >= required){
            if (pokemon.level >= 100) {
                System.out.println("Pokemon level already at max!");
                return;
            }//this checks to see if the pokemon is already at max level (100)
            pokemon.level++;
            pokemon.XP = 0;
            System.out.println("Your pokemon leveled up!  level: " + pokemon.level);
        }//once the xp meets the requirement the level gets added and the xp gets set to 0 again

        if (pokemon.evolveReady()){
            pokemon.evolve();
        }
    }
}