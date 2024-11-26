package Arrays;

public class BasicArray {
    public static void main(String[] args) {
        int[] num = {7,95,47,6,21,18,3,33,57,776,678};

//        Accessing the elements
        System.out.println(num[4]);

//        Looping through the array
        System.out.println("The Array Elements");
        for(int i = 0; i< num.length; i++){
            System.out.println(num[i]);
        }
    }
}
