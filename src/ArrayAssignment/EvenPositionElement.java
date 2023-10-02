package ArrayAssignment;

import java.util.List;

public class EvenPositionElement {
    public static void printEvenPositionElements(List<Integer> list) {
        for (int i = 1; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        printEvenPositionElements(myList);
    }
}
}
