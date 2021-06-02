import java.util.Arrays;

class CheckThreeNumberSum {
    static boolean find3Numbers(int arr[], int n, int X) { 
        Arrays.sort(arr);
        for(int i = 0; i < n - 2; i++) {
            int j = i+1;
            int k = n - 1;
            while(j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == X)return true;
                else if(sum < X) j++;
                else k--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        System.out.println(find3Numbers(arr, arr.length, sum));
    }
    
}