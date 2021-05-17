public class Solution {
    void fourSum(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                l = j + 1;
                r = n - 1;
                while (l < r) {
                    if (A[i] + A[j] + A[l] + A[r] == k) {
                        System.out.println(A[i]+" "+A[j]+" "+A[l]+" "+A[r]);
                        l++;
                        r--;
                    }
                    else if (A[i] + A[j] + A[l] + A[r] < X)
                        l++;
                    else 
                        r--;
                } 
            } 
        } 
    }

    public static void main(String args[]) {
        int A[] = {1, 4, 45, 6, 10, 12};
        int n = A.length;
        int X = 21;
        new Solution().fourSum(A, X);
    } 
}
