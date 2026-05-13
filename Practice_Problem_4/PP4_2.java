 import java.util.Scanner;

 
 public class PP4_2 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        String s=input.nextLine();
 String reversed = new StringBuilder(s).reverse().toString();
System.out.println(reversed);
    }
}
