
class Wallet {
    double balance;
    String lastMode = "NONE";
    Wallet(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) {
        balance -= amount;
        lastMode = "NORMAL";
    }
    void withdraw(double amount, String mode) {
        balance -= amount;
        lastMode = mode;
    }
    void show() {
        System.out.println("Balance: " + balance);
        System.out.println("Last Withdraw Mode: " + lastMode);
    }
}
public class Problem4 {
    static void addBonus(Wallet w, double amount) {
        w.balance += amount;
    }
    static void swap(Wallet w1, Wallet w2) {
        Wallet temp = w1;
        w1 = w2;
        w2 = temp;
        System.out.println("First Wallet: " + w1.balance);
        System.out.println("Second Wallet: " + w2.balance);
    }

    public static void main(String[] args) {
        Wallet w1 = new Wallet(1000);
        Wallet w2 = new Wallet(500);
        w1.withdraw(200);
        w1.withdraw(100, "ATM");
        addBonus(w1, 300);
        w1.show();
        swap(w1, w2);
        System.out.println("Wallet 1: " + w1.balance);
        System.out.println("Wallet 2: " + w2.balance);
    }
}