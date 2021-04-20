package uts;
public class nomor1 {
    public static void selectionsort(int[] A) {
        int smallindex;
        int pass, j, n = A.length;
        int temp;
        
        for (pass = 0; pass < n - 1; pass++){
            smallindex = pass;
            for (j = pass + 1; j < n; j++){
                if (A[j] < A[smallindex]){
                    smallindex = j;
                }
            }
            
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {3,10,4,2,8,13};
        nomor1.tampil(A);
        nomor1.selectionsort(A);
        nomor1.tampil(A);
        
        System.out.println("Tri Hesti Wahyuningsih_20090082");
        System.out.println("2D DIV TEKNIK INFORMATIKA");
}
}

    



