import java.util.Scanner;
class Employee{
    int id;
    String name;
    
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void displayInfo()
    {
        System.out.println("ID: "+id+" and Name: "+name);
    }
}

class Manager extends Employee
{
    int teamSize;
    Manager(int id, String name, int teamSize)
    {
        super(id,name);
        this.teamSize = teamSize;
    }
    
    public void approveLeave()
    {
        System.out.println("Approved Leave");
    }
}

class Developer extends Employee
{
    String language;
    Developer(int id, String name, String language)
    {
        super(id,name);
        this.language = language;
    }
    
    public void writeCode()
    {
        System.out.println("Code Written");
    }
}

public class EmployeeInheritance
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Manager obj1 = new Manager(1,"MANAGER",5);
        obj1.displayInfo();
        obj1.approveLeave();
        Developer obj2 = new Developer(2,"DEVELOPER","Python");
        obj2.displayInfo();
        obj2.writeCode();
        in.close();
    }
}
