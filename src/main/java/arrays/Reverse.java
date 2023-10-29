import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int start = 0;
        int end = arr.length -1;
        int temp;
        while(true){
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
        }
        System.out.println(Arrays.toString(arr));
    }
}
