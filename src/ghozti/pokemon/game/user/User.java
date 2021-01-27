package ghozti.pokemon.game.user;

import ghozti.pokemon.game.pokemon.Pokemon;
import java.util.ArrayList;

public class User {

    public static int userRank = 1;
    //this will be the user's rank which will be put to use for different difficulties.
    public static int userXP;
    //this will hold the amount of XP the user has
    public static String name;
    //this represents the user's name

    public static int money;
    public static int healthPotions;
    public static int pokeball = 2;
    public static int greatBall = 2;
    public static int ultraBall = 2;
    public static int masterBall = 2;
    public static int quickBall = 2;
    //represents the user's inventory

    public static ArrayList<Pokemon> pokemons = new ArrayList<>();//will hold the pokemon objects of the user.
}
