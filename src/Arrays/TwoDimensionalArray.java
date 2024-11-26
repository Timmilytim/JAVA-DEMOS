package Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
         int[][] x = {{2,5,7},{3,78,12},{88,100,5}};
        //To access multi dimensional array elements
        System.out.println(x[2][1]);

        System.out.println("Looping through the arrays...");
        for (int a = 0; a< x.length; a++){
            for (int b = 0; b < x[a].length; b++){
                System.out.println(x[a][b]);
            }
        }
    }
}
