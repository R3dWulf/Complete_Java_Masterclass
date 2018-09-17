
public class KeyWorldAndCodeBlocksEclipse {

        public static void main(String[] args) {
              
                boolean gameOver = true;
                int score = 5000;
                int levelCompleted = 5;
                int bonus = 100;

                if ( score < 5000 && score > 1000)
            {
                /**
                 * Eveything in here is a code block
                 */
                System.out.println("Score is between 1000 and 5000");
            }
            else if ( score < 1000)
            {
                System.out.println("Score is less than 1000");
            }
            else
            {
                System.out.println("Got here");
            }
            
            boolean secondGameOver = true;
            int secondScore = 10000;
            int secondLevelCompleted =  8;
            int secondBonus = 200;
            
            
            if ( secondGameOver)
                    System.out.println("Your final score is: " + ( secondScore + ( secondLevelCompleted * secondBonus) ) );
        }

}
