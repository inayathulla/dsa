package binarysearch;

/*
An array of boolean values is divided into two sections;
the left section consists of all false and the right section consists of all true.
Find the First True in a Sorted Boolean Array of the right section, i.e. the index of the first true element.
If there is no true element, return -1.
        Input: arr = [false, false, true, true, true]
        Output: 2
        Explanation: first true's index is 2.
*/
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class FirstTrue {
    public static int findBoundary(List<Boolean> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int left = 0;
        int right = arr.size() -1;
        int index = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr.get(mid)) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Boolean> arr = splitWords(scanner.nextLine()).stream().map(v -> v.equals("true")).collect(Collectors.toList());
        scanner.close();
        int res = findBoundary(arr);
        System.out.println(res);
    }
}

