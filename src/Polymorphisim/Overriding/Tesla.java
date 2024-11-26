package Polymorphisim.Overriding;

public class Tesla extends Vehicle{
    @Override
    public void car() {
        System.out.println("This is Model X");
    }

    @Override
    public void truck() {
        System.out.println("This is a Cybertruck");
    }
}
