package ClassWorks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataExtractionTest {
    @Test
    public void canExtractDataFromDataSet(){
        int[][] dataSet  = {
                {4,2,4,1},
                {6,8,3,6},
                {2,6,8,2},
                {5,8,2,6}
        };
        int row = 2;
        int startPosition = 2;
        int endPosition = 4;
        int[] result = DataExtraction.extract(dataSet, row, startPosition, endPosition);


            int[] expected = {8,3,6};
            assertArrayEquals(expected, result);


    }

}