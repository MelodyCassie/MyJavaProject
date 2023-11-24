package ListInterface;

import java.util.ArrayList;
import java.util.*;

public class AddingToList {
    public static void main(String[] args) {

        List<String> listOne = new ArrayList<>();

        listOne.add("Geeks");
        listOne.add("for");
        listOne.add("Geeks");
        System.out.println(listOne);
    }
}