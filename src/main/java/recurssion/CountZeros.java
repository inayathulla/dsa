package recurssion;

/**
 * @author inayath on 13/04/25
 * @project dsa
 */
public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(100));
    }

    static int countZeros(int n){
        if (n==0) return 1;
        return count(n);
    }
    static int count(int n){
        //base condition
        if(n == 0) return 0;

        int rem = n%10;
        if(rem == 0) return 1 + count(n/10);
        else return count(n/10);
    }
}
