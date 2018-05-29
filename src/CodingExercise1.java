public class CodingExercise1 {
    public static void main(String[] args){
        printMegaBytesAndKiloByes(2050);
        printMegaBytesAndKiloByes(-40);
    }

    public static void printMegaBytesAndKiloByes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
        }
    }
}
