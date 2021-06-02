class ShiftingAllNegativesToStart {
    static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    // method 1
    static void rearrangeArrayMethod1(int arr[]) {
        int i = 0, j = 0;
        while(i < arr.length) {
            if(arr[i] < 0) {
                if(i != j)
                    swap(arr, i, j);
                j++;
            }
            i++;
        }
    } 
    
    // method 2
    static void rearrangeArrayMethod2(int arr[]) {
        int i = 0, j = arr.length - 1;
        while(i <= j) {
            if(arr[i] < 0 && arr[j] < 0)
                i++;
            else if(arr[i] > 0 && arr[j] < 0) {
                swap(arr, i, j);
                i++; j--;
            } else if(arr[i] > 0 && arr[j] > 0)
                j--;
            else {
                i++; j--;
            }
        }
    } 

    public static void main(String args[]) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        rearrangeArrayMethod1(arr);
        // rearrangeArrayMethod2(arr);
        for(int value: arr) {
            System.out.print(value + " ");
        }
    }
}