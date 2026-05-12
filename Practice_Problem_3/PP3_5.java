  import java.util.Scanner;
  public class PP3_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=input.nextInt();
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
              break;
            }
        }
        if(isPrime && number>1){
            System.out.println(number+" prime");
        }
        else{
            System.out.println(number+" composite");
        }
    }
}
