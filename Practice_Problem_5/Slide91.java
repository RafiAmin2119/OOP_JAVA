class Dog{
String name;
int age;
String breed;
Dog(String name,int age,String breed){
    this.name=name;
    this.age=age;
    this.breed=breed;
}
void bark(){
    System.out.println("Barking");
}
void run(){
    System.out.println("Barking");
}

}

public class Slide91 {
    public static void main(String[] args) {
       Dog  d=new Dog("Kutta",20,"German");
       d.bark();
       d.run();

    }
}
