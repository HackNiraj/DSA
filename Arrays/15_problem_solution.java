class NextPermutation {
    void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(j > 0 && nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;    
        }
        reverse(nums, i+1);
    }
    
    void reverse(int nums[], int i) {
        int j = nums.length - 1;
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]) {
        int nums[] = {1,2,3};
        new NextPermutation().nextPermutation(nums);
        System.out.print(nums);
    }
}