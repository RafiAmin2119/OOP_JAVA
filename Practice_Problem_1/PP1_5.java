 
 import java.util.Scanner;
 public class PP1_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter side: ");
        double side=input.nextDouble();
        
         double area = (Math.sqrt(3) / 4) * side * side;
       System.out.println(area);
       //double area=(Math.sqrt(3)/4)*side *side;
    }
}
