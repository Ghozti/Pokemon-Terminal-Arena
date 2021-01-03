package ghozti.pokemon.game.pokemon;

public interface PokemonMethods {

    public int move1(int hp, int lvl, int speed);
    public int move2(int hp, int lvl, int speed);
    public int move3(int hp, int lvl, int speed);
    public int move4(int hp, int lvl, int speed);
    //These 4 methods represent the 4 moves each pokemon will have.

    public int attack();
    public int wildAttack();
    public int battle();
}
