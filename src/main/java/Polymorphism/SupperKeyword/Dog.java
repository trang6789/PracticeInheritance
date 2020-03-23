package Polymorphism.SupperKeyword;

public class Dog extends Animal
{
    String color = "black";

    public Dog()
    {
        super();
        System.out.println("dog is created");
    }
    public void printColor() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }

    public void eat() {
        System.out.println("eating bread...");
    }

    public void bark() {
        System.out.println("barking...");
    }

    public void work() {
        super.eat();
        bark();
    }
}