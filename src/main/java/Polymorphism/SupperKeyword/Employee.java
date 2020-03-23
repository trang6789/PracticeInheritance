package Polymorphism.SupperKeyword;

public class Employee extends Person {
    float salary;
    public Employee(int id, String name, float salary)
    {
        super(id, name);
        this.salary = salary;
    }
    public void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }
}
