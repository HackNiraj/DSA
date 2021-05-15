class Solution {
    static void reverseStr(String str) {
        int i = str.length() - 1;
        String temp = "";
        while(i >= 0) {
            temp += str.charAt(i);
            i--;
        }
        return temp;
    } 

    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.println(reverseStr(str));
    }
}