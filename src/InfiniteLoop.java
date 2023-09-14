public class InfiniteLoop {
    public static void main(String[] args) {
        int number = 50;
        int count = 2;
        while (number != 5) {
            System.out.println(count + " INFINITE LOOP ");
            count++;
            number--;
        }
    }
}
