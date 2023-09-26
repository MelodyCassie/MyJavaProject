package Taskss;

public class TaskFive {
        public static void main(String[] args) {

            int sum = 0;
            int count = 0;
            for (count = 0; count <= 10; count += 2) {
                System.out.println(count);
                sum += count;
            }
            System.out.print("Sum is:   " + sum);

        }
}
