package NewProject;

import java.util.Scanner;

public class NewProjectHomeWork6 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given number is prime or not?
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the number you want to check");
        int num= scanner.nextInt();
        int count=0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("The number you Entered is a prime number ");
        }else{
            System.out.println("The number you Entered is not a prime number");
        }
    }
}
