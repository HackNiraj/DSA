class Solution {
    static void threeWayPartition(int arr[], int a, int b) {
        int n = arr.length;
        int i = 0, j = n - 1, k = 0;
        while(k <= j) {
            if(arr[k] < a)  {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;i++;
            }
            else if(arr[k] > b) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j--;
            }
            else k++;
        }
    }

    public static void main(String arr[]) {
        int A[] = {1, 2, 3, 3, 4};
        int a = 1, b = 2;
        threeWayPartition(A, a, b);
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}