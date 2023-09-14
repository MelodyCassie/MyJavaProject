public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int index = 1;
        while( index <= 10){
            sum = sum + index;
            index++;
        }

double average = sum  / 10.0;

        System.out.println(average);


    }
}