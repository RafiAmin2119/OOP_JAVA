import java.util.Scanner;

public class PP1_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a: ");
      double a=input.nextDouble();
     if (a >= 90) {
            System.out.println("Grade: A+");
        } 
        else if (a >= 80) {
            System.out.println("Grade: A");
        } 
        else if (a>= 70) {
            System.out.println("Grade: A-");
        } 
        else if (a>= 60) {
            System.out.println("Grade: B");
        } 
        else if (a>= 40) {
            System.out.println("Grade: C+");
        } 
        else if (a >= 0) {
            System.out.println("Grade: F");
        } 
        else {
            System.out.println("Invalid marks!");
        }
        
        
    }
}

    


