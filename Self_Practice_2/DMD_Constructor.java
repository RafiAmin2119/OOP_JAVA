class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }

    void show() {
        System.out.println("Child show()");
    }
}

public class DMD_Constructor {
    public static void main(String[] args) {

        Parent p = new Child();
        p.show();

    }
}