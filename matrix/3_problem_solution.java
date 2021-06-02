class RowWithMaxOnes {
    int rowWithMaxOnes(int arr[][], int n, int m) {
        // code here
        if(m == 0 || n == 0) return -1;
	    if(n == 1 && m == 1) return (arr[0][0] == 1? 0: -1);
	    int j = m - 1, max = 0, curr = 0, h = -1;
	    for(int i = 0; i < n; i++) {
	        while(j >= 0 && max <= curr ) {
	            if(arr[i][j] == 0) {
	                curr = m - j - 1;
	                break;
	            } else {
	                curr = m - j - 1;
	                j--;
	            }
	        }
	        if(j < 0) return i;
	        if(max < curr) {
	            h = i;
	            max = curr;
	        }
	    }
	    if(j == m - 1) return -1;
	    return h;
    }

    public static void main(String args) {
        int N = 4 , M = 4;
        int Arr[][] = {{0, 1, 1, 1},
                       {0, 0, 1, 1},
                       {1, 1, 1, 1},
                       {0, 0, 0, 0}};
        System.out.println(rowWithMaxOnes(arr, n, m));
    }
}