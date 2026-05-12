import java.util.Scanner;

public class PP1_1 {
    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in); 
System.out.print("Enter base: ");
float base=input.nextFloat();
System.out.print("Enter height: ");
float height=input.nextFloat();
float area=.5F*base*height;
System.out.println("Area of the triangle: "+area);

    }
}
