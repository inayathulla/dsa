/**
 * @author inayath on 15/04/25
 * @project dsa
 * 7/150, LC 55
 */
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canReach(nums));
    }
    static boolean canReach(int[] nums){
        int maxReachableIndex = 0;

        for(int i=0; i<nums.length; i++){
            // If at any time you are at an index which was not reachable till then you cannot reach end
            if(i > maxReachableIndex) return false;

            maxReachableIndex = Math.max(maxReachableIndex, i + nums[i]);
        }
        return true;
    }
}
