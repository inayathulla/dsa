package recurssion;

/**
 * @author inayath on 14/04/25
 * @project dsa
 */
public class Triangle {

    public static void main(String[] args) {
        /*
            ****
            ***
            **
            *
            For triangle described like above we will have N rows and N columns
         */
        triangle(4, 0);
    }

    static void triangle(int r, int c){

        // base condition
        if(r == 0) return;

        if(c >= r) {
            System.out.println();
            triangle(r-1, 0);
        } else {
            System.out.print("*");
            triangle(r, c+1);
        }
    }
}
