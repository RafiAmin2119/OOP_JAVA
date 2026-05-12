  import java.util.Scanner;
  public class PP1_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celcius=input.nextDouble();
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("answer: "+fahrenheit);
    }
}
