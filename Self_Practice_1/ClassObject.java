class Student {
    int roll;
    String name;
    void show(){
System.out.println(name);
System.out.println(roll);
}
    
}


public class ClassObject {
    public static void main(String[] args) {
       Student s1=new Student();
       
         s1.name="Rafi";
         s1.roll=10;
          s1.show();
          Student s2=new Student();
         s2.name="Rafi";
         s2.roll=20;
        
         s2.show();
        




    }
}
