public class Solution {
    int[] findTwoElement(int arr[], int n) {
        int i;
        int ans[] = new int[2];
        for (i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                ans[0] = abs_val;
        }
  
        for (i = 0; i < n; i++) {
            if (arr[i] > 0)
                ans[1] = i + 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int n = 7;
        for(int x: new Solution().findTwoElement(arr, n))
            System.out.println(x);
    }
}
