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
        //pokemon constructor
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
    public void checkForMaxlevel() {
        if(level > 100) level = 100;
        //this will check to see if the level is over 100. If so it will set it back to 100
    }

    @Override
    public void useHealthPotion(int healthPotions) {
        if(healthPotions < 1){
            System.err.println("not enough potions!");
        }else{
            HP = 100;
            healthPotions--;
        }
        //this method will reset the health to 100 and subtract the user's health potions by 1. It will also check to see if the user has more than 0 potions. If they have 0 then the method will send an error message
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
        //gets a random number from 1-2
        gender = tmp == 1 ? "Male" : "Female";
        //sets the gender to male if 1 otherwise it's female
    }
}
