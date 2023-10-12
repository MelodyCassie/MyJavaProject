public class SwapElements {
        public static void main(String[] args) {
            int[] arrayOfNumbers = {1, 2, 3, 4, 5};
            int firstIndex = 1;
            int secondIndex = 3;

            swapElements(arrayOfNumbers, firstIndex, secondIndex);

            for (int num : arrayOfNumbers) {
                System.out.print(num + " ");
            }
        }

        public static void swapElements(int[] arrayOfNumbers, int firstIndex, int secondIndex) {
            if (firstIndex >= 0 && firstIndex < arrayOfNumbers.length && secondIndex >= 0 && secondIndex < arrayOfNumbers.length) {
                int temp = arrayOfNumbers[firstIndex];
                arrayOfNumbers[firstIndex] = arrayOfNumbers[secondIndex];
                arrayOfNumbers[secondIndex] = temp;
            } else {
                System.out.println("Invalid indices.");
            }
        }
}
