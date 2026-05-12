import java.util.Scanner;

public class PP1_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a,b,c:");
        double a=input.nextDouble();
          double b=input.nextDouble();
            double c=input.nextDouble();
            double s=(a+b+c)/3;
       double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
System.out.println("area: "+area);
    }
}
