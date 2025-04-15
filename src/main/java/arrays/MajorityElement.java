package arrays;

/**
 * @author inayath on 15/04/25
 * @project dsa
 * 5/150, LC 169 (Moore's Voting Algorithm)
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] elements){
        int count = 0;
        int candidate = 0;

        for(int element: elements){
            if(count == 0){
                candidate = element;
                count++;
            } else if( element == candidate){
                count++;
            } else{
                count--;
            }
        }
        return candidate;
    }
}
