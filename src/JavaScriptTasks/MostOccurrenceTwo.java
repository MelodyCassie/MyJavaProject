package JavaScriptTasks;
import java.util.Arrays;
public class MostOccurrenceTwo {

    public static void main(String[] args) {
            MostOccurrenceTwo mostOccurrencetwo = new MostOccurrenceTwo();
            int[] array = {2, 1, 1, 2, 2};
            int result = mostOccurrencetwo.findOccurrence(array);
            System.out.println(result);
        }

        public int findOccurrence(int[] array) {
            Arrays.sort(array);

            int mostOccurringElement = array[0];
            int maxFrequency = 1;

            int currentElement = array[0];
            int currentFrequency = 1;

            for (int i = 1; i < array.length; i++) {
                if (array[i] == currentElement) {
                    currentFrequency++;
                } else {
                    if (currentFrequency > maxFrequency) {
                        maxFrequency = currentFrequency;
                        mostOccurringElement = currentElement;
                    }
                    currentElement = array[i];
                    currentFrequency = 1;
                }
            }

            if (currentFrequency > maxFrequency) {
                mostOccurringElement = currentElement;
            }

            return mostOccurringElement;
        }

}
