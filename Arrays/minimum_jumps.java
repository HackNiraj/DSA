class solution {
    static int minJumps(int[] arr){
        int size = arr.length;
        if (size <= 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        int i = 1;
        
        for (i = 1; i < size; i++) {
            if (i == size - 1)
                return jump;
            if(maxReach < (i + arr[i]))
                maxReach = i + arr[i];
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(minJumps(arr));
    }
}