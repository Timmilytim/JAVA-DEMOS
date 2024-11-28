package Exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }catch (ArithmeticException e){
            System.out.println("You can't divide 10 into zero places");
        }
    }
}
