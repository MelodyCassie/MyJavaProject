package ClassWorks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

    public class ArrayOfCharacters {
        public static String sortCharactersByNumber(int number, char[] chars) {

                int[] character = new int[26];

                for (int i = 0; i < character.length; i++) {
                    character[character[i] - 'A'] = i;
                }

                char[] sortedCharacters = new char[character.length];

                for (int i = 0; i < character.length; i++) {
                    int position = (number + i) % character.length;
                    sortedCharacters[i] = chars[character[position]];
                }

                return new String(sortedCharacters);
            }

            public static void main(String[] args) {
                int number = 123;
                char[] characters = {'A', 'M', 'C', 'W', 'I', 'T'};
                String sortedCharacters = sortCharactersByNumber(number, characters);
                System.out.println(sortedCharacters);
            }
}
