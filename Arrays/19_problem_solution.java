import java.util.ArrayList;

class CommonElements {
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here 
        ArrayList<Integer> lst = new ArrayList<Integer>();
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2 && k < n3) {
            if(A[i] == B[j] && B[j] == C[k]) {
                if(!lst.contains(A[i]))
                    lst.add(A[i]);
                i++; j++; k++;
            } else if(A[i] < B[j]) i++;
            else if(B[j] < C[k]) j++;
            else k++;
        }
        return lst;
    }

    public static void main(String args[]) {
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
        for(Integer x: commonElements(A, B, C, A.length, B.length, C.length)) {
            System.out.print(x+ " ");
        }
    }
}
