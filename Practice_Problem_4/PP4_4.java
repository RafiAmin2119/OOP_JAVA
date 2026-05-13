import java.util.Scanner;
public class PP4_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
String s=input.nextLine();
char ch = input.next().charAt(0);
int count=0;
for(int i=0;i<s.length();i++){
    if(s.charAt(i)==ch){
        count++;
    }
}
System.out.println(count);

}
}