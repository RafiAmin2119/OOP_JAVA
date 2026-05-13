import java.util.Scanner;
public class PP4_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
String s=input.nextLine();
String reversed = new StringBuilder(s).reverse().toString();
if(s.equals(reversed)){
    System.out.println("YES");
}
else {
    System.out.println("NO");
}
    }
}
