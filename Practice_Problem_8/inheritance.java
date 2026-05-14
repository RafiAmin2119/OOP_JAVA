class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void pay() {
    }
}
class FullTimeEmployee extends Employee {
    double salary;
    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    void pay() {
        System.out.println(name + " Salary: " + salary);
    }
}
class PartTimeEmployee extends Employee {
    int hour;
    double rate;
    PartTimeEmployee(String name, int hour, double rate) {
        super(name);
        this.hour = hour;
        this.rate = rate;
    }
    void pay() {
        System.out.println(name + " Salary: " + (hour * rate));
    }
}
class ContractEmployee extends Employee {
    double amount;
    ContractEmployee(String name, double amount) {
        super(name);
        this.amount = amount;
    }

    void pay() {
        System.out.println(name + " Contract: " + amount);
    }
}
public class inheritance {
    public static void main(String[] args) {
        FullTimeEmployee a = new FullTimeEmployee("Rafi", 50000);
        PartTimeEmployee b = new PartTimeEmployee("sami", 5, 500);
        ContractEmployee c = new ContractEmployee("rahi", 80000);

        a.pay();
        b.pay();
        c.pay();
    }
}