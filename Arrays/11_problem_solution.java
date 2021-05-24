// import java.util.Arrays;

// Method 1 O(nlogn) & O(1)
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int i = 0;
//         for(i = 0; i < nums.length-1; i++) {
//             if(nums[i] == nums[i+1]) break;
//         }
//         return nums[i];
//     }

//     public static void main(String args[]) {
//         int arr[] = {1,3,4,2,2};
//         System.out.print(arr);
//     }
// }

// // Method 2 O(n) & O(n)
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Set<Integer> myset = new HashSet<Integer>();
//         for(int num: nums) {
//             if(myset.contains(num))return num;
//             myset.add(num);
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int arr[] = {1,3,4,2,2};
//         System.out.print(arr);
//     }
// }

// // Method 3 O(n) & O(1) Flyod Cycle detection Algorithm to reduce Linked list problem
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int tortoise = nums[0];
//         int hare = nums[0];
//         do{
//             tortoise = nums[tortoise];
//             hare = nums[nums[hare]];
//         } while(tortoise != hare);
//         tortoise = nums[0];
//         while(tortoise != hare) {
//             tortoise = nums[tortoise];
//             hare = nums[hare];
//         }
//         return hare;
//     }

//     public static void main(String args[]) {
//         int arr[] = {1,3,4,2,2};
//         System.out.print(arr);
//     }
// }

// Method 4 O(n) & O(1)
class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; ++i) {
            int val = Math.abs(nums[i]);
            if(nums[val] < 0) return val;
            nums[val] *= -1;
        }
        return 0;
    }

    public static void main(String args[]) {
        int arr[] = {1,3,4,2,2};
        System.out.print(arr);
    }
}