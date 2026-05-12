import java.util.Scanner;
public class PP3_3 {
    public static  void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter target sales:");
double sales=input.nextDouble();
System.out.print("Enter attendance:");
double attendance=input.nextDouble();
double bonus;
 if (sales >= 95 && attendance == 100) {
            bonus = 60;
        } else if (sales >= 95 && attendance >= 90) {
            bonus = 40;
        } else if (sales >= 80 && attendance == 100) {
            bonus = 40;
        } else if (sales >= 80 && attendance >= 90) {
            bonus = 20;
        } else {
            bonus = 5;}
            System.out.println("The bonus is:"+bonus+"%");

    }
}
