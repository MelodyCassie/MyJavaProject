package LAlgorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public Map <Integer, Integer> countFrequencies(int[] arrOfKeys){

        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < arrOfKeys.length; i++){
           if (hashMap.containsKey(arrOfKeys[i])){
               hashMap.put(arrOfKeys[i],hashMap.get(arrOfKeys[i])+1);

           }
           else hashMap.put(arrOfKeys[i], 1);
        }

        return hashMap;


    }

    public static void main(String[] args) {

        FrequencyCounter frequencyCounter = new FrequencyCounter();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array ");
        int length = scanner.nextInt();

        int[] arrOfKeys = new int[length];

        for(int i = 0; i < length; i ++){
            System.out.println("Enter keys: ");
            arrOfKeys[i] = scanner.nextInt();
        }

        Map<Integer,Integer> result = frequencyCounter.countFrequencies(arrOfKeys);
        System.out.println(result);


    }

}
