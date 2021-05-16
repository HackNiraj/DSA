class Solution {
    static String countAndSay(int n) {
        String res = "1";
        if(n == 1) return res;
        String temp = "";
        int x = 0, j = 0;
        for(int i = 0; i < n-1; i++) {
            j = 0;
            temp = "";
            while(j < res.length()) {
                x = 1;
                while(j < res.length()-1 && res.charAt(j) == res.charAt(j+1)) {
                    x++; j++;
                }
                temp += x + "" + res.charAt(j);
                j++;
            }
            res = temp;
        }
        return res;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(countAndSay(n));
    }
}