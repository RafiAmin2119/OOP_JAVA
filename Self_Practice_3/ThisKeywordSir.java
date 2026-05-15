class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    void show(){
        System.out.println(name);
    }
}
public class ThisKeywordSir {
    public static void main(String[] args) {
        Student s1=new Student("Rafi");
        s1.show();
    }
}
