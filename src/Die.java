import java.util.Random;

public class Die {


        int sides;
        int value;

        public Die(){
            sides=6;


        }

        public int getSides() {
            return sides;
        }

        public static int randomGenerator(){
            Random rn = new Random();

            int result = rn.nextInt(6)+1;

            return result;
        }

        public int roll(){






            return 1;}


    }


