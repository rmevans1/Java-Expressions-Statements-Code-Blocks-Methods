public class Lecture28 {
    public static void main(String[] args){
        calculateScore();
    }

    public static void calculateScore(){
        boolean gameOver = true;
        int score = 800;
        int levelCompeted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompeted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
