package ghozti.pokemon.game.constants;

public class Constants {

    /*
    * all of these classes will represent the different difficulties and rates depending on the user's rank
    * TODO set the rates for rank 1 & 2
     */

    public static final double pokemonEv1Rate = .65;
    public static final double pokemonEv2Rate = .30;
    public static final double pokemonEv3Rate = .05;

    public static class pokemonRank1rates extends Constants{
        public static final double pbRate = .60;
        public static double gbRate = .76;
        public static double ubRate = .85;
        public static double mbRate = 1.0;
        public static double qbRate = .35;
    }

    public static class pokemonRank2rates extends Constants{
        public static final double pbRate = .50;
        public static double gbRate = .63;
        public static double ubRate = .73;
        public static double mbRate = 1.0;
        public static double qbRate = .32;
    }

    public static class pokemonRank3rates extends Constants{
        public static final double pbRate = .30;
        public static double gbRate = .52;
        public static double ubRate = .60;
        public static double mbRate = 1.0;
        public static double qbRate = .28;
    }
}
