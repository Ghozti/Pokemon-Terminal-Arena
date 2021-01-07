package ghozti.pokemon.game.constants;

import ghozti.pokemon.game.user.User;

public class Constants {

    /*
    * all of these classes will represent the different difficulties and rates depending on the user's rank and pokemon's evolution stage.
    * The user rankrate will be a small percentage that will be decreased from the efficiency of all items except the master ball.
     */

    public static final double pokemonEv1Rate = .65;
    public static final double pokemonEv2Rate = .30;
    public static final double pokemonEv3Rate = .05;

    private static double userRankRate = User.userRank == 1 ? .02 : User.userRank == 2 ? .04 : 0.06;

    public static class pokemonRank1rates extends Constants{
        public static final double pbRate = .60 - userRankRate;
        public static double gbRate = .76 - userRankRate;
        public static double ubRate = .85 - userRankRate;
        public static double mbRate = 1.0;
        public static double qbRate = .35 - userRankRate;
    }

    public static class pokemonRank2rates extends Constants{
        public static final double pbRate = .50 - userRankRate;
        public static double gbRate = .63 - userRankRate;
        public static double ubRate = .73 - userRankRate;
        public static double mbRate = 1.0 - userRankRate;
        public static double qbRate = .32 - userRankRate;
    }

    public static class pokemonRank3rates extends Constants{
        public static final double pbRate = .30 - userRankRate;
        public static double gbRate = .52 - userRankRate;
        public static double ubRate = .60 - userRankRate;
        public static double mbRate = 1.0;
        public static double qbRate = .28 - userRankRate;
    }
}
