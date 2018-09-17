
public class Methods {

        public static void main(String[] args) {
//                boolean gameOver = true;
//                int score = 800;
//                int levelCompleted = 5;
//                int bonus = 100;
                
//                calculateScore(gameOver, score, levelCompleted, bonus);
//                
//                // **** or *****
//                
//                calculateScore(true, 77, 3, 50);
//                
//                //**** or *****
//                
//                gameOver = true;
//                score = 460;
//                levelCompleted = 7;
//                bonus = 75;
//                
//                calculateScore(gameOver, score, levelCompleted, bonus);
//                
//                //**** or ****
                
//                int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//                System.out.println("You final high score is: " + highScore);

                int highScorePosition = caluculateHighScore(1500);
                displayHighScorePosition("Test", highScorePosition);
                
                highScorePosition = caluculateHighScore(900);
                displayHighScorePosition("Stewart", highScorePosition);
                
                highScorePosition = caluculateHighScore(400);
                displayHighScorePosition("Kevin", highScorePosition);
                
                highScorePosition = caluculateHighScore(50);
                displayHighScorePosition("Bob", highScorePosition);
                
        }
        
        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
        {
                //Java automatically creates and  defines variables with the paramter values
                
                if (gameOver )
                {
                        int finalScore = score + ( levelCompleted * bonus);
                        finalScore += 1000;
                        //System.out.println("You final score is: " + finalScore);
                        
                        return finalScore;
                } 
                
                return -1; // indicates error, invalid value or value not found
        }
        
        
        public static void displayHighScorePosition( String playerName, int playerPosition)
        {
                System.out.println(playerName + " managed to get to position " + playerPosition);
        }
        
        public static int caluculateHighScore(int score)
        {
                if ( score >= 1000 )
                {
                      return 1;
                }
                else if ( score >= 500)
                {
                       return 2;
                }
                else if ( score >= 100)
                {
                        return 3;
                }                

                return 4;
                
        }

}
