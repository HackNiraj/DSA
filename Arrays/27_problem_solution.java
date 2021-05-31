import java.util.HashSet;

class Solution {
    static String isSubset(int arr1[], int arr2[], int m, int n) {
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < m; i++)
            if (!hset.contains(arr1[i]))
                hset.add(arr1[i]);

        for (int i = 0; i < n; i++)
            if (!hset.contains(arr2[i]))
                return "No";

        return "Yes";
    }

    public static void main(String args[]) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };

        int m = arr1.length;
        int n = arr2.length;
        System.out.println(isSubset(arr1, arr2, m, n));
    }
}