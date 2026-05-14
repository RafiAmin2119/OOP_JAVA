class Book{
String title;
String author;
Book(String title){
    this.title=title;
}
Book(String title,String author){
    this.title=title;
    this.author=author;
}

void show(){
    System.out.println(title);
    System.out.print(author);
}

}

public class Slide92 {
    public static void main(String[] args) {
        Book b1=new Book("ksksjsj");
        Book b2=new Book("edb","hbdd");
        b1.show();
        b2.show();
    }
}
