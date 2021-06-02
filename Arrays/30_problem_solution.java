import java.util.Arrays;

class ChoclateDistribution {
    static long findMinDiff(long arr[], long m) {
        if(m == 0 || arr.length == 0) return 0;
        if(arr.length < m) return -1;
        int i = 0;
        Arrays.sort(arr);
        Long min = Long.MAX_VALUE;
        Long diff;
        for(i = 0; i < arr.length - m + 1; i++) {
            diff = arr[i + (int)(m) - 1] - arr[i];
            if(diff < min) min = diff;
        }
        return min;
    }

    public static void main(String args[]){  
        long arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        long m = 7;        
        System.out.println(findMinDiff(arr, m));
    }  
}