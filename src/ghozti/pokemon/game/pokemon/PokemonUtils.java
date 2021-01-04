package ghozti.pokemon.game.pokemon;

public interface PokemonUtils {
    public void checkForMaxlevel();
    public void useHealthPotion(int healthPotions);
    public void catchPokemon(boolean catched);
    public void setV_name(String newName);
    public void setV_HPAndLV(int hp, int lvl);
    public void setV_gender();
}
