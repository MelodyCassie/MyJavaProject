public class Loop {
    public static void main(String[] args) {

        int sum = 0;
        int index = 1;
        while( index <= 10){
            sum = index + sum;
            index++;
        }

        System.out.println(sum);



    }
}

