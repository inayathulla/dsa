package recurssion;

/**
 * @author inayath on 13/04/25
 * @project dsa
 */
public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
        if(arr.length <= 1) return true;

        return sorted(arr, 1);
    }

    static boolean sorted(int[] arr, int currIndex){
        //base condition
        if(currIndex == arr.length) return true;

        if(arr[currIndex] < arr[currIndex - 1]) return false;

        return sorted(arr, currIndex + 1);
    }
}
