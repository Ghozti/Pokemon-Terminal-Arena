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

    private static int userRankRate = User.userRank == 1 ? 2 : User.userRank == 2 ? 4 : 6;
    //percentage rate that will be deducted from pokeball efficiency

    public static class BallRates{
        public static final int mbRate = 100;//master ball rate (always 100%)

        public static class pokemonRank1rates extends Constants {
            public static final int pbRate = 60 - userRankRate;//pokeball rate
            public static final int gbRate = 76 - userRankRate;//greatballrate
            public static final int ubRate = 85 - userRankRate;//ultraball rate
            public static final int qbRate = 35 - userRankRate;//quickball rate
        }
        //represents the constants for the pokemon evo stage

        public static class pokemonRank2rates extends Constants {
            public static final int pbRate = 50 - userRankRate;
            public static final int gbRate = 63 - userRankRate;
            public static final int ubRate = 73 - userRankRate;
            public static final int qbRate = 32 - userRankRate;
        }
        //represents the constants for the pokemon evo stage

        public static class pokemonRank3rates extends Constants {
            public static final int pbRate = 30 - userRankRate;
            public static final int gbRate = 52 - userRankRate;
            public static final int ubRate = 60 - userRankRate;
            public static final int qbRate = 28 - userRankRate;
        }
        //represents the constants for the pokemon evo stage
    }
}
