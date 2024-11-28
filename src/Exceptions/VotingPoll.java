package Exceptions;

import java.util.Scanner;

public class VotingPoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            checkAge(age);
        }catch (InvalidAge e){
            System.out.println("Caught Exception: "+ e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAge{
        if (age < 18){
            throw new InvalidAge("You are not Eligible");
        }else {
            System.out.println("You are Eligible to vote...");
        }
    }
}
