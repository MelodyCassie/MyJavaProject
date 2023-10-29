package MyRandomPractices;

public class MultiDimensionalArrayPracticeTwo {
    public static void main(String[] args) {
        int[][] numbers  = new int[8][4];

        for(int i = 0; i < 8 ; i++){
            for(int j = 0; j < 4 ; j++){
                numbers[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int[] k : numbers){
            for(int s : k){
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
