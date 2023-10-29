package arrays;

public class PrintExtremes {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            // It is possible in case of odd length array that the middle
            // element is printed twice as start = end
            if (start == end) {
                // either print arr[start] or arr[end] as both represent same
                System.out.print(arr[start] + " ");
            } else {
                System.out.print(arr[start] + " "+ arr[end]+ " ");
            }
            start++;
            end--;
        }
    }
}
