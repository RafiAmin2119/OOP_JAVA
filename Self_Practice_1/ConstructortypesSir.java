 class Student{
    int roll;
    String name;
    Student(){
        roll=0;
        name="unknown";
        System.out.println("Nothing");
    }
     Student(int r,String n){
        roll=r;
        name=n;
        System.out.println("parameterized");
    }
         Student(String n){
        roll=0;
        name=n;
        System.out.println("overloading");
    }
    void display(){
        System.out.println("ID: "+roll+",Name: "+name);
    }

 }
public class ConstructortypesSir {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        Student s2=new Student(1,"Rahim");
        s2.display();
        Student s3=new Student("Karim");
        s3.display();
    }
}
