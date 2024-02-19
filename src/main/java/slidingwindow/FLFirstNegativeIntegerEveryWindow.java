package slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class FLFirstNegativeIntegerEveryWindow {

    public static ArrayList<Integer> firstNegativeInteger(List<Integer> arr, int k, int n)
    {
        //    Write your code here.
        int windowStart = 0;
        int windowEnd = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        while(windowEnd < n){
            if(arr.get(windowEnd) < 0){
                queue.add(arr.get(windowEnd));
            }

            if( (windowEnd-windowStart+1) == k){
                if(queue.peek() == null){
                    result.add(0);
                } else if(arr.get(windowStart) < 0){
                    result.add(queue.poll());
                } else {
                    result.add(queue.peek());
                }
                windowStart ++;
            }

            windowEnd ++;
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-10, 20, -30, -40, 50, 60, -70, 80, 90);
        int k=3;
        System.out.println(firstNegativeInteger(arr, k, arr.size()));
    }
}
