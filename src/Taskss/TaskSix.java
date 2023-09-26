package Taskss;

public class TaskSix {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (count = 0; count <= 10; count += 2) {
            System.out.println(count);
            sum += count;
        }
        double average = sum / 5.0;

        System.out.print("Sum is:   " + sum);
        System.out.print("Sum is:   " + average);
    }

}
