class Solution {
    static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static void sortZeroOneTwo(int arr[]) {
        int low = 0, mid = 0, high = arr.length-1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if(arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    } 

    public static void main(String args[]) {
        int arr[] = {0, 2, 1, 2, 0, 1};
        sortZeroOneTwo(arr);
        for(int value: arr) {
            System.out.print(value + " ");
        }
    }
}