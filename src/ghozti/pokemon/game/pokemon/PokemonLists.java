package ghozti.pokemon.game.pokemon;

import java.util.ArrayList;

public class PokemonLists {

    /*
        *MY THEORY
        * have an array list of names, types, and every other argument the pokemon class needs for the object.
        * then have a randomizer determine what to put based on the user's stats
     */

    public static ArrayList<String> evl1names = new ArrayList<>();
    public static ArrayList<String> evl2names = new ArrayList<>();
    public static ArrayList<String> evl3names = new ArrayList<>();

    public static ArrayList<String[]> evl1moves = new ArrayList<>();
    public static ArrayList<String[]> evl2moves = new ArrayList<>();
    public static ArrayList<String[]> evl3moves = new ArrayList<>();

    public static ArrayList<ArrayList<String>> test =  new ArrayList<>();
    public static void setAllnames(){
        setEvl1namesAndMoves();
        setEvl2namesAndMoves();
        setEvl3namesAndMoves();
        //will call the set name methods and give data to the array lists
    }

    private static void setEvl1namesAndMoves(){
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
        //sets the names for the evolution 1 array list

        evl1moves.add(new String[] {" [1] Vine Whip"," [2] Poison Powder"," [3] Seed Bomb"," [4] Razor Leaf"});
        evl1moves.add(new String[] {" [1] Vine Whip"," [2] Poison Powder"," [3] Seed Bomb"," [4] Razor Leaf"});
        evl1moves.add(new String[] {" [1] Bubble"," [2] Hydro Pump" ," [3] Protect"," [4] Tail Whip"});
        evl1moves.add(new String[] {" [1] Tackle"," [2] String Shot"," [3] Bug Bite"," [4] Web Launch"});
        evl1moves.add(new String[] {" [1] Thunder Shock"," [2] Charm"," [3] Sweet Kiss"," [4] Thunder Wave"});
        evl1moves.add(new String[] {" [1] Sleep Powder"," [2] Acid"," [3] Slam "," [4] Stun Spore"});
        evl1moves.add(new String[] {" [1] Magnitude"," [2] Bulldoze"," [3] Earthquake"," [4] Stone Edge"});
        evl1moves.add(new String[] {" [1] Supersonic", " [2] Screech", " [3] Discharge", " [4] Flash Cannon"});
        evl1moves.add(new String[] {" [1] Sucker Punch"," [2] Curse"," [3] Hypnosis"," [4] Dark Pulse"});
        evl1moves.add(new String[] {" [1] Focus Screen"," [2] Bubble Bean"," [3] Hydro Pump"," [4] Dragon Dance"});
        evl1moves.add(new String[] {" [1] Quick Attack"," [2] Mega Drain"," [3] Detect"," [4] Energy"});
        evl1moves.add(new String[] {" [1] Focus Energy","[2] Slash"," [3] Mirror Move"," [4] Flamethrower"});
        evl1moves.add(new String[] {" [1] Mud-Slap,"," [2] Whirlpool"," [3] Water Gun"," [4] Foresight"});
        evl1moves.add(new String[] {" [1] Double Team"," [2] Heal Pulse"," [3] Charm"," [4] Dream Eater"});
        evl1moves.add(new String[] {" [1] Peck"," [2] Whirlpool"," [3] Mist"," [4] Drill Peck"});
        evl1moves.add(new String[] {" [1] Wing Attack"," [2] Aerial Ace"," [3] Brave Bird"," [4] Agility"});
        evl1moves.add(new String[] {" [1] Spark"," [2] Bite"," [3] Scary Face"," [4] Wild Charge"});
        evl1moves.add(new String[] {" [1] Lucky Chant"," [2] Ember"," [3] Fire Blast"," [4] Psyshock"});
        evl1moves.add(new String[] {" [1] Pound"," [2] Bounce"," [3] Hydro Pump"," [4] Bubble"});
        evl1moves.add(new String[] {" [1] Peck"," [2] Natural Gift"," [3] Acrobatics"," [4] Me First"});
        //adds the arrays to the array lists
        //sets the move names
    }

    private static void setEvl2namesAndMoves(){
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
        //sets the names for the evolution 2 array list

        evl2moves.add(new String[] {" [1] Vine Whip"," [2] Power Whip"," [3] Razor Leaf"," [4] Growl"});
        evl2moves.add(new String[] {" [1] Dragon Rage"," [2] Fire Spin"," [3] Ember"," [4] Growl"});
        evl2moves.add(new String[] {" [1] Iron Defense"," [2] Rain Dance"," [3] Rapid Spin"," [4] Skull Bash"});
        evl2moves.add(new String[] {" [1] Harden"," [2] Harden"," [3] Harden"," [4] Harden"});
        evl2moves.add(new String[] {" [1] Thunder Bolt"," [2] Scratch"," [3] Quick Attack"," [4] Double Team"});
        evl2moves.add(new String[] {" [1] Sleep Power"," [2] Knock Off"," [3] Sweet Scent"," [4] Stun Spore"});
        evl2moves.add(new String[] {" [1] Take Down"," [2] Sand Attack"," [3] Self-Destruct"," [4] Explosion"});
        evl2moves.add(new String[] {" [1] Zap Cannon"," [2] Magnet Bomb"," [3] Spark"," [4] Flash Cannon"});
        evl2moves.add(new String[] {" [1] Shadow Ball"," [2] Dream Eater"," [3] Dark Pulse"," [4] Hex"});
        evl2moves.add(new String[] {" [1] Leer"," [2] Brine"," [3] Focus Energy"," [4] Twister"});
        evl2moves.add(new String[] {" [1] Pound"," [2] Detect"," [3] False Swipe"," [4] Pursuit"});
        evl2moves.add(new String[] {" [1] Bulk Up"," [2] Sky Uppercut"," [3] Sand Attack"," [4] Double Kick"});
        evl2moves.add(new String[] {" [1] Protect"," [2] Mud Shot"," [3] Foresight"," [4] Bide"});
        evl2moves.add(new String[] {" [1] Growl"," [2] Hypnosis"," [3] Draining Kiss"," [4] Teleport"});
        evl2moves.add(new String[] {" [1] Metal Claw"," [2] Whirlpool"," [3] Fury Attack"," [4] Water Sport"});
        evl2moves.add(new String[] {" [1] Brave Bird"," [2] Final Gambit"," [3] Endeavor"," [4] Take Down"});
        evl2moves.add(new String[] {" [1] Crunch"," [2] Bite"," [3] Thunder Fang"," [4] Discharge"});
        evl2moves.add(new String[] {" [1] Will-O-Wisp"," [2] Magic Room"," [3] Sunny Day"," [4] Tail Whip"});
        evl2moves.add(new String[] {" [1] Bubble"," [2] Smokescreen"," [3] Lick"," [4] Pound "});
        evl2moves.add(new String[] {" [1] Tailwind"," [2] Razor Wind"," [3] Flail"," [4] Flame Charge"});
        //faster way to do the array stuff
        //sets the move names
    }

    private static void setEvl3namesAndMoves(){
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
        //sets the names for the evolution 2 array list

        evl3moves.add(new String[] {" [1] Petal Blizzard"," [2] Razor Leaf"," [3] Take Down"," [4] Solar Beam"});
        evl3moves.add(new String[] {" [1] Fire Fang"," [2] Flamethrower"," [3] Inferno"," [4] Dragon Claw"});
        evl3moves.add(new String[] {" [1] Hydro Pump"," [2] Water Gun"," [3] Flash Cannon"," [4] Shell Smash"});
        evl3moves.add(new String[] {" [1] Bug Bite"," [2] String Shot"," [3] Air Slash"," [4] Tackle"});
        evl3moves.add(new String[] {" [1] Electro Ball"," [2] Quick Attack"," [3] Thunder"," [4] Thunderbolt"});
        evl3moves.add(new String[] {" [1] Vine Whip"," [2] Sucker Punch"," [3] Acid"," [4] Power Whip"});
        evl3moves.add(new String[] {" [1] Defense Curl"," [2] Explosion"," [3] Stone Edge"," [4] Smack Down"});
        evl3moves.add(new String[] {" [1] Gyro Ball"," [2] Magnetic Flux"," [3] Magnet Bomb"," [4] Metal Sound"});
        evl3moves.add(new String[] {" [1] Shadow Punch"," [2] Destiny Bond"," [3] Dream Eater"," [4] Confused Ray"});
        evl3moves.add(new String[] {" [1] Dragon Vortex"," [2] Tri Bullet"," [3] Hydro Pump"," [4] Brine"});
        evl3moves.add(new String[] {" [1] Night Slash"," [2] X-Scissor"," [3] Leaf Storm"," [4] Detect"});
        evl3moves.add(new String[] {" [1] Jump Kick"," [2] Brave Bird"," [3] Flare Blitz"," [4] Scratch"});
        evl3moves.add(new String[] {" [1] Water Gun"," [2] Protect"," [3] Hammer Arm"," [4] Muddy Water"});
        evl3moves.add(new String[] {" [1] Moonblast"," [2] Psychic"," [3] Dream Eater"," [4] Draining Kiss"});
        evl3moves.add(new String[] {" [1] Peck"," [2] Aqua Jet "," [3] Fury Attack"," [4] Metal Claw"});
        evl3moves.add(new String[] {" [1] Wing Attack"," [2] Take Down"," [3] Endeavor"," [4] Close Combat"});
        evl3moves.add(new String[] {" [1] Thunder Wave"," [2] Wild Charge"," [3] Electric Terrain"," [4] Night Slash"});
        evl3moves.add(new String[] {" [1] Fire Blast"," [2] Flamethrower"," [3] Fire Spin"," [4] Ember"});
        evl3moves.add(new String[] {" [1] Quick Attack"," [2] Spikes"," [3] Hydro Pump"," [4] Night Slash"});
        evl3moves.add(new String[] {" [1] Flare Blitz"," [2] Steel Wing "," [3] Ember "," [4] Flame Charge"});
        //sets the move names
    }
}
