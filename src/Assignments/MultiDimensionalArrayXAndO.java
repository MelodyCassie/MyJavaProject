package Assignments;

public class MultiDimensionalArrayXAndO {
    public static void main(String[] args) {
        String x = "x";
        String o = "o";

        String[][] game = new String[3][3];
        game[0][0] = x;
        game[0][1] = o;
        game[0][2] = x;
        game[1][0] = o;
        game[1][1] = x;
        game[1][2] = o;
        game[2][0] = x;
        game[2][1] = o;
        game[2][2] = x;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
    }
}
