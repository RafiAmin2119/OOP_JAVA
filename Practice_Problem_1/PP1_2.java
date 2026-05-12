import java.util.Scanner;
public class PP1_2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter radius: ");
        double radius=input.nextDouble();
        double pi=3.1416;
        double volume=(4/3)*pi*radius*radius*radius;
        System.out.println("volume: "+volume);
    }
}
