class KadanesAlgoForMaxSubArray {
    static int kadanesAlgo(int arr[]) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0)
                sum = 0;
        }
        return max;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,-2,5};
        System.out.println(kadanesAlgo(arr));
    }
}