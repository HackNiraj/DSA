class ReverseArray {
    static void reverseArr(int arr[]) {
        int i = 0, j = arr.length - 1;
        int temp = 0;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    } 

    public static void main(String args[]) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        reverseArr(arr);
        for(int value: arr) {
            System.out.print(value + " ");
        }
    }
}