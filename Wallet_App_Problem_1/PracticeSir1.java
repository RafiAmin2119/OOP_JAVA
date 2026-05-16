public class PracticeSir1 {
public static int deposit(int a,int b){
    return a+b;
}

public static int withdraw(int a,int b){
    return a-b;
}




    public static void main(String[] args) {
        int b1=40000;
        int b2=10000;
        b1=deposit(b1,5000);
        b2=withdraw(b2,8000);
        System.out.println(b1);
        System.out.println(b2);
    }
}
