class Box{
int length;
int width;
int area(){
    return length*width;
}
}
public class ClassMethod2 {
    public static void main(String[] args) {
        Box b=new Box();
        b.length=10;
        b.width=20;
        System.out.println(b.area());

    }
}
