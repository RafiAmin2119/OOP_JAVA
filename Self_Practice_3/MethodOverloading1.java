class Demo {
    void show(int a, String b) {
        System.out.println(a + " " + b);
    }

    void show(String a, int b) {
        System.out.println(a + " " + b);
    }
}

public class MethodOverloading1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(10, "Hello");
        d.show("Hi", 20);
    }
}

