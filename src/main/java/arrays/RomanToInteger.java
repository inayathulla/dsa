package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author inayath on 16/04/25
 * @project dsa
 * 9/150, LC 13
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    // Read it from left to right
    // If character in left is less than current character then remove else add
    static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int length = s.length();
        int result = map.get(s.charAt(length - 1)); // Assign last character

        // Iterate from second last character
        for (int i = length - 2; i >=0 ; i--) {
            // If char on left is greater than or equals then add else subtract
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) result = result + map.get(s.charAt(i));
            else result = result - map.get(s.charAt(i));
        }

        return result;
    }
}
