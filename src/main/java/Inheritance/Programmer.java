package Inheritance;

//class Programmer inherits class Employee
public class Programmer extends Employee
{
    //create field bonus
    int bonus = 10000;

    //create method void main
    public static void main(String args[])
    {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" +p.salary);
        System.out.println("Bonus of programmer is:"+p.bonus);
    }

}
