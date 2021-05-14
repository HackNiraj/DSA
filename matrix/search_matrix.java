class Solution {
    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0, r = m * n - 1;
        while (l != r){
            int mid = (l + r - 1) >> 1;
            if (matrix[mid / m][mid % m] < target)
                l = mid + 1;
            else 
                r = mid;
        }
        return matrix[r / m][r % m] == target;
    }
    
    public static void main(String args[]) {
        int matrix[][] = [[1,3,5,7],[10,11,16,20],[23,30,34,60]];
        int target = 13;
        System.out.println(searchMatrix(matrix, target))
    }
}