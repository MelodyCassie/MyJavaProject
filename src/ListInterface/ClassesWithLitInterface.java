package ListInterface;

import java.io.*;
import java.util.*;


public class ClassesWithLitInterface {
    public static void main(String[] args) {

        //ArrayList Class
        //creating a list using ArrayList
         int n = 5;

         List<Integer> arrLi = new ArrayList<Integer>(n);

         for(int i = 1; i <= n; i ++) {
             arrLi.add(i);
         }

         System.out.println(arrLi);

         arrLi.remove(3);
        System.out.println(arrLi);

        for(int j = 0; j < arrLi.size(); j++){
            System.out.print(arrLi.get(j));
        }
        System.out.println(" ");

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");


        //Vector Class
        //how to create a list object using class vector
        List<Integer> v = new Vector<>(n);

        //append new elements to the new list created
        for(int i = 1; i < n; i ++){
            v. add(i);
        }
        //printing the elements
        System.out.println(v);

        //remove elements at index 3
        v.remove(3);
        System.out.println(v);

        //printing elements one by one
        for(int j = 0; j < v.size(); j++){
            System.out.println(v.get(j) + " ");

        }



    }
}
