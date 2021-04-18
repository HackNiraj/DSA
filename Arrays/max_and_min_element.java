class Solution {
    static int[] findMinMax(int arr[]) {
        int min_ele = Integer.MAX_VALUE, max_ele = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length) {
            if(min_ele > arr[i]) {
                min_ele = arr[i];
            } else if(max_ele < arr[i]) {
                max_ele = arr[i];
            }
            i++;
        }
        int brr[]= {min_ele, max_ele};
        return brr;
    } 
    public static void main(String args[]) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        for(int value: findMinMax(arr)) {
            System.out.print(value + " ");
        }
    }
}