package ghozti.pokemon.game.pokemon;

import java.util.ArrayList;

public class PokemonLists {

    /*
        *MY THEORY
        * have an array list of names, types, and every other argument the pokemon class needs for the object.
        * then have a randomizer determine what to put based on the user's stats
        * ex:
        * user rank level 1:
        * chances of spawning a fucking squirrel: 15%
        * chances of spawning something common : 85%
        * get an randomizer to choose what to get
        * then create the object
     */

    protected static ArrayList<String> evl1names = new ArrayList<>();
    protected static ArrayList<String> evl2names = new ArrayList<>();
    protected static ArrayList<String> evl3names = new ArrayList<>();

    private static void setAllnames(){
        setEvl1names();
        setEvl2names();
        setEvl3names();
    }

    private static void setEvl1names(){
        evl1names.add("Bulbasaur");
        evl1names.add("Charmander");
        evl1names.add("Squirtle");
        evl1names.add("Caterpie");
        evl1names.add("Pichu");
        evl1names.add("Bellsprout");
        evl1names.add("Geodude");
        evl1names.add("Magnemite");
        evl1names.add("Gastly");
        evl1names.add("Horsea");
        evl1names.add("Treecko");
        evl1names.add("Torchic");
        evl1names.add("Mudkip");
        evl1names.add("Ralts");
        evl1names.add("Piplup");
        evl1names.add("Starly");
        evl1names.add("Shinx");
        evl1names.add("Fennekin");
        evl1names.add("Froakie");
        evl1names.add("Fletchling");
    }

    private static void setEvl2names(){
        evl2names.add("Ivysaur");
        evl2names.add("Charmeleon");
        evl2names.add("Wartortle");
        evl2names.add("Metapod");
        evl2names.add("Pikachu");
        evl2names.add("Weepinbell");
        evl2names.add("Graveler");
        evl2names.add("Magneton");
        evl2names.add("Haunter");
        evl2names.add("Seadra");
        evl2names.add("Grovyle");
        evl2names.add("Combusken");
        evl2names.add("Marshtomp");
        evl2names.add("Kirlia");
        evl2names.add("Prinplup");
        evl2names.add("Staravia");
        evl2names.add("Luxio");
        evl2names.add("Braixen");
        evl2names.add("Frogadier");
        evl2names.add("Fletchinder");
    }

    private static void setEvl3names(){
        evl3names.add("Venusaur");
        evl3names.add("Charizard");
        evl3names.add("Blastoise");
        evl3names.add("Butterfree");
        evl3names.add("Raichu");
        evl3names.add("Victreebel");
        evl3names.add("Golem");
        evl3names.add("Magnezone");
        evl3names.add("Gengar");
        evl3names.add("Kingdra");
        evl3names.add("Sceptile");
        evl3names.add("Blaziken");
        evl3names.add("Swampert");
        evl3names.add("Gardevoir");
        evl3names.add("Empoleon");
        evl3names.add("Staraptor");
        evl3names.add("Luxray");
        evl3names.add("Delphox");
        evl3names.add("Greninja");
        evl3names.add("Talonflame");
    }
}
