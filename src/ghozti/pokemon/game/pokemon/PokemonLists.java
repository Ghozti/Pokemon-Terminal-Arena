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

    public static ArrayList<String> evl1moves = new ArrayList<>();
    public static ArrayList<String> evl2moves = new ArrayList<>();
    public static ArrayList<String> evl3moves = new ArrayList<>();

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

        evl1moves.add(" [1] Vine Whip \n [2] Poison Powder \n [3] Seed Bomb \n [4] Razor Leaf\n");
        evl1moves.add(" [1] Growl \n [2] Dragon Rage \n [3] Flamethrower \n [4] Smokescreen\n");
        evl1moves.add(" [1] Bubble \n [2] Hydro Pump \n [3] Protect \n [4] Tail Whip\n");
        evl1moves.add(" [1] Tackle \n [2] String Shot \n [3] Bug Bite \n [4] Web Launch\n");
        evl1moves.add(" [1] Thunder Shock \n [2] Charm \n [3] Sweet Kiss \n [4] Thunder Wave\n");
        evl1moves.add(" [1] Sleep Powder \n [2] Acid \n [3] Slam \n [4] Stun Spore\n");
        evl1moves.add(" [1] Magnitude \n [2] Bulldoze \n [3] Earthquake \n [4] Stone Edge\n");
        evl1moves.add(" [1] Supersonic \n [2] Screech \n [3] Discharge \n [4] Flash Cannon\n");
        evl1moves.add(" [1] Sucker Punch \n [2] Curse \n [3] Hypnosis \n [4] Dark Pulse\n");
        evl1moves.add(" [1] Focus Screen \n [2] Bubble Bean \n [3] Hydro Pump \n [4] Dragon Dance\n");
        evl1moves.add(" [1] Quick Attack \n [2] Mega Drain \n [3] Detect \n [4] Energy\n");
        evl1moves.add(" [1] Focus Energy \n [2] Slash \n [3] Mirror Move \n [4] Flamethrower\n");
        evl1moves.add(" [1] Mud-Slap \n [2] Whirlpool \n [3] Water Gun \n [4] Foresight \n");
        evl1moves.add(" [1] Double Team \n [2] Heal Pulse \n [3] Charm \n [4] Dream Eater \n");
        evl1moves.add(" [1] Peck \n [2] Whirlpool \n [3] Mist \n [4] Drill Peck \n");
        evl1moves.add(" [1] Wing Attack \n [2] Aerial Ace \n [3] Brave Bird \n [4] Agility \n");
        evl1moves.add(" [1] Spark \n [2] Bite \n [3] Scary Face \n [4] Wild Charge \n");
        evl1moves.add(" [1] Lucky Chant \n [2] Ember \n [3] Fire Blast \n [4] Psyshock \n");
        evl1moves.add(" [1] Pound \n [2] Bounce \n [3] Hydro Pump \n [4] Bubble \n");
        evl1moves.add(" [1] Peck \n [2] Natural Gift \n [3] Acrobatics \n [4] Me First \n");
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

        evl2moves.add(" [1] Vine Whip \n [2] Power Whip \n [3] Razor Leaf \n [4] Growl \n");
        evl2moves.add(" [1] Dragon Rage \n [2] Fire Spin \n [3] Ember \n [4] Growl \n");
        evl2moves.add(" [1] Iron Defense \n [2] Rain Dance \n [3] Rapid Spin \n [4] Skull Bash \n");
        evl2moves.add(" [1] Harden \n [2] Harden \n [3] Harden \n [4] Harden \n");
        evl2moves.add(" [1] Thunder Bolt \n [2] Scratch \n [3] Quick Attack \n [4] Double Team \n");
        evl2moves.add(" [1] Sleep Power \n [2] Knock Off \n [3] Sweet Scent \n [4] Stun Spore \n ");
        evl2moves.add(" [1] Take Down \n [2] Sand Attack \n [3] Self-Destruct \n [4] Explosion \n");
        evl2moves.add(" [1] Zap Cannon \n [2] Magnet Bomb \n [3] Spark \n [4] Flash Cannon \n ");
        evl2moves.add(" [1] Shadow Ball \n [2] Dream Eater \n [3] Dark Pulse \n [4] Hex \n");
        evl2moves.add(" [1] Leer \n [2] Brine \n [3] Focus Energy \n [4] Twister \n");
        evl2moves.add(" [1] Pound \n [2] Detect \n [3] False Swipe \n [4] Pursuit \n");
        evl2moves.add(" [1] Bulk Up \n [2] Sky Uppercut \n [3] Sand Attack \n [4] Double Kick \n ");
        evl2moves.add(" [1] Protect \n [2] Mud Shot \n [3] Foresight \n [4] Bide \n");
        evl2moves.add(" [1] Growl \n [2] Hypnosis \n [3] Draining Kiss \n [4] Teleport \n");
        evl2moves.add(" [1] Metal Claw \n [2] Whirlpool \n [3] Fury Attack \n [4] Water Sport \n");
        evl2moves.add(" [1] Brave Bird \n [2] Final Gambit \n [3] Endeavor \n [4] Take Down \n");
        evl2moves.add(" [1] Crunch \n [2] Bite \n [3] Thunder Fang \n [4] Discharge \n");
        evl2moves.add(" [1] Will-O-Wisp \n [2] Magic Room \n [3] Sunny Day \n [4] Tail Whip \n");
        evl2moves.add(" [1] Bubble \n [2] Smokescreen \n [3] Lick \n [4] Pound \n ");
        evl2moves.add(" [1] Tailwind \n [2] Razor Wind \n [3] Flail \n [4] Flame Charge \n");
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

        evl3moves.add(" [1] Petal Blizzard\n [2] Razor Leaf \n [3] Take Down \n [4] Solar Beam \n");
        evl3moves.add(" [1] Fire Fang\n [2] Flamethrower \n [3] Inferno \n [4] Dragon Claw \n");
        evl3moves.add(" [1] Hydro Pump\n [2] Water Gun \n [3] Flash Cannon \n [4] Shell Smash \n");
        evl3moves.add(" [1] Bug Bite\n [2] String Shot \n [3] Air Slash \n [4] Tackle \n");
        evl3moves.add(" [1] Electro Ball\n [2] Quick Attack \n [3] Thunder \n [4] Thunderbolt \n");
        evl3moves.add(" [1] Vine Whip\n [2] Sucker Punch \n [3] Acid \n [4] Power Whip \n");
        evl3moves.add(" [1] Defense Curl \n [2] Explosion \n [3] Stone Edge \n [4] Smack Down \n");
        evl3moves.add(" [1] Gyro Ball \n [2] Magnetic Flux \n [3] Magnet Bomb \n [4] Metal Sound \n");
        evl3moves.add(" [1] Shadow Punch \n [2] Destiny Bond \n [3] Dream Eater \n [4] Confused Ray \n");
        evl3moves.add(" [1] Dragon Vortex \n [2] Tri Bullet \n [3] Hydro Pump \n [4] Brine \n");
        evl3moves.add(" [1] Night Slash \n [2] X-Scissor \n [3] Leaf Storm \n [4] Detect \n");
        evl3moves.add(" [1] Jump Kick \n [2] Brave Bird \n [3] Flare Blitz \n [4] Scratch \n");
        evl3moves.add(" [1] Water Gun \n [2] Protect \n [3] Hammer Arm \n [4] Muddy Water \n");
        evl3moves.add(" [1] Moonblast\n [2] Psychic \n [3] Dream Eater \n [4] Draining Kiss \n");
        evl3moves.add(" [1] Peck\n [2] Aqua Jet \n [3] Fury Attack \n [4] Metal Claw \n");
        evl3moves.add(" [1] Wing Attack\n [2] Take Down \n [3] Endeavor \n [4] Close Combat \n");
        evl3moves.add(" [1] Thunder Wave\n [2] Wild Charge \n [3] Electric Terrain \n [4] Night Slash \n");
        evl3moves.add(" [1] Fire Blast\n [2] Flamethrower \n [3] Fire Spin \n [4] Ember \n");
        evl3moves.add(" [1] Quick Attack\n [2] Spikes \n [3] Hydro Pump \n [4] Night Slash \n");
        evl3moves.add(" [1] Flare Blitz\n [2] Steel Wing \n [3] Ember \n [4] Flame Charge \n");
        //sets the move names
    }
}
