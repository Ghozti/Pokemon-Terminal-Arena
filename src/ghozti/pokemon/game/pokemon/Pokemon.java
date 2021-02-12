package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.constants.Constants;
import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Pokemon {

    final private int maxHP = 100;

    public int HP, level, speed, evolutionStage, XP;
    public String name,nickName,gender;
    public boolean catched;

    private int extraDamage = speed < 10 ? 5 : speed < 25 && speed > 10 ? 8 : speed > 10 || speed < 40 ? 10 : 15;
    private int levelDamage = level < 15 ? 8 : level < 30 && level > 15 ? 13 : level > 15 || level < 45 ? 18 : 23;
    //the pokemon's speed and level stats will help it in some cases. Specially in battles since the speed can help it deal some extra damage

    public Pokemon(int hp, int lvl, int spd,int evolutionStage, String nm, String gndr, Boolean ctch) {
        HP = hp;
        level = lvl;
        speed = spd;
        this.evolutionStage = evolutionStage;
        name = nm;
        gender = gndr;
        catched = ctch;
        XP = 0;
        //pokemon constructor
    }

    private int move1(){
        switch (evolutionStage){
            case 1:
                return 5 + (extraDamage - 3) + (levelDamage - 3);
            case 2:
                return 10 + (extraDamage - 2) + (levelDamage - 2);
            case 3:
                return 15 + (extraDamage) + (levelDamage);
        }
        return 0;
    }//move 1 done

    private int move2(){
        switch (evolutionStage){
            case 1:
                return 5 + (extraDamage - 5) + (levelDamage - 5);
            case 2:
                return 5 + (extraDamage - 3) + (levelDamage - 3);
            case 3:
                return 5 + (extraDamage) + (levelDamage);
        }
        return 0;
    }//move 2 done

    private int move3(){
        switch (evolutionStage){
            case 1:
                return 3 + (extraDamage - 3) + (levelDamage - 4);
            case 2:
                return 6 + (extraDamage - 1) + (levelDamage - 2);
            case 3:
                return 12 + (extraDamage) + (levelDamage);
        }
        return 0;
    }//move 3 done

    private int move4(){
        switch (evolutionStage){
            case 1:
                return 6 + (extraDamage - 6) + (levelDamage - 4);
            case 2:
                return 8 + (extraDamage - 3) + (levelDamage - 2);
            case 3:
                return 10 + (extraDamage) + (levelDamage);
        }
        return 0;
    }//move 4 done

    public int wildAttack(){
        Random random = new Random();
        int moveChoice = random.nextInt(4-1)  + 2;
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
    /*this method will take a random number between 1 and 4. Each representing a move. Once the number is generated, a move will be called based on the number. So for ex:
    if the number rolls 1, move 1 is called.
     */

    public int getMove(Pokemon pokemon, boolean wildBattle){//the pokemon object will be used for the catch pokemon method. This pokemon object will be the wild pokemon's object
        int choice;
        //will represent the user's choice
        Scanner scanner = new Scanner(System.in);
        //scanner object
        System.out.println("What will you use?");
        printMoves();
        //will print the pokemon's moves.
        if(wildBattle){
            System.out.println("or enter [5] to attemp to catch this pokemon");
        }//the method takes in a bool called 'wildBattle' this bool will be used if the method is being called in a wild battle. If so, the user will be able to have a shot at catching the pokemon.
        try {
            choice = scanner.nextInt();

            if (choice < 1 || choice > 5){
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                return getMove(pokemon,wildBattle);
            }//this condition will check to see if the user entered a number greater than 5 or less than 0 (which would be an invalid input)

            String moveName = getMoveName(choice);//the choice int will also be passed on to getMoveName to get the actual move's name based on the pokemon.

            if (choice != 5) {
                System.out.println("You used: " + moveName);
            }//if the user did not enter 5 the console will confirm their choice.

            //the move will vary depending on the user's choice.
            if (choice == 1){
                return move1();
            }else if(choice == 2){
                return move2();
            }else if(choice == 3){
                return move3();
            }else if(choice == 4){
                return move4();
            }else if(choice == 5 && wildBattle){
                pokemon.catchPokemon(pokemon);//will call the catch pokemon method.
                return 0;
            }else{
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                return getMove(pokemon,wildBattle);
            }//if the user entered another number or tried to catch the pokemon despite "wildBattle" not being true.
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
        }
        return getMove(pokemon,wildBattle);
    }

    private String getMoveName(int moveIndex){

        if (moveIndex == 5){
            System.out.println("You chose to catch this pokemon!");
            return "";
        }//the first thing checked will be if the user entered 5 (the catch pokemon option).

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
        /*****************************************************************************************************************************************************************************************
            *because the move names are set in order to the pokemon's index and the way the printMoves() method lists the moves, the user's choice can also be used to get the pokemon's move name.
            * in each case:
            * the pokemon's evolution stage is checked
            * the array list in PokemonLists corresponding to the pokemon's evolution stage is looped through
            * the pokemon's name is used to compare each other name in the list
            * the if statement checks to see if the name corresponds to the pokemon name lists.
            * If the name corresponds then the index is used to get the move name lists' element since the index will correspond to the same pokemon in the 2 lists.
            * the moveIndex parameter is subtracted by 1 since the user will always choose a number greater than the element's index by 1.
         ******************************************************************************************************************************************************************************************/
        return "";
    }

    public void printStats(){
        if(!catched){
            System.out.println("Opponent's stats:");
        }else {
            System.out.println("Your pokemon stats:");
        }
        System.out.println("[health: " + HP + "]\n" +
                "[level: " + level + "]\n" +
                "[gender: " + gender + "]\n" +
                "[Evolution Stage: " + evolutionStage + "]\n" +
                "[speed: " + speed + "]\n" +
                "[XP: " + XP + "]\n");
        /*
         *the method will check if the pokemon has been caught
         * if so then the method will say "your stats"
         * if not then it will say "opponent's stats"
         * but in the end it just prints out the field variables.
         */
    }

    public void printMoves(){
        int pokemonIndex;
        //this will represent the index of the pokemon.

        switch (evolutionStage){//will check the evolution stage for the program to then know what array lists to look at.
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
        /*****************************************************************************************************************
         *all of the loops and cases above:
         * the pokemon's evo stage will be used to determine which array lists to loop through. ex: if the evo stage is 1, the array lists will be evl1moves and evl1names
         * then the first for loop will loop through the names
         * the if statement will see if the pokemon's name is equal to one of the names in the list
         * if so then the pokemonIndex variable will be set to the index of the name
         * Then the second for loop will loop through the list containing the move name arrays.
         * NOTE the second loop DOES NOT loop through the evl moves it only loops through the array within the array list
         * then it prints out the moves.
         ****************************************************************************************************************/
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
        //prints the inventory
        System.out.println("What Will You Use?");
        System.out.println("***OR TYPE 0 TO EXIT***");
        //dialogue and printing

        int chance = PokemonUtils.randomizer(0,100);//generates a random number from 0 to 100. this will be used to determine if the pokeball was effective.

        try {
            int choice = scanner.nextInt();//will hold the user's choice for the pokeball.
            if (choice == 0) {//if the user chooses 0 (the exit option) the method stops running.
                return;
            }else if(choice < 1 || choice > 5){//if the user chooses something other than 1,2,3,4,5,0
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                catchPokemon(pokemon);
            } else {
                //hold the user's choice
                switch (evolutionStage) {//will take the pokemon's evo stage to know what constants to use. (these constants are found in Constants.java)
                    case 1:
                        catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank1rates.pbRate,Constants.BallRates.pokemonRank1rates.gbRate,Constants.BallRates.pokemonRank1rates.ubRate,Constants.BallRates.pokemonRank1rates.qbRate);
                        break;
                    case 2:
                        catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank2rates.pbRate,Constants.BallRates.pokemonRank2rates.gbRate,Constants.BallRates.pokemonRank2rates.ubRate,Constants.BallRates.pokemonRank2rates.qbRate);
                        break;
                    case 3:
                        catchCalcs(pokemon,choice,chance,Constants.BallRates.pokemonRank3rates.pbRate,Constants.BallRates.pokemonRank3rates.gbRate,Constants.BallRates.pokemonRank3rates.ubRate,Constants.BallRates.pokemonRank3rates.qbRate);
                        break;
                }
                /*
                *The cases above:
                * call the catchCalcs method
                * the arguments in the catch calcs are explained in the method
                 */
            }
        }catch (InputMismatchException e) {
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            catchPokemon(pokemon);
        }
    }

    private void catchCalcs(Pokemon pokemon,int choice,int chance,int pbRate, int gbRate, int ubRate, int qbRate){

        int ball,rate = 0;//ball will represent the user's ball rate will represent the ball's rate.
        boolean hasEnoughBalls = false;

         if (choice == 1){
            if(User.pokeball > 0){
                User.pokeball--;
                rate = pbRate;
                hasEnoughBalls = true;
            }else if (User.pokeball <= 0) {
                System.out.println("***YOU DO NOT HAVE ENOUGH OF THIS ITEM***");
                return;
            }
        }else if (choice == 2){
             if(User.greatBall > 0){
                 User.greatBall--;
                 rate = gbRate;
                 hasEnoughBalls = true;
             }else if (User.greatBall <= 0) {
                 System.out.println("***YOU DO NOT HAVE ENOUGH OF THIS ITEM***");
                 return;
             }
        }else if (choice == 3){
             if(User.ultraBall > 0){
                 User.ultraBall--;
                 rate = ubRate;
                 hasEnoughBalls = true;
             }else if (User.ultraBall <= 0) {
                 System.out.println("***YOU DO NOT HAVE ENOUGH OF THIS ITEM***");
                 return;
             }
        }else if (choice == 4){
             if(User.masterBall > 0){
                 User.masterBall--;
                 rate = Constants.BallRates.mbRate;
                 hasEnoughBalls = true;
             }else if (User.masterBall <= 0) {
                 System.out.println("***YOU DO NOT HAVE ENOUGH OF THIS ITEM***");
                 return;
             }
        }else if (choice == 5){
             if(User.quickBall > 0){
                 User.quickBall--;
                 rate = qbRate;
                 hasEnoughBalls = true;
             }else if (User.quickBall <= 0) {
                 System.out.println("***YOU DO NOT HAVE ENOUGH OF THIS ITEM***");
                 return;
             }
        }

        if(hasEnoughBalls) {
            if (chance <= rate) {
                PokemonUtils.addPokemon(pokemon);
                pokemon.catched = true;

                System.out.println("You caught: " + pokemon.name + "!");
                User.pokedex.addNewPokemon(pokemon.name);
            } else {
                System.out.println("the pokemon was not caught");
            }
        }
         /*
         *The parameters:
         * 1. will take the pokemon object. (since that's what we are changing the bool from) 2. represents the user's choice of pokeball (no try catches needed since that's processed in catchPokemon) 3.chance will represent the random number generated in catchPokemon()
         * the rest are the ball efficiency rates found in constants.java (no master ball rate needed since it's always 100)
         *
         * the conditions:
         * the conditions above do the following:
         * check to see the choice entered. Each choice represents a different ball
         * set the ball and rate based on the choice. So if the user chose 1, the ball and rate will be related to the pokeball and so on.
         * the fun stuff happens in the conditions above this comment.
         * first of all it checks to see if the user has more than 0 balls. If so then the next condition will be checked which will check if the chance falls within range of the rate. if so then the pokemon has been caught and the method exits
         * if the chance does not fall in range then the method will stop
         * if the user does not have enough items the method also stops.
         * stopping the method won't stop the battle since it's considered a move, it just does not allow the user to make a move until the other pokemon has.
          */
    }//this method will calculate the catch stuff.

    public void setName(String newName){
        nickName = newName;
    }//this method will be used for the pokemon's nickname.

    /*
    ************************************************************************************************************************************************
    **EVOLVE STUFF BELOW****************************************************************************************************************************
    *************************************************************************************************************************************************
     */

    public void evolve(){
        int index;//will represent the name index in PokemonLists.

        if(evolutionStage == 3){
            return;
        }//checks to see if the evolution stage is 3. If so then there is no need to evolve.

        else if (evolutionStage == 1){
            for (int i = 0; i < PokemonLists.evl1names.size(); i++){
                if(name.equals(PokemonLists.evl1names.get(i))){
                    index = i;
                    //sets the index to i
                    name = PokemonLists.evl2names.get(index);
                    evolutionStage = 2;
                    //sets the new name to the name at that index
                    System.out.println("Congrats! your pokemon evolved to a: " + name);
                    return;
                }
            }//loops to see what the name's index is
        }else if(evolutionStage == 2){
            for (int i = 0; i < PokemonLists.evl2names.size(); i++){
                if(name.equals(PokemonLists.evl2names.get(i))){
                    index = i;
                    //sets the index to i
                    name = PokemonLists.evl3names.get(index);
                    evolutionStage = 3;
                    //sets the new name to the name at that index
                    System.out.println("Congrats! your pokemon evolved to a: " + name);
                    return;
                }
            }
        }//depending on the evo stage, when the pokemon evolves they will move up by 1 until the evo stage is 3
    }

    public boolean evolveReady(){
        switch (evolutionStage){
            case 1:
                if (level >= 40) return true;
                break;
            case 2:
                if (level >= 85) return true;
                break;
        }
        return false;
    }//this method will return a boolean if the pokemon is evolve ready. This will allow the pokemon to evolve to the next stage if it is an eveolve level 1 or 2.
}