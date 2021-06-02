class MedianForSortedSameLengthArray {
    // method 1
    static int getMedian(int arr1[], int arr2[]) {
        int i = 0, j = 0, m1 = 0, m2 = 0;
        for(int count = 0; count <= arr1.length; count++) {
            m1 = m2;
            if(i == arr1.length) {
                m2 = arr2[0];
                break;
            } else if(j == arr2.length) {
                m2 = arr1[0];
                break;
            }
            if(arr1[i] <= arr2[j]) {
                m2 = arr1[i];
                i++;
            } else {
                m2 = arr2[j];
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    // method 2
    static int getMedian(int arr1[], int arr2[], int startA, int startB, int endA, int endB) {
        if(endA - startA == 1) {
            return (Math.max(arr1[startA], arr2[startB]) + Math.min(arr1[endA], arr2[endB])) / 2;
        }
        int m1 = calMedian(arr1, startA, endA);
        int m2 = calMedian(arr2, startB, endB);

        if(m1 == m2) return m1;

        if(m1 < m2) {
            return getMedian(arr1, arr2, (endA + startA + 1)/ 2, startB, endA, (endB + startA + 1) / 2);
        } else {
            return getMedian(arr1, arr2, startA, (endB + startB + 1) / 2, (endA + startA + 1)/ 2, endB);
        }
    }

    static int calMedian(int arr[], int l, int r) {
        int val = (r-l+1);
        return (val % 2 == 0 ? (arr[l + (val/2) - 1] + arr[l + (val/2)]) / 2 : arr[l + (val / 2)]);
    }
    
    public static void main(String[] args) {
        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};
        System.out.println(getMedian(ar1, ar2, 0, 0, ar1.length - 1, ar2.length - 1));
        System.out.println(getMedian(ar1, ar2));
    }
}