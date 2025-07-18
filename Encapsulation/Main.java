class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            System.out.println("Invalid ID. Must be positive.");
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty())
            this.name = name;
        else
            System.out.println("Invalid name.");
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Salary cannot be negative.");
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Employee", 50000.0);
        emp1.displayInfo();

        // Update fields using setters
        emp1.setSalary(55000.0);
        emp1.setName("Employee Name");

        System.out.println("After update:");
        emp1.displayInfo();

        // Try setting invalid values
        emp1.setId(-10);       
        emp1.setSalary(-2000); 
    }
}
