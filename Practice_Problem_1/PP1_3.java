 import java.util.Scanner;
 ;
 
 public class PP1_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter radius: ");
        double radius=input.nextDouble();
double pi=3.1416;
double area=pi*radius*radius;
System.out.println("area: "+area);
    }
}
