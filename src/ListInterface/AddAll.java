package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class AddAll {
    public static void main(String[] args) {


    List<Object> melListOne = new ArrayList<>();
    List<Object> melListTwo = new ArrayList<>();


    melListOne.add("i");
    melListOne.add("am");
    melListOne.add("a");
    melListOne.add("girl");

    melListTwo.add(1);
    melListTwo.add(2);
    melListTwo.add(3);
    melListTwo.add(4);

  melListOne.addAll(0,melListTwo);
        System.out.println(melListOne);

        melListOne.addAll(melListTwo);
        System.out.println(melListOne);




 }
}
