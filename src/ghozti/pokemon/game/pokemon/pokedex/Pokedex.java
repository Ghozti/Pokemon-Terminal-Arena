package ghozti.pokemon.game.pokemon.pokedex;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex {

    private String name;

    private ArrayList<String> pokemonUnlocks = new ArrayList<>();

    public Pokedex(){
        //setNewName();
    }

    public void dexMenu(){
        System.out.println("What do you wish to do?");
        System.out.println("[1] set a new name\n" +
                "[2] printPokedex");

        Scanner scanner = new Scanner(System.in);
    }

    private void setNewName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new name for your Pokedex!: ");
        String newName = scanner.nextLine();
        name = newName;
    }

    public void addNewPokemon(String pokemonName){
        pokemonUnlocks.add("[" + pokemonUnlocks.size() + "] " + pokemonName);
        for (int i = 0; i < pokemonUnlocks.size(); i++) {
            if (pokemonUnlocks.get(i).equals(pokemonName)) {
                pokemonUnlocks.remove(i);
            }
        }
    }

    public void printPokedex(){
        for (int i = 0; i < pokemonUnlocks.size(); i++){
            System.out.println(pokemonUnlocks.get(i));
        }
    }
}
