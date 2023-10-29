package MyRandomPractices;

public class ArrayPracticeFour {
    public static void main(String[] args) {
        String[] fruits = new String[4];

        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Pear";
        fruits[3] = "Mango";

        System.out.println(fruits[3]);
       for(int count = 0; count < fruits.length; count+=3){
           System.out.println(fruits[count]);
       }

    }
}
