class User{
static int count=0;
void issue(){
    count++;
}

}

public class ClassStatic2 {
    public static void main(String[] args) {
        User u1=new User();
        User u2=new User();
        u1.issue();
        u2.issue();
System.out.println(User.count);

    }
}
