class Solution {
      static int countSquares(int N) {
          // code here
          int count = 0;
          for(int i = 1; i*i < N; i++) {
              count++;
          }
          return count;
      }

      public static void main(String args[]) {
          int N = 9;
          System.out.println(countSquares(N));
      }
  };