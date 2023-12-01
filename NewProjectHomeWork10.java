package NewProject;

public class NewProjectHomeWork10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from an Array of Strings?
         */
        String[] names={"Carlos","Eva","Nox","Carlos"};
        boolean duplicate=false;
        for (int i = 0; i < names.length; i++) {
            for (int j =i+1; j < names.length; j++) {
                if(names[i]==names[j]){
                    System.out.println("Duplicate elements exists "+names[i]);
                    duplicate=true;
                }
            }
        }
        if(duplicate==false) {
            System.out.println("Duplicate elements dose not exists ");
        }
    }
}
