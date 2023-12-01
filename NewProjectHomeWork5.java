package NewProject;

public class NewProjectHomeWork5 {
    /*
    Write a program to swap 2 numbers without a temporary variable?
     */
    public static void main(String[] args) {
        int num1=22;
        int num2=33;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping num1 = "+num1+" num2 = "+num2);

    }
}
