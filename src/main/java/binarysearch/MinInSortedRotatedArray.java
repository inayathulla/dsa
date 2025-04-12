package binarysearch;

class MinInSortedRotatedArray {
    // Strivers solution
    public static int findMin(int[] nums) {

        // Why to store min? Because mid may be the min 
        // And if we move left / right after / before mid 
        // Then we will lose ans 
        // [5, 6, 7, 1, 2, 3, 4]
        //           M        R
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length -1;

        if (nums.length == 1) return nums[0];

        // No rotation
        if(nums[right] > nums[left]) return nums[0];

        while(left <= right){
            int mid = left + (right-left)/2;

            // [7, 1, 2, 3, 4, 5, 6]
            //           M        R
            if(nums[mid] < nums[right]){
                // Array is sorted right
                right = mid-1;
                ans = Math.min(ans, nums[mid]);
            } else {
                // Array is sorted left
                // [3, 4, 5, 6, 7, 1, 2]
                //           M        R
                left = mid+1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}