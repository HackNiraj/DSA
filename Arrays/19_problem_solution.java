class Solution {

    static String calculateFactorial(int x) {
        int arr[] = new int[2000000];
        arr[0] = 1;
        int arr_size = 1;
        for(int i = 2; i <= x; i++) {
            arr_size = multiply(arr, i, arr_size);
        }

        String res = "";
        int i = arr_size - 1;
        while(i >= 0) {
            res += arr[i];
            i--;
        }
        return res;
    }

    static int multiply(int arr[], int x, int res) {
        int prod = 0, carry = 0;
        for(int i = 0; i < res; i++) {
            prod = (arr[i] * x) + carry;
            arr[i] = prod % 10;
            carry = prod / 10;
        }

        while(carry != 0) {
            arr[res] = carry % 10;
            carry = carry / 10;
            res++;
        }
        return res;
    }

    public static void main(String args[]) {
        int x = 100;
        System.out.print(calculateFactorial(x));
    }
}