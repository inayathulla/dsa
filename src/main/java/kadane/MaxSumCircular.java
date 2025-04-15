package kadane;

import java.util.Arrays;

/**
 * @author inayath on 15/04/25
 * @project dsa
 * 8/150, LC 918
 */
public class MaxSumCircular {
    // TODO Optimize in one for loop
    public static void main(String[] args) {
        int[] nums = {13, -1, 3, -4, -10};
        System.out.println(maxSubarraySumCircular(nums));
    }

    static int maxSubarraySumCircular(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int wrapAround = totalSum - negativeKadane(nums);
        int kadane = kadane(nums);

        // Assume all numbers are -ve then kadane give just -ve value
        // where as wraparound will always give 0, which is incorrect
        if(wrapAround == 0) return kadane;

        // Array = [13, -1, 3, -4, -10]
        // Total = 1
        // Min = -12
        // Wraparound = 13
        // Normal Kadane = 15
        return Math.max(kadane, wrapAround);
    }

    static int kadane(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int sum=0;

        for(int num: nums){
            sum += num;
            maxSum = Math.max(maxSum, sum);

            if(sum < 0) sum = 0;
        }
        return maxSum;
    }

    static int negativeKadane(int[] nums){
        int minSum = Integer.MAX_VALUE;
        int sum = 0;

        for(int num: nums){
            sum += num;
            minSum = Math.min(sum, minSum);

            if(sum > 0) sum = 0;
        }
        return minSum;
    }
}
