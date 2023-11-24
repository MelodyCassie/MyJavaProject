package ListInterface;
import java.util.*;

public class RemoveGetAndSetElement {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(23);
        myList.add(25);
        myList.add(45);
        myList.add(67);
        myList.add(89);

        myList.remove(1);
        System.out.println(myList);

        int thatElement = myList.get(1);
        System.out.println(thatElement);

        myList.set(0,55);
        System.out.println(myList);




    }
}
