package Polymorphisim.Overloading;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(double a, double b, double c){
        return a + b + c;
    }
}
