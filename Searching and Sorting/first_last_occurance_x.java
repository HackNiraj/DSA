public class Solution {
    static int[] firstAndLastOccurance(int arr[],int x) {
        int first = 0, last = 0;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                if(!flag)first = i;
                last = i;
                flag = true;
            }
        }
        if(flag == false) {
            first = -1;
            last = -1;
        }
        int res[] = {first, last};
        return res;
    } 

    public static void main(String args[]) {
        int x=5;
        int arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        for(int w: firstAndLastOccurance(arr, x)) {
            System.out.println(w);
        }
    }
}
