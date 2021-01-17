package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.user.User;

public class PokemonCreator {

    private String getName() {
        PokemonLists.setAllnames();
        int num = PokemonUtils.randomizer(0,100);

        if(num < 66){
            return PokemonLists.evl1names.get(PokemonUtils.randomizer(0,PokemonLists.evl1names.size()));
        }else if(num > 65 && num < 95){
            return PokemonLists.evl2names.get(PokemonUtils.randomizer(0,PokemonLists.evl2names.size()));
        }else if(num > 95){
            return PokemonLists.evl3names.get(PokemonUtils.randomizer(0,PokemonLists.evl3names.size()));
        }
        return "";
    }//will use the pokemon chance rates and return a name using whatever the rolled number is.It will also call a random index from the pokemon list

    private int getLevelOrSpeed(){
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
    }//will be used to get the level and speed respectively

    private String getGender() {
        int determiner = PokemonUtils.randomizer(0,1);
        return determiner == 0 ? "Male" : "Female";
    }//will get the gender at random. If the randomizer calls 0 it returns male if it's 1 it returns female

    public Object createPokemon(){
        int evostage = 0;
        String name = getName();

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
