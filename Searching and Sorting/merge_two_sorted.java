public class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0, h = n - 1;
	    int temp = 0;
	    while(h >= 0 && j < m) {
	        if(arr2[j] < arr1[h]) {
	            temp = arr1[h];
	            arr1[h] = arr2[j];
	            arr2[j] = temp;
	            h--;
	        }
	        j++;
	    }
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
    }
    
    public static void main(String args[]) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 0, 2, 6, 8, 9 };
        new Solution().merge(arr1, arr2, arr1.lrngth, arr2.length);
        for(int x: arr1) {
            System.out.print(x+" ");    
        }
        for(int x: arr2) {
            System.out.print(x+" ");    
        }
    }
}