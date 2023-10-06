package ClassWorks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMrExampleTest {
    @Test
    public void maxTest() {
        MaxMrExample calculator = new MaxMrExample(); // Create an instance of MaxMrExample
        int[] numbers = {1, 2, 3, 4, 5};
        int result = MaxMrExample.max(numbers);
        assertEquals(5, result); // Assert that the result is as expected
    }
    @Test
    public void testMax2(){
        MaxMrExample maxMrExample = new MaxMrExample();
        int [] values = {2,4,6,8};
        int result2 = MaxMrExample.max2(values);
        assertEquals(8, result2); // Assert that the result of max2 is as expected
    }
}
