public class Lecture26 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000) { // {} indicates a code block
            System.out.println("Your score was 5000");
        }

        //one line of code in if block
        if(score == 5000)
            System.out.println("Your score was 5000");

        //else
        if(score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }

        //else if
        score = 4000;
        if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if(score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
}
