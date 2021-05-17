public class Solution {
    static boolean findPair(int arr[],int n) {
        int size = arr.length;
        int i = 0, j = 1;
  
        while (i < size && j < size) {
            if (i != j && arr[j]-arr[i] == n) {
                return true;
            }
            else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }

        return false;
    }

    public static void main (String[] args)
    {
        int arr[] = {1, 8, 30, 40, 100};
        int n = 60;
        System.out.println(findPair(arr,n));
    }
}