class SpiralTraverseMatrix {
    static void spirallyTraverse(int[][] matrix, int r, int c) {
        // code here
        int i = 0, j = 0;
        while(i < r && j < c) {
            for(int k = j; k < c; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            i++;
            for(int l = i; l < r; l++) {
                System.out.print(matrix[l][c-1] + " ");
            }
            c--;
            if(i < r) {
                for(int k = c-1; k >= j; k--){
                    System.out.print(matrix[r-1][k] + " ");
                }
                r--;
            }
            if(j < c) {
                for(int l = r-1; l >= i; l--){
                    System.out.print(matrix[l][j] + " ");
                }
                j++;
            }
        }
    }

    public static void main(String args[]) {
        int a[][] = {{ 1, 2, 3, 4 },
                     { 5, 6, 7, 8 },
                     { 9, 10, 11, 12 },
                     { 13, 14, 15, 16 }};
        spirallyTraverse(a, a.length, a[0].length);
    }
}