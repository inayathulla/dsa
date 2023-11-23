package arrays;

public class RowSumIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        printRowWiseSum(arr);
    }
    public static void printRowWiseSum(int[][] rowWise){
        int rows = rowWise.length; //This will give row wise length
        int cols = rowWise[0].length; //This will give column length for array, provided cols are fixed.
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += rowWise[i][j];
            }
            System.out.println("Sum of elements in "+i+" row is -> "+sum);
        }
    }
}
