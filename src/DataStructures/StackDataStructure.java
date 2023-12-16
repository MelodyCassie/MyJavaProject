package DataStructures;

import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {
        Stack <String> myStack = new Stack<>();

       // System.out.println(myStack.isEmpty());
        myStack.push("MelodyOne");
        myStack.push("MelodyTwo");
        myStack.push("MelodyThree");
        System.out.println(myStack.pop());

    }
}
