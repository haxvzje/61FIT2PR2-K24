package week3;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return getSalary() * 12;
    }

    public int raiseSalary(int percent) {
        return getSalary() * (100 + percent)/100;
    }

    public String toString() {
        return String.format("Employee[id=%d,name=%s,salary=%d]", getId(), getName(), getSalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Duy", "Thai", 9999999);
        Employee e2 = new Employee(2, "Nam", "Khanh", 999999);

        System.out.println(e1);
        System.out.println(e2);

        e1.setSalary(10000000);
        e2.setSalary(1000000);
        System.out.println("New Salary e1: $" + e1.getSalary());
        System.out.println("New Salary e2: $" + e2.getSalary());

        System.out.println("Salary raise 20% e1: $" + e1.raiseSalary(20));
        System.out.println("Salary raise 20% e2: $" + e2.raiseSalary(20));


    }
}
