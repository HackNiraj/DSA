import java.util.Arrays;

class GetDifferenceInHeights {

    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int small = arr[0] + k, large  = arr[n-1] - k;
        int ans = arr[n-1] - arr[0];
        for(int i = 0; i < n - 1; i++) {
            int minVal = Math.min(small, arr[i+1] - k);
            int maxVal = Math.max(large, arr[i] + k);
            if(minVal < 0) continue; // Comment this line if negative heights are allowed.
            ans = Math.min(ans, maxVal - minVal);
        }
        return ans;
    }

    public static void main(String args[]) {
        int K = 2;
        int arr[] = {1, 5, 8, 10};
        System.out.print(getMinDiff(arr, arr.length, K));
    }
}