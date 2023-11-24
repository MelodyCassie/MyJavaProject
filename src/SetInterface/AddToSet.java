package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class AddToSet {
    public static void main(String[] args) {
        Set <Integer>  mySet = new HashSet<>();
        mySet.add(8);
        mySet.add(9);
        mySet.add(5);
        mySet.add(6);
        System.out.println(mySet);
    }
}
