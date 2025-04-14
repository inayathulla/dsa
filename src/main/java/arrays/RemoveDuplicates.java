package arrays;

import java.util.stream.IntStream;

/**
 * @author inayath on 14/04/25
 * @project dsa
 * 3/150, LC 26
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,2,3,3,4,4};
        int remaining = removeDuplicates(nums);

        IntStream.range(0, remaining).forEach(i -> System.out.print(nums[i]+ " "));
    }

    static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
}
