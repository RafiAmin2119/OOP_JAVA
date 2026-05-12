import java.util.Scanner;
public class PP2_1{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year=input.nextInt();
    if(year%400==0 || (year%4==0 && year%100!=0)){
        System.out.println("YES");

    }
    else {System.out.println("NO");}

}



}



