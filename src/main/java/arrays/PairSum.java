package arrays;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        int sumOfElements = 9;

        //Bruteforce
        System.out.println("------- Brute force --------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ( (arr[i] + arr[j]) == sumOfElements) {
                    System.out.println("Pair ("+arr[i]+","+arr[j]+")");
                    break;
                }
            }
        }

        System.out.println("------- Optimal --------");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int elementToFind = sumOfElements - arr[i];
            if (map.containsKey(elementToFind)) {
                System.out.println("Pair ("+arr[map.get(elementToFind)]+","+arr[i]+")");
                break;
            } else {
                map.put(arr[i], i);
            }
        }
    }
}
