package ghozti.pokemon.game;

import ghozti.pokemon.game.battles.WildBattles;
import ghozti.pokemon.game.interactions.GameStructure;
import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonLists;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public Game() throws InterruptedException {
        start();
    }

    private void start() throws InterruptedException {
        PokemonLists.setAllnames();
        welcome();
        //keep this here

        //User.pokemons.add(new Pokemon(100,1,1,1,"Bulbasaur","uw",true));
        //User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        //User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        //User.pokemons.add(new Pokemon(100,1,1,3,"Max","male",true));

        GameStructure.mainMenu();
        //PlayerBattles.playerBattle(false);
    }

    public void welcome() throws InterruptedException {
        System.out.println("welcome to Pokemon Arena!");
        System.out.println("Let's start by setting your name.");
        System.out.println("Enter your name: ");
        UserMethods.setName();

        System.out.println("Hi " + User.name + " It's nice to meet you!");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Oh what's this? you have no pokemon? well let's fix that. Here have 1 masterball and a couple of bucks to get you started");

        UserMethods.addItem(6,1);
        UserMethods.addItem(1,50);
        TimeUnit.SECONDS.sleep(3);

        System.out.println("now let's go catch some pokemon!");
        System.out.println("oh right you have none, well here i'll let you borrow mine");

        System.out.println("Added Riachu!");
        User.pokemons.add(new Pokemon(100,100,100,3,"Riachu","male",true));
        TimeUnit.SECONDS.sleep(2);
        System.out.println("i want him back btw");
        TimeUnit.SECONDS.sleep(2);

        WildBattles.wildBattle(true);
        User.pokemons.remove(0);

        System.out.println("removed : Riachu");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("thank you very much.");
    }
}