
class Person {
    String name;

    Person() {
        System.out.println("Person constructor called");
    }

    void introduce() {
        System.out.println("Hi, I am " + name);
    }
}

class Student extends Person {

    Student() {
        System.out.println("Student constructor called");
    }

    void study() {
        System.out.println(name + " is studying");
    }
}

public class InheritanceConstructor {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Rafi";

        s.introduce();
        s.study();
    }
}