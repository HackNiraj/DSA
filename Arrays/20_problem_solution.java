class Solution {
    
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void rearrangeArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        while(i < j) {
            if(arr[i] < 0) {
                while(i< j && arr[j] < 0) {
                    j--;
                }
                if(i < j) {
                    swap(arr, i, j);
                    j--;
                } else {
                    break;
                }
            }
            i++;
        }
        
        if(arr[i] >= 0)
            i++;
        
        int start = 0;
        while( start < i && i < arr.length) {
            swap(arr, start, i);
            i++;
            start += 2;
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {-5, -2, -5, -2, -4, -7, -1, -8, 0, -8};
        rearrangeArray(arr);
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
