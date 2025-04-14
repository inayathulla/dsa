package arrays;

import java.util.stream.IntStream;

/**
 * @author inayath on 14/04/25
 * @project dsa
 * 2/150, LC 27
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int target = 2;
        int remaining = removeElement(nums, target);

        IntStream.range(0, remaining).forEach(i -> System.out.print(nums[i]+ " "));
    }
    static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
