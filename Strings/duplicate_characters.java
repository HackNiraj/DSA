// Method 1 using Hash MAP
import java.util.*;

class Solution {
	static void printDuplicate(String str) {
		HashMap<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!count.containsKey(str.charAt(i)))
				count.put(str.charAt(i), 1);
			else
				count.put(str.charAt(i),
						count.get(str.charAt(i)) + 1);
		}
		for (Map.Entry mapElement : count.entrySet()) {
			char key = (char)mapElement.getKey();
			int value = ((int)mapElement.getValue());

			if (value > 1)
				System.out.println(key
								+ ", count = " + value);
		}
	}
	public static void main(String[] args) {
		String str = "test string";
		printDuplicate(str);
	}
}


// Method 2 using Array
public class Solution {
	static final int NO_OF_CHARS = 26;

static void fillCharCounts(String str,
								int[] count) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	static void printDups(String str) {
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str, count);

		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.println((char)(i) +
						", count = " + count[i]);
	}

	public static void main(String[] args) {
		String str = "test string";
		printDups(str);
	}
}
