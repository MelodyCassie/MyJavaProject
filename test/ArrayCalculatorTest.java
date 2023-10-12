import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCalculatorTest {
    @Test
    public void testThatWeCanSum(){
        // build a calculator that
        // not allowed to write a line of code until you write a working test
        // it is not hard to write a test that fails or passes
        // giveN
        ArrayCalculator arrayCalculator = new ArrayCalculator();
        int[] numbers = {1,2,3,4,5};

        // when
        int sum = arrayCalculator.sum(numbers);
        assertEquals(31, sum);
        // assert

    }
    @Test
    public void testThatMultiplyTheArrayNumbers(){
        ArrayCalculator arrayCalculator = new ArrayCalculator();
        int[] ints = {2,4,6};
        int product = (int) arrayCalculator.multiply(ints);
        assertEquals(48,product);
    }
    @Test
    public void testThatWeCanGetTheAverageOfTheArrayNumbers(){
        ArrayCalculator arrayCalculator = new ArrayCalculator();
        int[] ints = {2, 4, 6};
        int average = arrayCalculator.average(ints);
        assertEquals(4, average);

    }
    //@Test
    //public void testSwapElements(){
        //ArrayCalculator arrayCalculator = new ArrayCalculator();
        //int[] numbers = {1,2,3,4,5,6,7};
        //int result = arrayCalculator.swap(numbers);
        //int expected = {7,6,5,4,3,2,1};
        //assertEquals(expected, result);
    }

