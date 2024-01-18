package MrFemiTasks;

public class MinimumAndMaximumString {
        public static void main(String[] args) {
            String numbersString = "-5 2 9 1 7 3";
            int[] result = findMinMax(numbersString);

            System.out.println("{" + result[0] + " " + result[1] + "}");
        }

        public static int[] findMinMax(String numbersString) {
            String[] numberStrings = numbersString.split("\\s+");

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (String numStr : numberStrings) {

                int num = Integer.parseInt(numStr);
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            return new int[]{min, max};

        }
}
