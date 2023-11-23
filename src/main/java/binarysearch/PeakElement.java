package binarysearch;

import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class PeakElement {
    public static int findMinRotated(List<Integer> arr) {
        // 30 40 50 10 20, will have to find min
        // F  F  F   T  T, find first true, and start condition is (arr[mid] < arr[last]), ans = 3

        // 1 2 3 5 8 0
        // F F F F F T, ans = 5

        int index = -1;
        int left = 0;
        int right = arr.size() -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr.get(mid) == arr.get(right)){ // for this case -> 1 2 3 5 8 0
                return mid;
            }
            if(arr.get(mid) < arr.get(right)){
                right = mid -1;
                index = right;
            } else {
                left = mid+1;
            }
        }
        return index + 1;
    }


    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int res = findMinRotated(arr);
        System.out.println(res);
    }
}
