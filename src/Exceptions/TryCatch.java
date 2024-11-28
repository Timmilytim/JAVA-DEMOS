package Exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try {
            double a = 10/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("Caught Exception: "+e.getMessage());
        }
    }
}
