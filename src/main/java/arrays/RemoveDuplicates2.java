package arrays;

import java.util.stream.IntStream;

/**
 * @author inayath on 14/04/25
 * @project dsa
 * 4/150, LC 80
 */
public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,2,3,3,3,4,4};
        int remaining = removeDuplicates2(nums);

        IntStream.range(0, remaining).forEach(i -> System.out.print(nums[i]+ " "));
    }

    static int removeDuplicates2(int[] nums) {
        int index=1;
        for(int i=1; i<nums.length; i++){
            // Note that tracking is happening with index as nums[index] is not same as nums[i]
            if(index == 1 || nums[i] != nums[index-2] ){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
