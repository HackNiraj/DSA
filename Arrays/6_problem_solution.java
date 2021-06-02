import java.util.*;

class UnionOfTwoUnsortedArrays {

    static int doUnion(int a[], int b[])  {
        //code here
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if(res.containsKey(a[i])) {
                res.put(a[i], (res.get(a[i]) + 1));
            } else {
                res.put(a[i], 1);
            }
        }
        for(int i = 0; i < b.length; i++) {
            if(res.containsKey(b[i])) {
                res.put(b[i], (res.get(b[i]) + 1));
            } else {
                res.put(b[i], 1);
            }
        }
        return res.size();
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int brr[] = {1, 2, 3};
        System.out.print(doUnion(arr, brr) + " ");
    }
}