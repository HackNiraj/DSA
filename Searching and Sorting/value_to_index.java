import java.util.*;

class Solution{
        static Vector<Integer> valueEqualToIndex(int arr[], int n) {
            // code here
            Vector<Integer> res = new Vector<Integer>();
            for(int i = 0; i < n; i++) {
                if(arr[i] == i+1) res.add(arr[i]);
            }
            return res;
        }

        public static void main(String args[]) {
            int N = 5;
            int Arr[] = {15, 2, 45, 12, 7};
            for(Integer x: valueEqualToIndex(Arr, N)){
                System.out.println(x);
            }
        }
};