class Solution {
    
    static long merge(long arr[], int l, int m, int r) {
        long inversions = 0;
        int left = m - l + 1;
        int right = r - m;
        long L[] = new long[left];
        long R[] = new long[right];
        int i = 0, j = 0, k = l;
        for(i = 0; i < left; i++) {
            L[i] = arr[i+k];
        }
        for(j = 0; j < right; j++) {
            R[j] = arr[m + 1 + j];
        }
        i = 0; j = 0;
        while(i < left && j < right) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
                inversions += (left - i);
            }
            k++;
        }
        while(i < left) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < right) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return inversions;
    }
    
    static long mergeSort(long arr[], int l, int r) {
        long inversions = 0;
        if(l < r) {
            int mid = (l + r) / 2;
            inversions += mergeSort(arr, l, mid);
            inversions += mergeSort(arr, mid+1, r);
            inversions += merge(arr, l, mid, r);
        }
        return inversions;
    }
    
    static long inversionCount(long arr[], long N) {
        return mergeSort(arr, 0, (int)N-1);
    }

    public static void main(String args[]) {
        long N = 5;
        long arr[] = {2, 4, 1, 3, 5};
        System.out.print(inversionCount(arr, N));
    }
}