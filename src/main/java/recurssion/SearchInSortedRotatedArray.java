package recurssion;

/**
 * @author inayath on 14/04/25
 * @project dsa
 */
public class SearchInSortedRotatedArray {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int target = 2;

        System.out.println(target + " element found ? "+ search(arr, target, 0, arr.length -1));
    }

    static boolean search(int[] arr, int target, int start, int end){
        //base condition
        if(start > end) return false;

        int mid = start + (end - start)/2;
        if(arr[mid] == target) return true;

        if(arr[start] <= arr[mid]) {
            // Array is left sorted

            if(target >= arr[start] && target < arr[mid]) {
                // Search in left half
                end = mid - 1;
                return search(arr, target, start, end);
            } else {
                // Search in right half
                start = mid + 1;
                return search(arr, target, start, end);
            }
        } else {
            // Array right sorted
            if(target > arr[mid] && target <= arr[end]) {
                // Search in left half
                start = mid + 1;
                return search(arr, target, start, end);
            } else {
                // Search in right half
                end = mid - 1;
                return search(arr, target, start, end);
            }
        }
    }
}
