package recurssion;

/**
 * @author inayath on 12/04/25
 * @project dsa
 */
public class ProdOfDigits {
    public static void main(String[] args) {
        System.out.println(prod(1234));
    }

    static int prod(int n){
        if (n==0) return 1; //Here we cannot say return 0, as in sum of numbers as product of any number to 0 is 0;
        return (n%10) * prod(n/10);
    }
}
