package Arrays;

public class ArrayObjects {
    public static void main(String[] args) {
        String[] names = {"Tim", "Trump", "Putin","Hitler","Tinubu"};

        System.out.println("Names in the array");
        for (String name : names){
            System.out.println(name);
        }

//        To get the length of the array
        System.out.println("The number of names in the array is: " + names.length);
    }
}
