import MultiLevelInheritance.BabyDog;

public class TestMultiInheritance
{
    public static void main(String args[])
    {
        //create new object of class BabyDog
        BabyDog d = new BabyDog();
        //call method weep(), bark(), eat()
        d.weep();
        d.bark();
        d.eat();
    }
}
