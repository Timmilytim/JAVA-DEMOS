package Bank;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HeritageBank heritageBank = new HeritageBank("Oluwatimilehin", "9026067000", 30000);

        while (true) {
            System.out.println("WELCOME TO HERITAGE BANK");
            System.out.println("What do you want to do? ");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Details");
            int option = sc.nextInt();


            if (option == 1) {
                System.out.println("Enter Amount you want to deposit: ");
                heritageBank.deposit(sc.nextDouble());
                break;
            } else if (option == 2) {
                System.out.println("Enter the Amount you want to withdraw: ");
                heritageBank.withdraw(sc.nextDouble());
                break;
            } else if (option == 3) {
                heritageBank.details();
                break;
            } else {
                System.out.println("Invalid...");
                System.out.println("Try Again...");
            }

        }

    }
}
