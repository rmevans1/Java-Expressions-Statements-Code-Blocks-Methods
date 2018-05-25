public class Lecture25 {
    public static void main(String[] args){
        //Statements
        int myVariable = 50; //whole line is a statement
        myVariable++;
        myVariable--;
        System.out.println("This is a test"); //the whole line not just the text is a statement

        //Statements can be multiline
        System.out.println("This is" +
                " another" +
                " still more.");

        //Multiple statements can be on one line
        int anotherVariable = 50;myVariable--;System.out.println("This is another one");
    }
}
