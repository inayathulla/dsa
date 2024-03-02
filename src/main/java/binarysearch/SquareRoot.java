package binarysearch;

public class SquareRoot {
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;

        if (x == 0 || x == 1) {
            return x;
        }
        while(left <= right){
            int mid = left + (right - left)/2;

            if (mid == (x / mid)){
                return mid;
            }
            else if(mid <  (x / mid)){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        for(int i=0; i< 100; i++ ) {
            System.out.println("power of " + i + " is -> " + mySqrt(i));
        }
        System.out.println("power of 2147483647 is -> " + mySqrt(2147483647));
    }
}
