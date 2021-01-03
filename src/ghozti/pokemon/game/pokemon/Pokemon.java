package ghozti.pokemon.game.pokemon;

public class Pokemon implements PokemonMethods,PokemonUtils{

    final private int maxHP = 100;

    public int HP, level, speed;
    public String type,name,gender;
    public boolean catched;

    public Pokemon(String type, int hp, int lvl, int spd, String nm, String gndr, Boolean ctch) {
        this.type = type;
        HP = hp;
        level = lvl;
        speed = spd;
        name = nm;
        gender = gndr;
        catched = ctch;
    }

    @Override
    public int move1(int hp, int lvl, int speed) {
        return 0;
    }

    @Override
    public int move2(int hp, int lvl, int speed) {
        return 0;
    }

    @Override
    public int move3(int hp, int lvl, int speed) {
        return 0;
    }

    @Override
    public int move4(int hp, int lvl, int speed) {
        return 0;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int wildAttack() {
        return 0;
    }

    @Override
    public int battle() {
        return 0;
    }

    // methods from PokemonMethods^
    // methods from PokemonUtils v

    @Override
    public void checkForMaxlevel(int lvl) {
        if(lvl > 100) level = 100;
    }

    @Override
    public void useHealthPotion(int hp, int healthPotions) {
        hp = 100;
        healthPotions--;
    }

    @Override
    public void catchPokemon(boolean catched) {

    }

    @Override
    public void setV_name(String newName) {
        name = newName;
    }

    @Override
    public void setV_HPAndLV(int hp, int lvl) {
        HP = hp;
        level = lvl;
    }

    @Override
    public void setV_gender() {
        int tmp = (int) ( Math.random() * 2 + 1);
        gender = tmp == 1 ? "Male" : "Female";
    }
}
