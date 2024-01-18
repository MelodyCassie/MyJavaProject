package MrFemiTasks;

public class VowelStrings {
        public static void main(String[] args) {
            String strings = "Melody";
            System.out.println(returnWithoutVowel(strings));
        }

        public static StringBuilder returnWithoutVowel(String strings) {
            char[] brokenMessage = strings.toCharArray();
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < brokenMessage.length; i++) {
                char currentChar = brokenMessage[i];

                if (!(currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U' ||
                        currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u')) {
                    builder.append(currentChar);
                }
            }
            return builder;
        }
}
