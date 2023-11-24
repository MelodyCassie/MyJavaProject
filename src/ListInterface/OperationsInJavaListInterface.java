package ListInterface;
import java.util.*;
public class OperationsInJavaListInterface {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<Integer>();
        myList.add(0,23);
        myList.add(1,34);
        myList.add(2,88);
        myList.add(3,56);
        myList.add(4,88);

        System.out.println(myList);

        myList.set(0, 44);
        System.out.println(myList);

        int firstOccurrence = myList.indexOf(88);
        System.out.println("YOU GET THE FIRST OCCURRENCE USING INDEX OF METHOD, THE FIRST OCCURRENCE OF 88 IS AT INDEX OF " + firstOccurrence);

        int lastOccurrence = myList.lastIndexOf(88);
        System.out.println("THE LAST OCCURRENCE OF 88 IS AT INDEX " + lastOccurrence);

        myList.remove(1);
        System.out.println(myList);

        int numberAtIndexThree = myList.get(2);
        System.out.println(numberAtIndexThree);


        boolean isPresent = myList.contains(56);
        System.out.println("IS 56 IN MY LIST??" + isPresent);




    }
}