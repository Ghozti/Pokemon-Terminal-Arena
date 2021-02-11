package ghozti.pokemon.game;

import ghozti.pokemon.game.battles.WildBattles;
import ghozti.pokemon.game.interactions.GameStructure;
import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.pokemon.PokemonLists;
import ghozti.pokemon.game.pokemon.PokemonUtils;
import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.concurrent.TimeUnit;

public class Game {
    public Game() throws InterruptedException {
        start();
    }

    private void start() throws InterruptedException {
        PokemonLists.setAllnames();
        mainTitle();
        welcome();
        while (true) {
            GameStructure.mainMenu();
        }
    }

    private void welcome() throws InterruptedException {
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

    private void mainTitle(){
        System.out.println("\n" +
                "8888888b.           888                                                     88888888888                             d8b                   888              d8888                                    \n" +
                "888   Y88b          888                                                         888                                 Y8P                   888             d88888                                    \n" +
                "888    888          888                                                         888                                                       888            d88P888                                    \n" +
                "888   d88P  .d88b.  888  888  .d88b.  88888b.d88b.   .d88b.  88888b.            888   .d88b.  888d888 88888b.d88b.  888 88888b.   8888b.  888           d88P 888 888d888  .d88b.  88888b.   8888b.  \n" +
                "8888888P\"  d88\"\"88b 888 .88P d8P  Y8b 888 \"888 \"88b d88\"\"88b 888 \"88b           888  d8P  Y8b 888P\"   888 \"888 \"88b 888 888 \"88b     \"88b 888          d88P  888 888P\"   d8P  Y8b 888 \"88b     \"88b \n" +
                "888        888  888 888888K  88888888 888  888  888 888  888 888  888           888  88888888 888     888  888  888 888 888  888 .d888888 888         d88P   888 888     88888888 888  888 .d888888 \n" +
                "888        Y88..88P 888 \"88b Y8b.     888  888  888 Y88..88P 888  888           888  Y8b.     888     888  888  888 888 888  888 888  888 888        d8888888888 888     Y8b.     888  888 888  888 \n" +
                "888         \"Y88P\"  888  888  \"Y8888  888  888  888  \"Y88P\"  888  888           888   \"Y8888  888     888  888  888 888 888  888 \"Y888888 888       d88P     888 888      \"Y8888  888  888 \"Y888888 \n" +
                "                                                                                                                                                                                                    \n" +
                "                                                                                                                                                                                                    \n" +
                "                                                                                                                                                                                                    \n");

        System.out.println("By: Ghozti.\n" +
                "For: you <3");
    }
}