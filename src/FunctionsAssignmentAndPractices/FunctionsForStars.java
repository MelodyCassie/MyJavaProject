package FunctionsAssignmentAndPractices;

public class FunctionsForStars {
    public static void printingStar(int numberOfStars){
        for(int count = 0; count < numberOfStars; count++){
            for(int i = 0; i < numberOfStars; i++){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printingStar(7);
    }


}
