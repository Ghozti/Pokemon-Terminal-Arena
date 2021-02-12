package ghozti.pokemon.game.user;

import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.pokedex.Pokedex;

import java.util.ArrayList;

public class User {

    public static int userRank;
    //this will be the user's rank which will be put to use for different difficulties.
    public static int userXP;
    //this will hold the amount of XP the user has
    public static String name;
    //this represents the user's name

    public static Pokedex pokedex;

    public static int money = 0;
    public static int healthPotions = 1;
    public static int pokeball = 0;
    public static int greatBall = 0;
    public static int ultraBall = 0;
    public static int masterBall = 0;
    public static int quickBall = 0;
    //represents the user's inventory

    public static ArrayList<Pokemon> pokemons = new ArrayList<>();//will hold the pokemon objects of the user.
}
