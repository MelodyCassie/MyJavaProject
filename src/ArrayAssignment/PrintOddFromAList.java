package ArrayAssignment;

import java.util.List;

public class PrintOddFromAList {
    public static void printOddPositionElements(List<Integer> list {

        for (int i = 0; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
    }

    public static void main (String[]args) {
            List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
            printOddPositionElements(myList);
        }

}
