package NewProject;

public class NewProjectHomeWork1 {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.
         */
        int[] temp = {102, 98, 97, 95, 92, 91, 88};
        int Htemp =temp [0];
        int Ltemp =temp [0];

        for (int i = 0; i < temp.length; i++) {
            if (Htemp < temp[i]) {
                Htemp = temp[i];
            }
            if (temp[i] < Ltemp) {
                Ltemp = temp[i];
            }
        }
        System.out.println("Highest Temperature for the week: " + Htemp);
        System.out.println("Lowest Temperature for the week: " + Ltemp);
    }
}


