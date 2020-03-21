import HierarchicalInheritance.Cat;
import HierarchicalInheritance.Dog;

public class TestHierarchicalInheritance
{
    public static void main(String args[])
    {
        //create new object of class Cat
        Cat c = new Cat();
        //call method meow(), eat()
        c.meow();
        c.eat();
        //create new object of class Dog
        Dog d = new Dog();
        //call method bark()
        d.bark();
    }
}
