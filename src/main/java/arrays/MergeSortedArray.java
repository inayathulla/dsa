package arrays;

import java.util.Arrays;

/**
 * @author inayath on 14/04/25
 * @project dsa
 * 1/150, LC 88
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int[] nums3 = {4, 5, 6, 0, 0, 0};
        int[] nums4 = {1, 2, 3};

        int m = 3;
        int n = 3;
        //merge(nums1, m, nums2, n);

        merge1(nums3, m, nums4, n);

        //System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums3));
    }

    static void merge1(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] combined = new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                combined[k] = nums1[i];
                i++;
            } else {
                combined[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            combined[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n){
            combined[k] = nums2[j];
            j++;
            k++;
        }

        // nums1 = combined;, this will not work as it java is pass by reference for objects, we could only update its contents but not re-assign
        System.arraycopy(combined, 0, nums1, 0, m+n);
    }
}
