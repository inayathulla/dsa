package slidingwindow;

/**
 * @author inayath on 19/11/24
 * @project dsa
 */
public class Sample {

    public static int characterReplacement(String s, int k) {
        // Frequency array to count occurrences of each character in the window
        int[] charCount = new int[26];

        int maxLength = 0;       // To store the maximum length of valid substring
        int maxFreq = 0;         // To store the frequency of the most frequent character in the window
        int start = 0;           // Left boundary of the sliding window

        // Iterate over the string with the right pointer
        for (int end = 0; end < s.length(); end++) {
            // Increment the count of the current character
            charCount[s.charAt(end) - 'A']++;

            // Update the maximum frequency of any character in the current window
            maxFreq = Math.max(maxFreq, charCount[s.charAt(end) - 'A']);

            // Check if the current window is valid
            int windowSize = end - start + 1;
            if (windowSize - maxFreq > k) {
                // Window is invalid, shrink it from the left
                charCount[s.charAt(start) - 'A']--;
                start++;
            }

            // Update the maximum length of valid substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "AABABBA";
        int k1 = 1;
        System.out.println("Longest substring length: " + characterReplacement(s1, k1)); // Output: 4

        String s2 = "ABAB";
        int k2 = 2;
        System.out.println("Longest substring length: " + characterReplacement(s2, k2)); // Output: 4
    }
}

