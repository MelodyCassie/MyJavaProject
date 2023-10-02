package ArrayAssignment;

import java.util.List;

public class CheckIfElementOccursInAList {
    public static boolean containsElement(List<Integer> list, int element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        List<Integer> myList = List.of(1, 2, 3, 4, 5);

        int elementToFind = 3;


        if (containsElement(myList, elementToFind)) {
            System.out.println("The list contains the element " + elementToFind);
        } else {
            System.out.println("The list does not contain the element " + elementToFind);
        }
    }
}
