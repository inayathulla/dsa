class Count0And1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,0,1};
        int count0 = 0;
        int count1 = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
        }
        System.out.println("0's count is "+count0 +" and 1's count is " +count1);
    }
}
