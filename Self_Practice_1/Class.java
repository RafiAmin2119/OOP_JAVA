class Student{//basic_of_class_object
int roll;
String name;
void show(){
    System.out.println("Roll: "+roll);
    System.out.println("Name: "+name);
}
}
public class Class {
    public static void main(String[] args) {
        Student s1=new Student();
s1.roll=20;
s1.name="Rafi";
s1.show();

    }
}
