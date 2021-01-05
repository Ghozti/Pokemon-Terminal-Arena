package ghozti.pokemon.game.pokemon;


import ghozti.pokemon.game.user.User;

public class PokemonUtils{

    public static int randomizer(int num, int num2){
        return (int) ( Math.random() * num2 + num);
    }

    public static void printPokemon(){
        for (int i = 0; i < User.pokemons.size(); i++) {
            System.out.println("[ " + i + " ]" + User.pokemons.get(i).name);
        }
    }


}
