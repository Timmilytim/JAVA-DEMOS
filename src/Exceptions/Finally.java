package Exceptions;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[] array = new int[2];
            System.out.println(array[3]);

            int div = 10/5;
            System.out.println(div);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught Exception: " + e.getMessage() );
        }catch (ArithmeticException d){
            System.out.println("Arithmetic Error in your code");
        }
        finally {
            System.out.println("Code Executed Successfully");
        }
    }
}
