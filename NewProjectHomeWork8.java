package NewProject;

public class NewProjectHomeWork8 {
    public static void main(String[] args) {
/*
Maximum and minimum number in the array?
 */

        int[] a={50,22,55,68,900,33,159};
        int max=a[0];
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]){
                max=a[i];
            }

        }
        for (int j = 0; j < a.length; j++) {
            if(min>a[j]){
                min=a[j];

        }}
        System.out.println("The maximum number in this Array is : "+ max);
        System.out.println("The minimum number in this Array is : "+ min);
    }
}
