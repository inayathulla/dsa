package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BasicUnion {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8};
        int[] brr = {2,9};
        Vector<Integer> result = new Vector<>(); // Can grow size unlike array

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }

        for (int i = 0; i <brr.length ; i++) {
            result.add(brr[i]);
        }

        System.out.println("Elements after union are: "+result);
    }
}
