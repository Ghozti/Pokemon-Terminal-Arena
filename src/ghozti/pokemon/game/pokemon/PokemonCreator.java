package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.constants.Constants;
import ghozti.pokemon.game.user.User;

public class PokemonCreator {

    private static String getName() {
        PokemonLists.setAllnames();
        int num = PokemonUtils.randomizer(0,100);

        if(num < Constants.pokemonEv1Rate+1){
            return PokemonLists.evl1names.get(PokemonUtils.randomizer(0,PokemonLists.evl1names.size()));
        }else if(num > Constants.pokemonEv1Rate && num < (100-Constants.pokemonEv3Rate)){
            return PokemonLists.evl2names.get(PokemonUtils.randomizer(0,PokemonLists.evl2names.size()));
        }else if(num > (100-Constants.pokemonEv3Rate)){
            return PokemonLists.evl3names.get(PokemonUtils.randomizer(0,PokemonLists.evl3names.size()));
        }
        return "";
    }//will use the pokemon chance rates and return a name using whatever the rolled number is.It will also call a random index from the pokemon list

    private static int getLevelOrSpeed(){
        switch (User.userRank){
            case 0:
                return PokemonUtils.randomizer(1,8);
            case 1:
                return PokemonUtils.randomizer(8,18);
            case 2:
                return PokemonUtils.randomizer(20,31);
            case 3:
                return PokemonUtils.randomizer(33,56);
        }
        return 0;
    }//will be used to get the level and speed respectively. The number chosen will depend on the user's rank.

    private static String getGender() {
        int determiner = PokemonUtils.randomizer(1,2);
        return determiner == 1 ? "Male" : "Female";
    }//will get the gender at random. If the randomizer calls 0 it returns male if it's 1 it returns female

    public static Pokemon createPokemon(){
        int evostage = 0;
        String name = getName();

        while (name.isEmpty()){
            name = getName();
        }//this checks to see if the name is empty. If so it will keep on calling the get name method until it gets something

        for(String i : PokemonLists.evl1names){
            if (name.equals(i)) {
                evostage = 1;
            }
        }

        for(String i : PokemonLists.evl2names){
            if (name.equals(i)){
                evostage = 2;
            }
        }

        for(String i : PokemonLists.evl3names){
            if (name.equals(i)) {
                evostage = 3;
            }
        }
        //these for each loops check to see if the name matches one of the names in the array lists at PokemonLists. If so it will use the list's evo stage to set the stage.

        return new Pokemon(100,getLevelOrSpeed(),getLevelOrSpeed(),evostage,name,getGender(),false);//this will return the object created.
    }
}