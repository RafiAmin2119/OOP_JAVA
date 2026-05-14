
class Book {
    int id;
    String name;
    String author;
    Book(int i, String n, String a) {
        id = i;
        name = n;
        author = a;
    }
    void show() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(author);
    }
}
class Librarian {
    String name;
    Librarian(String n) {
        name = n;
    }
    void search() {
        System.out.println("Book Found");
    }
}
class Publisher {
    String name;
    Publisher(String n) {
        name = n;
    }
    void add() {
        System.out.println("Book Added");
    }
}
class User {
    String name;
    User(String n) {
        name = n;
    }
    void buy() {
        System.out.println("Book Bought");
    }
}
public class Problem {
    public static void main(String[] args) {
        Book b = new Book(1, "Java", "python");
        Librarian l = new Librarian("Amin");
        Publisher p = new Publisher("Sami");
        User u = new User("rafi");
        b.show();
        l.search();
        p.add();
        u.buy();
    }
}

