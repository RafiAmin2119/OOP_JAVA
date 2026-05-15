class Obejct{
static int count=0;

void increase(){
    count++;
}

}

public class ClassStaic1 {
    public static void main(String[] args) {
        Obejct o1=new Obejct();
           Obejct o2=new Obejct();
             o1.increase();
             o2.increase();
              o2.increase();
              
              o2.increase(); 
              o2.increase(); o2.increase();
             System.out.println(Obejct.count);
    }
}
