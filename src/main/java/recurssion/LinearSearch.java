package recurssion;

/**
 * @author inayath on 13/04/25
 * @project dsa
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 15, 20, 4, 55};
        int target = 20;

        boolean found = search(arr, target, 0);
        System.out.println("Element "+target + " found : " + found);
    }

    static boolean search(int[] arr, int target, int index){
        //base condition
        if(index == arr.length) return false;

        return arr[index] == target || search(arr, target, index + 1);
    }
}
