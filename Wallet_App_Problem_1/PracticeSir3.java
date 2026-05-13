class Wallet{
private final int id;
private int balance;
private static int counter;
public Wallet(){
this.balance=0;
this.id=counter;
counter++;
}
public Wallet(int balance){
this.balance=balance;
this.id=counter;
counter++;
}
void deposit(int amount){
    this.balance+=amount;
}
void withdraw(int amount){
    this.balance-=amount;
}
void show(){
    System.out.println(id);
    System.out.println(balance);
}

}
public class PracticeSir3 {
    public static void main(String[] args) {
        Wallet w1=new Wallet();
        Wallet w2=new Wallet(500);
        w1.deposit(1000);
        w2.withdraw(500);
        w1.show();
        w2.show();
    }
}
