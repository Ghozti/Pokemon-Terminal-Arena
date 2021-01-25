package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pokemon {

    final private int maxHP = 100;

    public int HP, level, speed, evolutionStage;
    public String name,gender;
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

    public int getMove(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What will you use?");
        printMoves();
        try {
            choice = scanner.nextInt();

            String moveName = getMoveName(choice);

            System.out.println("You used: " + moveName);
            switch (choice){
                case 1:
                    return move1();
                case 2:
                    return move2();
                case 3:
                    return move3();
                case 4:
                    return move4();
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
        }
        return getMove();
    }

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

    private String getMoveName(int moveIndex){//the evolution stage will determine which array list to get, the pokeIndex will determine the pokemon and the moveIndex will fetermine just that

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

    public void catchPokemon(){
        Scanner scanner = new Scanner(System.in);
        //scanner object
        System.out.println("To Try To Catch This Pokemon You Must Use A Ball!");
        UserMethods.printInventory();
        System.out.println("What Will You Use?");
        System.out.println("***OR TYPE 0 TO EXIT***");
        //dialogue and printing

        int chance = PokemonUtils.randomizer(0,100);

        try {
            int[] pokeballs = {0, User.pokeball, User.greatBall, User.ultraBall, User.masterBall, User.quickBall};
            int choice = scanner.nextInt();
            //hold the user's choice
            if (choice == 0) {
                return;
            }
            try {
                if (pokeballs[choice] > 0) {
                    pokeballs[choice]--;
                    System.out.println("***USED AN ITEM***");
                } else {
                    System.out.println("***YOU DO NOT HAVE ENOUGH OF THIS ITEM***");
                    catchPokemon();
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                catchPokemon();
            }
        }catch (InputMismatchException e) {
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            catchPokemon();
        }
    }

    /*
    this method works like the delete pokemon one.
    The method also has a cancel option. If the user enters 0 the method will end and go back to whatever comes next.
    The method also checks for invalid inputs like strings or a number out of range from the array list.
    It also checks to see if the selected option is greater than 0. If so the method will execute otherwise it will alert the user that
    They do not have enough of the item. Then it will recall itself.
     */

    public void setName(String newName){
        name = newName;
    }

    //will allow to change the pokemon's name
}
