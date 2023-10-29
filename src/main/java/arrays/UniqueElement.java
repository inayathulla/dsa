package arrays;

class UniqueElement{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 5, 6, 5, 4, 6};
        // When each element is repeated twice or 4 or 6 times etc.. then unique element can be found just with XOR.
        // one element cancels another element

        int ans = 0; // 0 ^ anything = anything.
        for (int i=0; i<arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println("Unique element is : "+ans);
    }
}
