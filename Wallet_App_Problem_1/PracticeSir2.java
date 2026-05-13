class Wallet{
private int balance;
void deposit(int amount){
    this.balance+=amount;
}
void withdraw(int amount){
    this.balance-=amount;
}
void show(){
    System.out.println(this.balance);
}
}

public class PracticeSir2 {
    public static void main(String[] args) {
        Wallet w=new Wallet();
        w.deposit(500);
        w.withdraw(100);
        w.show();
    }
}
