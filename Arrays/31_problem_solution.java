class SmallSubarraySumGreaterThanX {
    static long subArr(long arr[], long n, long x) {
        // Your code goes here 
        long min = n+1, sum = 0;
        int i = 0, j = 0;
        while(j < n) {
            while(sum <= x && j < n) 
                sum += arr[j++];
            while(sum > x && i < n) {
                if(j - i < min) min = j - i;
                sum = sum - arr[i++];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        long A[] = {1, 4, 45, 6, 0, 19};
        long x  =  51;
        System.out.println(subArr(A, A.length, x));
    }
}