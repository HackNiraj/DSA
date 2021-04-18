class Solution {
    static void rotateByOne(int arr[]) {
        int i = arr.length-1;
        int temp = arr[i];
        while(i > 0) {
            arr[i] = arr[i-1];
            i--;
        }
        arr[0] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {9, 8, 7, 6, 4, 2, 1, 3};
        rotateByOne(arr);
        for(int value: arr) {
            System.out.print(value + " ");
        }
    }
}