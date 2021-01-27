package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.constants.Constants;
import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pokemon {

    final private int maxHP = 100;

    public int HP, level, speed, evolutionStage;
    public String name,nickName,gender;
    public boolean catched;

    public Pokemon(int hp, int lvl, int spd,int evolutionStage, String nm, String gndr, Boolean ctch) {
        HP = hp;
        level = lvl;
        speed = spd;
        this.evolutionStage = evolutionStage;
        name = nm;
        gender = gndr;
        catched = ctch;
        //pokemon constructor
    }

    private int move1(){
        switch (evolutionStage){
            case 1:
                return 0;//(level + 15) - (speed + 5);
            case 2:
                return 0;//(level + 25) - (speed + 9);
            case 3:
                return 0;//(level + 35) - (speed + 12);
        }
        return 0;
    }//move 1 done

    private int move2(){
        switch (evolutionStage){
            case 1:
                return 1;//(speed + 13) - (level + 1);
            case 2:
                return 1;//(speed + 20) - (level + 4);
            case 3:
                return 1;//(speed + 28) - (level + 9);
        }
        return 0;
    }//move 2 done

    private int move3(){
        switch (evolutionStage){
            case 1:
                return 5;//(level * 2) - (speed + 5);
            case 2:
                return 5;//(level * 2) - (speed + 8);
            case 3:
                return 5;//(level * 2) - (speed + 13);
        }
        return 0;
    }//move 3 done

    private int move4(){
        switch (evolutionStage){
            case 1:
                return 10;//(level - (HP - 5));
            case 2:
                return 10;//(level - (HP - 10));
            case 3:
                return 10;//(level - (HP - 15));
        }
        return 0;
    }//move 4 done

    public int wildAttack(){
        int moveChoice = PokemonUtils.randomizer(1,4);
        System.out.println("Your opponent used: " + getMoveName(moveChoice));
        if(moveChoice == 1){
            return move1();
        }else if(moveChoice == 2){
            return move2();
        }else if(moveChoice == 3){
            return move3();
        }else if(moveChoice == 4){
            return move4();
        }
        return 0;
    }

    public int getMove(Pokemon pokemon, boolean wildBattle){
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What will you use?");
        printMoves();
        if(wildBattle){
            System.out.println("or enter [5] to attemp to catch this pokemon");
        }
        try {
            choice = scanner.nextInt();

            String moveName = getMoveName(choice);

            if (choice != 5) {
                System.out.println("You used: " + moveName);
            }
            if (choice == 1){
                return move1();
            }else if(choice == 2){
                return move2();
            }else if(choice == 3){
                return move3();
            }else if(choice == 4){
                return move4();
            }else if(choice == 5 && wildBattle){
                pokemon.catchPokemon(pokemon);
                return -1;
            }else{
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                return getMove(pokemon,wildBattle);
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
        }
        return getMove(pokemon,wildBattle);
    }

    private String getMoveName(int moveIndex){//the evolution stage will determine which array list to get, the pokeIndex will determine the pokemon and the moveIndex will determine just that

        if (moveIndex == 5){
            System.out.println("You chose to catch this pokemon!");
            return "";
        }

        switch (evolutionStage){
            case 1:
                for (int i = 0; i < PokemonLists.evl1names.size(); i ++){
                    if(name.equals(PokemonLists.evl1names.get(i))){
                        return PokemonLists.evl1moves.get(i)[moveIndex-1];
                    }
                }
                break;
            case 2:
                for (int i = 0; i < PokemonLists.evl2names.size(); i ++){
                    if(name.equals(PokemonLists.evl2names.get(i))){
                        return PokemonLists.evl2moves.get(i)[moveIndex-1];
                    }
                }
                break;
            case 3:
                for (int i = 0; i < PokemonLists.evl3names.size(); i ++){
                    if(name.equals(PokemonLists.evl3names.get(i))){
                        return PokemonLists.evl3moves.get(i)[moveIndex-1];
                    }
                }
                break;
        }
        return "";
    }

    public void printStats(){
        if(!catched){
            System.out.println("Opponent's stats: \n" +
                    "[health: " + HP + "]\n" +
                    "[level: " + level + "]\n" +
                    "[gender: " + gender + "]\n" +
                    "[Evolution Stage: " + evolutionStage + "]\n" +
                    "[speed: " + speed + "]");
        }else {
            System.out.println("Your stats: \n" +
                    "[health: " + HP + "]\n" +
                    "[level: " + level + "]\n" +
                    "[gender: " + gender + "]\n" +
                    "[Evolution Stage: " + evolutionStage + "]\n" +
                    "[speed: " + speed + "]");
        }
    }

    public void printMoves(){
        int pokemonIndex = 0;

        switch (evolutionStage){
            case 1:
                for (int i = 0; i < PokemonLists.evl1names.size(); i ++){
                    if(name.equals(PokemonLists.evl1names.get(i))){
                        pokemonIndex = i;
                        for (int a = 0; a < PokemonLists.evl1moves.get(pokemonIndex).length; a++){
                            System.out.println(PokemonLists.evl1moves.get(pokemonIndex)[a]);
                        }
                        return;
                    }
                }
                break;

            case 2:
                for (int i = 0; i < PokemonLists.evl2names.size(); i ++){
                    if(name.equals(PokemonLists.evl2names.get(i))){
                        pokemonIndex = i;
                        for (int a = 0; a < PokemonLists.evl2moves.get(pokemonIndex).length; a++){
                            System.out.println(PokemonLists.evl2moves.get(pokemonIndex)[a]);
                        }
                        return;
                    }
                }
                break;

            case 3:
                for (int i = 0; i < PokemonLists.evl3names.size(); i ++){
                    if(name.equals(PokemonLists.evl3names.get(i))){
                        pokemonIndex = i;
                        for (int a = 0; a < PokemonLists.evl3moves.get(pokemonIndex).length; a++){
                            System.out.println(PokemonLists.evl3moves.get(pokemonIndex)[a]);
                        }
                        return;
                    }
                }
                break;
        }
    }

    // methods from PokemonMethods^
    // methods from PokemonUtils v

    public void checkForMaxlevel(){
        if(level > 100) level = 100;
        //this will check to see if the level is over 100. If so it will set it back to 100
    }

    public void useHealthPotion(int healthPotions) {
        if(healthPotions < 1){
            System.out.println("***not enough potions!***");
        }else{
            HP = 100;
            healthPotions--;
            System.out.println("Health Has Been Restored");
        }
        /*this method will reset the health to 100 and subtract the user's health potions by 1. It will also check to see if the user has more than 0 potions.
        If they have 0 then the method will send an error message
         */
    }

    public void catchPokemon(Pokemon pokemon){
        Scanner scanner = new Scanner(System.in);
        //scanner object
        System.out.println("To Try To Catch This Pokemon You Must Use A Ball!");
        UserMethods.printInventory();
        System.out.println("What Will You Use?");
        System.out.println("***OR TYPE 0 TO EXIT***");
        //dialogue and printing

        int chance = PokemonUtils.randomizer(0,100);

        try {
            int choice = scanner.nextInt();
            if (choice == 0) {
                return;
            }else if(choice < 1 || choice > 5){
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                catchPokemon(pokemon);
            } else {
                //hold the user's choice
                switch (evolutionStage) {
                    case 1:
                        if (catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank1rates.pbRate,Constants.BallRates.pokemonRank1rates.gbRate,Constants.BallRates.pokemonRank1rates.ubRate,Constants.BallRates.pokemonRank1rates.qbRate) == 0){
                            return;
                        }else if(catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank1rates.pbRate,Constants.BallRates.pokemonRank1rates.gbRate,Constants.BallRates.pokemonRank1rates.ubRate,Constants.BallRates.pokemonRank1rates.qbRate) == -1){
                            return;
                        }
                        break;
                    case 2:
                        if (catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank2rates.pbRate,Constants.BallRates.pokemonRank2rates.gbRate,Constants.BallRates.pokemonRank2rates.ubRate,Constants.BallRates.pokemonRank2rates.qbRate) == 0){
                            return;
                        }else if(catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank1rates.pbRate,Constants.BallRates.pokemonRank1rates.gbRate,Constants.BallRates.pokemonRank1rates.ubRate,Constants.BallRates.pokemonRank1rates.qbRate) == -1){
                            return;
                        }
                        break;
                    case 3:
                        if (catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank3rates.pbRate,Constants.BallRates.pokemonRank3rates.gbRate,Constants.BallRates.pokemonRank3rates.ubRate,Constants.BallRates.pokemonRank3rates.qbRate) == 0){
                            return;
                        }else if(catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank1rates.pbRate,Constants.BallRates.pokemonRank1rates.gbRate,Constants.BallRates.pokemonRank1rates.ubRate,Constants.BallRates.pokemonRank1rates.qbRate) == -1){
                            return;
                        }
                        break;
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            catchPokemon(pokemon);
        }
    }

    private int catchCalcs(Pokemon pokemon,int choice,int chance,int pbRate, int gbRate, int ubRate, int qbRate){
         if (choice == 1){
            if(User.pokeball > 0){
                if(chance <= pbRate){
                    PokemonUtils.addPokemon(pokemon);
                    pokemon.catched = true;
                    User.pokeball--;
                    System.out.println("You caught: " + pokemon.name + "!");
                    return 0;
                }
            }else{
                return -1;
            }
        }else if (choice == 2){
            if(User.pokeball > 0){
                if(chance <= gbRate){
                    PokemonUtils.addPokemon(pokemon);
                    pokemon.catched = true;
                    User.greatBall--;
                    System.out.println("You caught: " + pokemon.name + "!");
                    return 0;
                }
            }else{
                return -1;
            }
        }else if (choice == 3){
            if(User.pokeball > 0){
                if(chance <= ubRate){
                    PokemonUtils.addPokemon(pokemon);
                    pokemon.catched = true;
                    User.ultraBall--;
                    System.out.println("You caught: " + pokemon.name + "!");
                    return 0;
                }
            }else{
                return -1;
            }
        }else if (choice == 4){
            if(User.pokeball > 0){
                if(chance <= Constants.BallRates.mbRate){
                    PokemonUtils.addPokemon(pokemon);
                    pokemon.catched = true;
                    User.masterBall--;
                    System.out.println("You caught: " + pokemon.name + "!");
                    return 0;
                }
            }else{
                return -1;
            }
        }else if (choice == 5){
            if(User.pokeball > 0){
                if(chance <= qbRate){
                    PokemonUtils.addPokemon(pokemon);
                    pokemon.catched = true;
                    User.quickBall--;
                    System.out.println("You caught: " + pokemon.name + "!");
                    return 0;
                }
            }else{
                return -1;
            }
        }
        System.out.println("The Pokemon Was Not Caught");
         return 0;
    }

    public void setName(String newName){
        nickName = newName;
    }

    //will allow to change the pokemon's name
}
