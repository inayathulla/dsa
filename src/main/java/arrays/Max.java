public class Max {
    public static void main(String[] args) {

        int[] arr = {1,4,6,2,5,9,7,2};
        int max = Integer.MIN_VALUE;

        for (int i=0; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element is: "+max);
        // Code goes here
    }
}
