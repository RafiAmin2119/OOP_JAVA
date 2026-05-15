class Person{//ekdom_basic_class_object_example
    int roll;
    String name;
}

public class Class1 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Rafi";
        p1.roll=10;
        System.out.println(p1.name);
        System.out.println(p1.roll);
    }
}
