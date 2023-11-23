package arrays;

public class Basic2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rows = 3;
        int cols = 3;

        //print elements row wise
        System.out.println("Row wise");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

        //print elements column wise
        System.out.println("Column wise");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
