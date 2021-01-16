package ghozti.pokemon.game.pokemon;

import ghozti.pokemon.game.constants.Constants;

public class PokemonCreator {

    public static String getName() {
        PokemonLists.setAllnames();
        int num = PokemonUtils.randomizer(0,100);

        if(num < (100 - (Constants.pokemonEv1Rate * 100)) + 1){
            return PokemonLists.evl1names.get(PokemonUtils.randomizer(0,PokemonLists.evl1names.size()));
        }else if(num > 65 && num < ){

        }else if(){

        }
        return "";
    }
}
