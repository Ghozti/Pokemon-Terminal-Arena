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
        * get a randomizer to choose what to get
        * then create the object
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

        String[] bulbasaur = {" [1] Vine Whip"," [2] Poison Powder"," [3] Seed Bomb"," [4] Razor Leaf"};
        String[] charmander = {" [1] Vine Whip"," [2] Poison Powder"," [3] Seed Bomb"," [4] Razor Leaf"};
        String[] squirtle = {" [1] Bubble"," [2] Hydro Pump" ," [3] Protect"," [4] Tail Whip"};
        String[] caterpie = {" [1] Tackle"," [2] String Shot"," [3] Bug Bite"," [4] Web Launch"};
        String[] pichu = {" [1] Thunder Shock"," [2] Charm"," [3] Sweet Kiss"," [4] Thunder Wave"};
        String[] bellSprout = {" [1] Sleep Powder"," [2] Acid"," [3] Slam "," [4] Stun Spore"};
        String[] geodude = {" [1] Magnitude"," [2] Bulldoze"," [3] Earthquake"," [4] Stone Edge"};
        String[] magnemite = {" [1] Supersonic", " [2] Screech", " [3] Discharge", " [4] Flash Cannon"};
        String[] gastly = {" [1] Sucker Punch"," [2] Curse"," [3] Hypnosis"," [4] Dark Pulse"};
        String[] horsea = {" [1] Focus Screen"," [2] Bubble Bean"," [3] Hydro Pump"," [4] Dragon Dance"};
        String[] treecko = {" [1] Quick Attack"," [2] Mega Drain"," [3] Detect"," [4] Energy"};
        String[] torchic = {" [1] Focus Energy","[2] Slash"," [3] Mirror Move"," [4] Flamethrower"};
        String[] mudkip = {" [1] Mud-Slap,"," [2] Whirlpool"," [3] Water Gun"," [4] Foresight"};
        String[] ralts = {" [1] Double Team"," [2] Heal Pulse"," [3] Charm"," [4] Dream Eater"};
        String[] pilpup = {" [1] Peck"," [2] Whirlpool"," [3] Mist"," [4] Drill Peck"};
        String[] starly = {" [1] Wing Attack"," [2] Aerial Ace"," [3] Brave Bird"," [4] Agility"};
        String[] shinx = {" [1] Spark"," [2] Bite"," [3] Scary Face"," [4] Wild Charge"};
        String[] fennekin = {" [1] Lucky Chant"," [2] Ember"," [3] Fire Blast"," [4] Psyshock"};
        String[] froakie = {" [1] Pound"," [2] Bounce"," [3] Hydro Pump"," [4] Bubble"};
        String[] fletchling = {" [1] Peck"," [2] Natural Gift"," [3] Acrobatics"," [4] Me First"};
        //creates the arrays for the pokemon moves

        evl1moves.add(bulbasaur);
        evl1moves.add(charmander);
        evl1moves.add(squirtle);
        evl1moves.add(caterpie);
        evl1moves.add(pichu);
        evl1moves.add(bellSprout);
        evl1moves.add(geodude);
        evl1moves.add(magnemite);
        evl1moves.add(gastly);
        evl1moves.add(horsea);
        evl1moves.add(treecko);
        evl1moves.add(torchic);
        evl1moves.add(mudkip);
        evl1moves.add(ralts);
        evl1moves.add(pilpup);
        evl1moves.add(starly);
        evl1moves.add(shinx);
        evl1moves.add(fennekin);
        evl1moves.add(froakie);
        evl1moves.add(fletchling);
        //adds the arrays to the array lists
        //TODO change this to be like the ones below. for now it works but this cannot stay in the final release
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

        evl2moves.add(new String[] {" [1] Vine Whip \n [2] Power Whip \n [3] Razor Leaf \n [4] Growl \n"});
        evl2moves.add(new String[] {" [1] Dragon Rage \n [2] Fire Spin \n [3] Ember \n [4] Growl \n"});
        evl2moves.add(new String[] {" [1] Iron Defense \n [2] Rain Dance \n [3] Rapid Spin \n [4] Skull Bash \n"});
        evl2moves.add(new String[] {" [1] Harden \n [2] Harden \n [3] Harden \n [4] Harden \n"});
        evl2moves.add(new String[] {" [1] Thunder Bolt \n [2] Scratch \n [3] Quick Attack \n [4] Double Team \n"});
        evl2moves.add(new String[] {" [1] Sleep Power \n [2] Knock Off \n [3] Sweet Scent \n [4] Stun Spore \n "});
        evl2moves.add(new String[] {" [1] Take Down \n [2] Sand Attack \n [3] Self-Destruct \n [4] Explosion \n"});
        evl2moves.add(new String[] {" [1] Zap Cannon \n [2] Magnet Bomb \n [3] Spark \n [4] Flash Cannon \n "});
        evl2moves.add(new String[] {" [1] Shadow Ball \n [2] Dream Eater \n [3] Dark Pulse \n [4] Hex \n"});
        evl2moves.add(new String[] {" [1] Leer \n [2] Brine \n [3] Focus Energy \n [4] Twister \n"});
        evl2moves.add(new String[] {" [1] Pound \n [2] Detect \n [3] False Swipe \n [4] Pursuit \n"});
        evl2moves.add(new String[] {" [1] Bulk Up \n [2] Sky Uppercut \n [3] Sand Attack \n [4] Double Kick \n"});
        evl2moves.add(new String[] {" [1] Protect \n [2] Mud Shot \n [3] Foresight \n [4] Bide \n"});
        evl2moves.add(new String[] {" [1] Growl \n [2] Hypnosis \n [3] Draining Kiss \n [4] Teleport \n"});
        evl2moves.add(new String[] {" [1] Metal Claw \n [2] Whirlpool \n [3] Fury Attack \n [4] Water Sport \n"});
        evl2moves.add(new String[] {" [1] Brave Bird \n [2] Final Gambit \n [3] Endeavor \n [4] Take Down \n"});
        evl2moves.add(new String[] {" [1] Crunch \n [2] Bite \n [3] Thunder Fang \n [4] Discharge \n"});
        evl2moves.add(new String[] {" [1] Will-O-Wisp \n [2] Magic Room \n [3] Sunny Day \n [4] Tail Whip \n"});
        evl2moves.add(new String[] {" [1] Bubble \n [2] Smokescreen \n [3] Lick \n [4] Pound \n "});
        evl2moves.add(new String[] {" [1] Tailwind \n [2] Razor Wind \n [3] Flail \n [4] Flame Charge \n"});
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

        evl3moves.add(new String[] {" [1] Petal Blizzard\n [2] Razor Leaf \n [3] Take Down \n [4] Solar Beam \n"});
        evl3moves.add(new String[] {" [1] Fire Fang\n [2] Flamethrower \n [3] Inferno \n [4] Dragon Claw \n"});
        evl3moves.add(new String[] {" [1] Hydro Pump\n [2] Water Gun \n [3] Flash Cannon \n [4] Shell Smash \n"});
        evl3moves.add(new String[] {" [1] Bug Bite\n [2] String Shot \n [3] Air Slash \n [4] Tackle \n"});
        evl3moves.add(new String[] {" [1] Electro Ball\n [2] Quick Attack \n [3] Thunder \n [4] Thunderbolt \n"});
        evl3moves.add(new String[] {" [1] Vine Whip\n [2] Sucker Punch \n [3] Acid \n [4] Power Whip \n"});
        evl3moves.add(new String[] {" [1] Defense Curl \n [2] Explosion \n [3] Stone Edge \n [4] Smack Down \n"});
        evl3moves.add(new String[] {" [1] Gyro Ball \n [2] Magnetic Flux \n [3] Magnet Bomb \n [4] Metal Sound \n"});
        evl3moves.add(new String[] {" [1] Shadow Punch \n [2] Destiny Bond \n [3] Dream Eater \n [4] Confused Ray \n"});
        evl3moves.add(new String[] {" [1] Dragon Vortex \n [2] Tri Bullet \n [3] Hydro Pump \n [4] Brine \n"});
        evl3moves.add(new String[] {" [1] Night Slash \n [2] X-Scissor \n [3] Leaf Storm \n [4] Detect \n"});
        evl3moves.add(new String[] {" [1] Jump Kick \n [2] Brave Bird \n [3] Flare Blitz \n [4] Scratch \n"});
        evl3moves.add(new String[] {" [1] Water Gun \n [2] Protect \n [3] Hammer Arm \n [4] Muddy Water \n"});
        evl3moves.add(new String[] {" [1] Moonblast\n [2] Psychic \n [3] Dream Eater \n [4] Draining Kiss \n"});
        evl3moves.add(new String[] {" [1] Peck\n [2] Aqua Jet \n [3] Fury Attack \n [4] Metal Claw \n"});
        evl3moves.add(new String[] {" [1] Wing Attack\n [2] Take Down \n [3] Endeavor \n [4] Close Combat \n"});
        evl3moves.add(new String[] {" [1] Thunder Wave\n [2] Wild Charge \n [3] Electric Terrain \n [4] Night Slash \n"});
        evl3moves.add(new String[] {" [1] Fire Blast\n [2] Flamethrower \n [3] Fire Spin \n [4] Ember \n"});
        evl3moves.add(new String[] {" [1] Quick Attack\n [2] Spikes \n [3] Hydro Pump \n [4] Night Slash \n"});
        evl3moves.add(new String[] {" [1] Flare Blitz\n [2] Steel Wing \n [3] Ember \n [4] Flame Charge \n"});
        //sets the move names
    }
}
