class Calculator{
int add(int a,int b){
    return a+b;
}
int sub(int a,int b){
    return a-b;
}

}
public class ClassMethod {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(10,5));
        System.out.println(c.sub(10,5));
        
    }
}
