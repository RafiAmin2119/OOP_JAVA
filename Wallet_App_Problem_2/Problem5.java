class Wallet {
    int money;
    Wallet(int money) {
        this.money = money;
    }
}
public class Problem5 {
    static void addBonus(Wallet w, int bonus) {
        w.money += bonus;
    }
    static void swap(Wallet a, Wallet b) {
        Wallet t = a;
        a = b;
        b = t;
        System.out.println(a.money);
        System.out.println(b.money);
    }
    public static void main(String[] args) {
        Wallet w1 = new Wallet(1000);
        Wallet w2 = new Wallet(2000);
        addBonus(w1, 500);
        System.out.println(w1.money);
        swap(w1, w2);
        System.out.println(w1.money);
        System.out.println(w2.money);
    }
}