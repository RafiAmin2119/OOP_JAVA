class Demo{
void sum(int a,int b){
System.out.println(a+b);


}
void sum(int a,int b,int c){
    System.out.println(a+b+c);
}
}
public class MethodOverloading {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.sum(2,3);
        d.sum(2,3,4);

    }
}
