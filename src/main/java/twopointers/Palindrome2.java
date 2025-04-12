package twopointers;

/**
 * @author inayath on 09/07/24
 * @project dsa
 */
public class Palindrome2 {
    public static boolean isPalindrome(String s) {

        // Replace this placeholder return statement with your code
        int left = 0;
        int right = s.length() - 1;

        int missCounter = 0;
        while(left < right){
            if(missCounter > 1){
                return false;
            } else {
                if(s.charAt(left) == s.charAt(right)){
                    left ++;
                    right --;
                } else if(s.charAt(left+1) == s.charAt(right)){
                    left += 2;
                    right --;
                    missCounter ++;
                } else if(s.charAt(left) == s.charAt(right-1)){
                    left ++;
                    right -= 2;
                    missCounter ++;
                } else {
                    System.out.println("left -> "+s.charAt(left));
                    System.out.println("right -> "+s.charAt(right));
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("KLMgMLKL"));
    }
}
