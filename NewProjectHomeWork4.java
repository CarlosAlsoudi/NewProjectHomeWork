package NewProject;

public class NewProjectHomeWork4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers.
        Develop a program which will calculate the sum of even and odd numbers for that array.
         */
        int[][] numbers={
                {10,11,17,20,44,},
                {22,33,44,88,115},
                {26,99,87,66,13}
        };
        int sum=0;
        int sum2=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sum=sum+numbers[i][j];
                }

            }
        }
        for (int x = 0; x < numbers.length; x++) {
            for (int v = 0; v < numbers[x].length; v++) {
                if(numbers[x][v]%2!=0){
                    sum2=sum2+numbers[x][v];
                }

            }

        }
        System.out.println("The total sum for even numbers in this Array is "+sum);
        System.out.println("The total sum for odd numbers in this Array is "+sum2);
    }
}
