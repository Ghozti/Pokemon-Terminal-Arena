package ghozti.pokemon.game.pokemon;


import ghozti.pokemon.game.user.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PokemonUtils{

    public static int randomizer(int num, int num2){
        return (int) ( Math.random() * num2 + num);
    }

    public static void printPokemon(){
        for (int i = 0; i < User.pokemons.size(); i++) {
            System.out.println("[ " + i + " ]" + "" + User.pokemons.get(i).name);
        }
    }

    public static void addPokemon(Pokemon pokemon){
        User.pokemons.add(pokemon);
        System.out.println("Added: " + pokemon.name + " to your inventory!");
    }

    public static void removePokemon(){
        try {
            Scanner scanner = new Scanner(System.in);
            printPokemon();
            System.out.println("***Enter the index of the pokemon that you want to remove***");
            try {
                int ind = scanner.nextInt();
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
}