public class QuickSort {
    public int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[r];
        arr[r] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
    public void sort(int[] arr, int l, int r){
        if (l < r){
            int partitionInd = partition(arr, l, r);
            sort(arr, l, partitionInd - 1);
            sort(arr, partitionInd + 1, r);
        }

    }
    public static void main(String[] args) {
        int[] arr = { 43, 34, 45, 6, 51, 15, 32, 49, 66, 11, 24, 27, 18 };
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0 , arr.length - 1);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}
