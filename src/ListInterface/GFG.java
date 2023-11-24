package ListInterface;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        // Creating an object of List interface
        // implemented by the ArrayList class
        List <Integer> myIntListOne = new ArrayList<Integer>();


        // Adding elements to object of List interface
        // Custom inputs
        myIntListOne.add(0,1);
        myIntListOne.add(1,2);


        // Print the elements inside the object
        System.out.println(myIntListOne);


        // Now creating another object of the List
        // interface implemented ArrayList class
        // Declaring object of integer type
        List<Integer> myListTwo = new ArrayList<Integer>();


        // Again adding elements to object of List interface
        // Custom inputs
        myListTwo.add(1);
        myListTwo.add(2);
        myListTwo.add(3);


        // Will add list l2 from 1 index
        myIntListOne.addAll(1,myListTwo);
        System.out.println(myIntListOne);


        // Removes element from index 1
        myIntListOne.remove(1);

        // Printing the updated List 1
        System.out.println(myIntListOne);


        // Prints element at index 3 in list 1
        // using get() method
        System.out.println(myIntListOne.get(3));


        // Replace 0th element with 5
        // in List 1
        myIntListOne.set(0,5);


        // Again printing the updated List 1
        System.out.println(myIntListOne);


    }

}
