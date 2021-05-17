public class Solution {
    static int findMajority(int arr[], int size) {
        if(size == 1) return arr[0];
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < size; i++) {
            if(freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
                if(freqMap.get(arr[i]) > size/2) return arr[i];
            } else {
                freqMap.put(arr[i], 1);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = new int[]{2,2,2,2,5,5,2,3,3};
        System.out.println(findMajority(a, a.length));
    }
}
