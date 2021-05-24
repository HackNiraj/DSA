class Solution {
    // another approach is Kadanes algorithm
    static int largestSubarraySum(int arr[]) {
        int max = Integer.MIN_VALUE, curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= curr + arr[i])
                curr += arr[i];
            else curr = arr[i];
            if (curr > max)
                max = curr;
        }
        return max;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,-2,5};
        System.out.println(largestSubarraySum(arr));
    }
}