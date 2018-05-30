public class CodingExercise4 {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));

    }

    public static double area(double radius){
        if(radius < 0) {
            return -1;
        }

        return radius * radius * 3.14159;
    }
}
