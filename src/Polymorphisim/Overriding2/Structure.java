package Polymorphisim.Overriding2;

public class Structure implements Building{
    @Override
    public void house() {
        System.out.println("This house is a duplex");
    }

    @Override
    public void office() {
        System.out.println("This building is a skyscraper");
    }
}
