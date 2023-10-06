package ClassWorks;

public class DataExtraction {
    public static void main(String[] args) {

    }

    public static int[] extract(int[][] dataSet, int row, int startPosition, int endPosition) {
        int[] rowData = dataSet[row - 1];
        int[] extractedData = new int[endPosition - startPosition + 1];

        int count = 0;

        for(int i = startPosition - 1; i < endPosition; i++){
            extractedData[count] = rowData[i];
            count++;
        }
        return extractedData;
    }
}
