public class Lecture24 {
    public static void main(String[] args){
        //Can't use int as a variable it is a reserved word (keyword)
        //int int=5;

        // expressions
        // a mile is equal to 1.609344 kilometres
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if(highScore == 50) {
            System.out.println("This is an expression");
        }

        //Challenge
        //Find the expressions
        int score = 100; // score = 100
        if(score > 99) { //score > 99
            System.out.println("You got the high score!"); //You got the high score!
            score = 0; //score = 0
        }
    }
}
