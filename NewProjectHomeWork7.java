package NewProject;

public class NewProjectHomeWork7 {
    public static void main(String[] args) {
/*
7. Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
        int num=20, frinstnumber=0 ,secondnumber=1, nextnumber;

        for (int i = 0; i < num; i++) {
            nextnumber=frinstnumber+secondnumber;
            frinstnumber=secondnumber;
            secondnumber=nextnumber;
            System.out.print(frinstnumber+", ");
        }
    }
}
