import java.util.HashMap;

class CountPairsWithSumK {
	static int getPairsCount(int arr[], int n, int k) {
		HashMap<Integer, Integer> mymap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!mymap.containsKey(arr[i]))
				mymap.put(arr[i], 0);
			mymap.put(arr[i], mymap.get(arr[i]) + 1);
		}

		int twice_count = 0;

		for (int i = 0; i < n; i++) {
			if (mymap.get(k - arr[i]) != null)
				twice_count += mymap.get(k - arr[i]);
			if (k - arr[i] == arr[i])
				twice_count--;
		}

		return twice_count / 2;
	}

	public static void main(String[] args) {
        int arr[] = new int[] { 1, 5, 7, -1, 5 };
		int k = 6;
		System.out.println("Count of pairs is " + getPairsCount(arr, arr.length, k));
	}
}