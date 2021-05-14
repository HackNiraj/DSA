class KthMinMax {

    static KthMax(int arr[], int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    static KthMin(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    
    public static void main(String arge[]) {
        int arr[] = {8, 1, 7, 9, 2, 4, 3};
        int k = 4;
        System.out.println(KthMin(arr, 4));
        System.out.println(KthMax(arr, 4));
    }
}