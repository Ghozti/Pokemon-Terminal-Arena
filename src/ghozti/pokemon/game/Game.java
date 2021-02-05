package ghozti.pokemon.game;

import ghozti.pokemon.game.battles.WildBattles;
import ghozti.pokemon.game.interactions.GameStructure;
import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonLists;
import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.concurrent.TimeUnit;

public class Game {
    public Game() throws InterruptedException {
        start();
    }

    private void start() throws InterruptedException {
        PokemonLists.setAllnames();
        //welcome();
        User.masterBall++;

        User.pokemons.add(new Pokemon(100,1,1,1,"Bulbasaur","male",true));
        //User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        //User.pokemons.add(new Pokemon(1,1,1,1,"nsm","uw",true));
        //User.pokemons.add(new Pokemon(100,1,1,3,"Max","male",true));

        while (true) {
            GameStructure.mainMenu();
        }
    }

    public void welcome() throws InterruptedException {
        System.out.println("welcome to Pokemon Arena!");
        System.out.println("Let's start by setting your name.");
        UserMethods.setName();

        System.out.println("Hi " + User.name + " It's nice to meet you!");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Oh what's this? you have no pokemon? well let's fix that. Here have 1 masterball and a couple of bucks to get you started");

        UserMethods.addItem(6,1);
        UserMethods.addItem(1,50);
        TimeUnit.SECONDS.sleep(3);

        System.out.println("now let's go catch some pokemon!");
        System.out.println("oh right you have none, well here i'll let you borrow mine");

        System.out.println("Added Raichu!");
        User.pokemons.add(new Pokemon(100,100,100,3,"Raichu","male",true));
        TimeUnit.SECONDS.sleep(2);
        System.out.println("i want him back btw");
        TimeUnit.SECONDS.sleep(2);

        WildBattles.wildBattle(true);
        User.pokemons.remove(0);

        System.out.println("removed : Raichu");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("thank you very much.");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("alright well you have your pokemon i have mine");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("go on...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("there's nothing left to say you finished the intro");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("alright fine, here is what's left");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("you have a rank, pokedex and codes to use. I hope you read the documentation -.- because i won't say anything else");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("alright well now this really is it. This is a terminal so i can't do this but pretend i just kicked you to the real game alright...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("now GO");
    }
}