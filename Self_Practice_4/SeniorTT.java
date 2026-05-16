class Person {
    String name;
    int age;
    String phoneNumber;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println("Phone: " + phoneNumber);
       
    }
}
public class SeniorTT {
    public static void main(String[] args) {
        Person p1 = new Person("Rafi", 20);
        Person p2 = new Person("Sami", 15, "01712345678");
        p1.show();
        p2.show();
    }
}
