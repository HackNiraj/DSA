class CheckArrayElementPalindrome {
    boolean checkPalindrome(int x) {
        String str = x + "";
        for(int i = 0, j = str.length() - 1; i < j; i++) {
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    boolean arrayElementsCheck(int arr[]) {
        for(int x: arr) {
            if(!checkPalindrome(x)) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        CheckArrayElementPalindrome obj = new CheckArrayElementPalindrome();
        int arr[] = {111, 222, 333, 444, 555};
        System.out.print(obj.arrayElementsCheck(arr));
    }
}