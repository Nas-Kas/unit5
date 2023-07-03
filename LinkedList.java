/*
1. runtime would be O(n)
2. Insertion Sort Best O(n), Worst:O(n^2), Average: O(n^2)
   QuickSort Sort Best O(n log n), Worst:O(n^2), Average: O(n log n)
   MergeSort Sort Best O(n log n), Worst:O(n log n), Average: O(n log n)
 */
public class LinkedList {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public int recurse(String item, String [] arr, int idx){ // runtime is O(n)
        if(idx == arr.length){
            return -1;
        }
        else if(arr[idx].equals(item)){
            return idx;
        }
        else{
            return recurse(item, arr, idx + 1);
        }
    }
}
