package arrays;

import java.util.Vector;

public class Intersection {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 10, 15, 20};
        int[] brr = {5, 5, 15, 50, 100};
        Vector<Integer> vector = new Vector<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            for (int j = 0; j < brr.length; j++) {
                if (element == brr[j]) {
                    // Found element, hence add it to vector
                    vector.add(element);

                    //There might be possibility when there are duplicate elements in both arrays
                    // arr = {5,5,10}
                    // brr = {5,5,20}
                    // Here the intersection will be {5, 5, 5, 5} what we rather want is {5, 5}
                    // So once we found element in second array set it to some min num or -1
                    brr[j] = Integer.MIN_VALUE;
                }
            }
        }
        System.out.println("Intersection of two arrays is: "+vector);
    }
}
