import Polymorphism.RunTime.AXIS;
import Polymorphism.RunTime.Bank;
import Polymorphism.RunTime.ICICI;
import Polymorphism.RunTime.SBI;

public class TestPolymorphism {
    public  static void main(String[] args)
    {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b = new ICICI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b = new AXIS();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
    }
}
