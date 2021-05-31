import java.util.HashSet;

class Solution {
    static boolean findSum(int arr[],int n) {
        int i = 0, sum = 0;
        HashSet<Integer> mySet = new HashSet<Integer>();
        while(i < n) {
            sum += arr[i];
            if(sum == 0 || mySet.contains(sum)) {
                return true;
            }
            mySet.add(sum);
            i++;
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = {4, 2, -3, 1, 6};
        System.out.print(findSum(arr, arr.length));
    }
}