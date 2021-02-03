package ghozti.pokemon.game.pokemon.pokedex;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex {

    private static String name;

    private static ArrayList<String> pokemonUnlocks = new ArrayList<>();

    public void dexMenu(){
        System.out.println("What do you wish to do?");
        System.out.println("[1] set a new name\n" +
                "[2] printPokedex");

        Scanner scanner = new Scanner(System.in);
    }

    private static void setNewName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new name for your Pokedex!: ");
        String newName = scanner.nextLine();
        name = newName;
    }

    public static void addNewPokemon(String pokemonName){
        for (int i = 0; i < pokemonUnlocks.size(); i++){
            if(pokemonName.equals(pokemonUnlocks.get(i))){
                pokemonUnlocks.remove(i);
            }
        }
        pokemonUnlocks.add(pokemonName);
        System.out.println("added " + pokemonName + " to your pokedex!");
    }

    public static void printPokedex(){
        for (int i = 0; i < pokemonUnlocks.size(); i++){
            System.out.println("[" + i + "] " + pokemonUnlocks.get(i));
        }
    }
}
