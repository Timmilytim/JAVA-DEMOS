package OopTest;

public class AnimalType {
    public static void main(String[] args) {
        Animal dog = new Animal("barks", "walks", "Omivore", "live birth");
        System.out.println("This is a dog " + dog.output2());
       dog.output();
    };
}
