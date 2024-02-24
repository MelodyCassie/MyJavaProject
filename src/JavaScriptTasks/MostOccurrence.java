package JavaScriptTasks;

import java.util.HashMap;
import java.util.Map;

public class MostOccurrence {
        public static void main(String[] args) {
            MostOccurrence mostOccurrence = new MostOccurrence();
            int[] array = {2, 1, 1, 2, 2};
            int result = mostOccurrence.findOccurrence(array);
            System.out.println(result);
        }

        public int findOccurrence(int[] array) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (int num : array) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            int mostOccurringElement = 0;
            int maxFrequency = 0;

            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                int num = entry.getKey();
                int frequency = entry.getValue();
                if (frequency > maxFrequency) {
                    maxFrequency = frequency;
                    mostOccurringElement = num;
                }
            }

            return mostOccurringElement;
        }

}

