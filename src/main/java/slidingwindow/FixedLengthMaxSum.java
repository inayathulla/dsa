package slidingwindow;

public class FixedLengthMaxSum {
    private static int max_sum(int[] arr, int k){

        int start = 0;
        int end = 0;
        int maxSum = 0;
        int windowSum = 0;

        if(arr.length == 0 || k == 0) return 0;

        while(end < arr.length){
            windowSum += arr[end];

            if(end-start == k ){
                windowSum-= arr[start];
                start ++;
            }
            maxSum = Math.max(maxSum, windowSum);
            end ++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int k = 3;
        int[] arr = { 1, 4, 2, 20, 2, 3, 1, 0, 20 };
        int result = max_sum(arr, k);
        System.out.println(result);
    }
}
