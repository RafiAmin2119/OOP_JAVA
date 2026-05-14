class Restaurant {
    void time() {
        System.out.println("40 mins");
    }
    void bill(int price) {
        System.out.println(price + price * 10 / 100);
    }
}
class FastFoodRestaurant extends Restaurant {
    void time() {
        System.out.println("20 mins");
    }
    void bill(int price) {
        System.out.println(price + price * 15 / 100);
    }
}
class FineDiningRestaurant extends Restaurant {
    void time() {
        System.out.println("60 mins");
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        FastFoodRestaurant a = new FastFoodRestaurant();
        FineDiningRestaurant b = new FineDiningRestaurant();
        a.time();
        a.bill(1000);
        b.time();
        b.bill(1000);
    }
}