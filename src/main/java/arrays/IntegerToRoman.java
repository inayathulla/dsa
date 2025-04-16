package arrays;

/**
 * @author inayath on 16/04/25
 * @project dsa
 * 10/150, LC 12
 */
public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }
    static String  intToRoman(int num) {
        // The same can be solved using LinkedHashMap and not HashMap
        // as order is not guarenteed in HashMap
        // Below are the only possible values
        // GREEDY ALGORITHM
        int[] intCodes = {1000, 900, 500, 400, 100, 90,   50,  40,  10,   9,   5,  4,    1};
        String[] codes = {"M", "CM", "D", "CD", "C","XC", "L", "XL","X", "IX","V","IV", "I" };

        StringBuilder sb = new StringBuilder();

        // Why while inside for loop ?
        // Consider 2150, here we should subtract 1000 two times, hence i will remain same twice
        // And while conditon will remove 1000 twice amd makes it 150, then I will move all the way till 100
        // As there 400 > 150 and 100 is less than 150
        for(int i=0; i<intCodes.length; i++){
            while(num >= intCodes[i]){
                sb.append(codes[i]);
                num = num - intCodes[i];
            }
        }
        return sb.toString();
    }
}
