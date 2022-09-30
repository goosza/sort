import java.util.Arrays;

public class MergeSort {
    public void merge(int[] arr, int l, int middle, int r){
        int i = 0, j = 0;
        int[] L = Arrays.copyOfRange(arr, l, middle + 1);
        int[] R = Arrays.copyOfRange(arr, middle + 1, r + 1);

        int k = l;
        while (i < L.length && j < R.length){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public void sort(int[] arr, int l, int r){
        if (l < r){
            int middle = l+(r-l)/2;
            sort(arr, l, middle);
            sort(arr, middle + 1, r);
            merge(arr, l, middle, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 43, 34, 45, 6, 51, 15, 32, 49, 66, 11, 24, 27, 18 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}
