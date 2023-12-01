package NewProject;

import java.util.Arrays;

public class NewProjectHomeWork9 {
    public static void main(String[] args) {
        /*
        9. Write a java program to find the second-largest number in the array?
         */

        int[] num={13,22,12,-1,33,25};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);

    }
}
