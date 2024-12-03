package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Fish");
        set.add("Cat");
        set.add("Lion");
        set.add("Rabbit");
        set.add("Snake");
        System.out.println(set);
    }
}
