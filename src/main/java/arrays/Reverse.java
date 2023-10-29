import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int start = 0;
        int end = arr.length -1;
        int temp;
/*        while(true){
            if (start == end) {
                break;
            } else if (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            } else {
                break;
            }
            start++;
            end--;
        }*/

        // Better way
        while (true){
            if (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
