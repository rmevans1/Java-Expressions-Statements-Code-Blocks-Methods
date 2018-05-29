public class Lecture29 {
    public static void main(String[] args){
        calculateScore(true, 800, 5,100);
        int highScore = calculateScore2(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        // Challenge
        // Create a method called displayHighScorePosition
        // it should accept a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >= 1000
        // 2 if the score is >= 500 and < 1000
        // 3 if the score is >= 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50
        displayHighScorePosition("Robert", calculateHighScorePosition(1500));
        displayHighScorePosition("John", calculateHighScorePosition(900));
        displayHighScorePosition("Billy", calculateHighScorePosition(400));
        displayHighScorePosition("Jack", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if((score >= 500) && (score < 1000)){
            return 2;
        } else if((score >= 100) && (score < 500)){
            return 3;
        } else {
            return 4;
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
