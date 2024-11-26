package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Create an array to store 10 numbers
        int[] numbers = new int[10];

//        Accept inputs from users
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

//        Printing all the elements in the array
        System.out.print("The Array Elements: ");
        for (int num : numbers){
            System.out.print(num + ", ");
        }
        System.out.println(" ");

//        Printing the maximum and minimum elements in the array
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers){
            if (num > max){
                max = num;
            };
            if (num < min){
                min = num;
            };
        }
        System.out.println("The Maximum Element is: "+ max);
        System.out.println("The Minimum Element is: "+ min);


//    Printing the sum and average elements in the array
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        double ave = ( double)sum/numbers.length;
        System.out.println("The Sum of Elements in the array is: "+ sum);
        System.out.println("The Average of Elements in the array is : "+ ave);

//        Reversing the Array Elements
        System.out.print("Reversed Array: ");
        for (int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(" ");

//        Sorting the array
        Arrays.sort(numbers);
        System.out.print("The Sorted Array"+ Arrays.toString(numbers));
        System.out.println(" ");

        //    Search for a specific number entered by a user and display its position or indicate that it's not found
        System.out.print("Enter a number to search: ");
        int searchNumber = sc.nextInt();
        boolean found = false;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == searchNumber){
                found = true;
                System.out.println(searchNumber + " is was found in position: "+ (i+1));
                break;
            }
        }
        if (!found){
            System.out.println(searchNumber + " is not found in the array");
        }
    }
}
