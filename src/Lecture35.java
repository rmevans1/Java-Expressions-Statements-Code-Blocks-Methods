public class Lecture35 {
    public static void main(String[] args){
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(1, 0));
        System.out.println(calcFeetAndInchesToCentimeters(1, 6));
        System.out.println(calcFeetAndInchesToCentimeters(36));
        System.out.println(calcFeetAndInchesToCentimeters(54));
        System.out.println(calcFeetAndInchesToCentimeters(-5, 10));
        System.out.println(calcFeetAndInchesToCentimeters(-100));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    //Challenge
    //Convert feet and inches to centimeters
    //Method 1: accept feet and inches
    //Method 2: accept inches > convert to feet and inches call method 1
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet >= 0) && ((inches >=0) && (inches <= 12))){
            return ((feet * 12) + inches) * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0){
            return calcFeetAndInchesToCentimeters((int) inches/12, inches%12);
        } else {
            return -1;
        }
    }
}
