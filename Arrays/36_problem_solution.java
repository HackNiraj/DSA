public class Solution {
    
    static int getMedian(int arr1[], int arr2[]) {
        int i = 0, j = 0, m1 = 0, m2 = 0, val = arr1.length + arr2.length;
        boolean flag1 = true, flag2 = true;
        for(int count = 0; count <= val/2; count++) {
            m1 = m2;
            if(i == arr1.length) {
                flag1 = false;
            } else if(j == arr2.length) {
                flag2 = false;
            }
            if(flag1 && arr1[i] <= arr2[j]) {
                m2 = arr1[i];
                i++;
            } else if(flag2){
                m2 = arr2[j];
                j++;
            }
        }
        if(val % 2 == 1) return m2;
        return (m1 + m2) / 2;
    }
    
    public static void main(String[] args) {
        int ar1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ar2[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        System.out.println(getMedian(ar1, ar2));
    }
}