import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapElementsTest {
    @Test
    public void testSwapValidIndices() {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};
        int firstIndex = 1;
        int secondIndex = 3;

        SwapElements.swapElements(arrayOfNumbers, firstIndex, secondIndex);

        assertArrayEquals(new int[]{1, 4, 3, 2, 5}, arrayOfNumbers);
    }

    @Test
    public void testSwapInvalidIndices() {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};
        int firstIndex = -1;
        int secondIndex = 6;

        SwapElements.swapElements(arrayOfNumbers, firstIndex, secondIndex);

        // Ensure the array remains unchanged
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arrayOfNumbers);
    }
}
