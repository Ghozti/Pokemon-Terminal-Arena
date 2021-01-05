package ghozti.pokemon.game.user;

import ghozti.pokemon.game.pokemon.Pokemon;

import java.util.ArrayList;

public class User {

    public static String name;
    //this represents the user's name

    public static int money;
    public static int healthPotions;
    public static int pokeball;
    public static int greatBall;
    public static int ultraBall;
    public static int masterBall;
    public static int quickBall;
    //represents the user's inventory

    public static ArrayList<Pokemon> pokemons = new ArrayList<>();//will hold the pokemon objects of the user.
}
