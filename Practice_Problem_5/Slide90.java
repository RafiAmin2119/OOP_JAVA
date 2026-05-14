class Car{
    String brand;
    String name;
    int no;
    Car(String brand,
    String name,
    int no){
this.brand=brand;
this.name=name;
this.no=no;
    }

void start(){
    System.out.println("start");
}
void stop(){
    System.out.println("stop");
}
void checkfuel(){
    System.out.println("checked");
}

}
public class Slide90 {
    public static void main(String[] args) {
        
        Car c=new  Car("audi","rafi",60);
        c.stop();
        c.start();
        c.checkfuel();

    }
}
