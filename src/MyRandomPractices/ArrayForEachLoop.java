package MyRandomPractices;

public class ArrayForEachLoop {
    public static void main(String[] args) {
    String[] animals = {"bird" , "tiger", "panda", "cat"};
    System.out.println(animals[3]);

    for(int count = 0; count< animals.length; count++){
        System.out.println(animals[count]);
    }

    for(String count : animals) {
        System.out.println(count);
    }



    }
}
