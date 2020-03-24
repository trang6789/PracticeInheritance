package Polymorphism.FinalKeyWord;

public class Honda extends Bike{
    final int speedlimit;
    public Honda()
    {
        speedlimit = 70;
        System.out.println(speedlimit);
    }
    public static void main(String args[])
    {
        new Honda().run();

    }
}
