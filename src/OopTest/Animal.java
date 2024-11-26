package OopTest;

public class Animal {
    String sounds;
    String move;
    String eat;
    String reproduce;

    public Animal(String sounds, String move, String eat, String reproduce) {
        this.sounds = sounds;
        this.move = move;
        this.eat = eat;
        this.reproduce = reproduce;
    }

    public void output(){
        System.out.println("This animal "+ sounds+" "+ move+ " "+ eat+" and it's method of birth is "+reproduce);
    }

    public String output2(){
       return "This animal "+ sounds+" "+ move+ " "+ eat+" and it's method of birth is "+reproduce;
    }
}
