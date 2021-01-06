package ghozti.pokemon.game.constants;

public class Constants {

    /*
    * all of these classes will represent the different difficulties and rates depending on the user's rank
    * TODO set the rates for rank 1 & 2
     */

    public static final double pokemonEv1Rate = .65;
    public static final double pokemonEv2Rate = .30;
    public static final double pokemonEv3Rate = .05;

    public static class UserRank1rates extends Constants{
        public static final double pbRate = .25;
        public static double gbRate = .50;
        public static double ubRate = .75;
        public static double mbRate = 1.0;
        public static double qbRate = .35;
    }

    public static class UserRank2rates extends Constants{
        public static final double pbRate = .20;
        public static double gbRate = .46;
        public static double ubRate = .73;
        public static double mbRate = 1.0;
        public static double qbRate = .32;
    }

    public static class UserRank3rates extends Constants{
        public static final double pbRate = .15;
        public static double gbRate = .40;
        public static double ubRate = .68;
        public static double mbRate = 1.0;
        public static double qbRate = .28;
    }
}
