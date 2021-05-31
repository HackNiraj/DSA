import java.util.*;

class Solution {
    public int countOccurence(int[] arr, int n, int k) {
        HashMap<Integer, Integer> mymap = new HashMap<Integer, Integer>();
        for(int x: arr) {
            if(mymap.containsKey(x)) {
                mymap.put(x, mymap.get(x)+1);
            } else {
                mymap.put(x, 1);
            }
        }
        int val = n/k, count = 0;
        Iterator<Map.Entry<Integer, Integer>> itr = mymap.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, Integer> element = (Map.Entry<Integer, Integer>)itr.next();
            if((int)element.getValue() > val) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,2,1,2,3,3};
        int n = 8, k = 4;
        System.out.println(new Solution().countOccurence(arr, n, k));
    }
}
