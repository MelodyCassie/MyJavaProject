package ArrayAssignment;

public class StringPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Characters at the left and right positions do not match
            }
            left++;
            right--;
        }

        return true; // All characters matched, so it's a palindrome
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        boolean result = isPalindrome(input);
        System.out.println("Is it a palindrome? " + result);
    }
}
