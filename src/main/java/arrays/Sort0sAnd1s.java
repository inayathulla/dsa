package arrays;

import java.util.Arrays;

public class Sort0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,1,0,1,1};

        //Two pointer approach
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            if(arr[start] == 0){
                start++;
            } else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
