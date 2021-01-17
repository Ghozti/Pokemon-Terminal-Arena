package ghozti.pokemon.game.constants;

import ghozti.pokemon.game.user.User;

public class Constants {

    /*
    * all of these classes will represent the different difficulties and rates depending on the user's rank and pokemon's evolution stage.
    * The user rankrate will be a small percentage that will be decreased from the efficiency of all items except the master ball.
     */

    public static final int pokemonEv1Rate = 65;
    //chances of getting an evolution 1 pokemon
    public static final int pokemonEv2Rate = 30;
    //chances of getting an evolution 2 pokemon
    public static final int pokemonEv3Rate = 5;
    //chances of getting an evolution 3 pokemon

    private static double userRankRate = User.userRank == 1 ? .02 : User.userRank == 2 ? .04 : 0.06;
    //percentage rate that will be deducted from pokeball efficiency

    public static class pokemonRank1rates extends Constants{
        public static final double pbRate = .60 - userRankRate;//pokeball rate
        public static final double gbRate = .76 - userRankRate;//greatballrate
        public static final double ubRate = .85 - userRankRate;//ultraball rate
        public static final double mbRate = 1.0;//master ball rate (always 100%)
        public static final double qbRate = .35 - userRankRate;//quickball rate
    }
    //represents the constants for the user rank 1 rates

    public static class pokemonRank2rates extends Constants{
        public static final double pbRate = .50 - userRankRate;
        public static final double gbRate = .63 - userRankRate;
        public static final double ubRate = .73 - userRankRate;
        public static final double mbRate = 1.0 - userRankRate;
        public static final double qbRate = .32 - userRankRate;
    }
    //represents the constants for the user rank 2 rates

    public static class pokemonRank3rates extends Constants{
        public static final double pbRate = .30 - userRankRate;
        public static final double gbRate = .52 - userRankRate;
        public static final double ubRate = .60 - userRankRate;
        public static final double mbRate = 1.0;
        public static final double qbRate = .28 - userRankRate;
    }
    //represents the constants for the user rank 3 rates
}
