package arrays;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int key = 8; // Triplet sum to find

        //Bruteforce
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if ( (arr[i] + arr[j] + arr[k]) == key) {
                        System.out.println("Triplet found with ("+arr[i]+", "+arr[j]+", "+arr[k] +")");
                    }
                }
            }
        }

    }
}
