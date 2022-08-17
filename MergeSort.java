
/**
 * The merge sort algorithm is based on the principle of divide and conquer algorithm
 * where a problem is divided into multiple sub-problems. Each sub-problem is solved
 * individually and finally, sub-problems are combined to form the final solutions.
 * 
 * @author Gabriela Dellamora Paim
 * @version V.1 // 14.08.22
 */
public class MergeSort{
    public static void mergeSort(int[] arr, int key){
        if (key < 2){
            return;
        }
        int index = key/2;
        int[] x = new int[index];
        int[] y = new int[key-index];
        
        for (int i = 0; i < index; i++){
            x[i] = arr[i];
        }
        for (int i = index; i < key; i++){
            y[i-index] = arr[i];
        }
        mergeSort(x, index);
        mergeSort(y, key-index);
        merge(arr, x, y, index, key-index);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i<left && j<right){
            if (i< left && j < right){
                if (l[i] <= r[j]){
                    a[k++] = l[i++];
                }
                else{
                    a[k++] = r[j++];
                }
            }
            while(i<left){
                a[k++] = r[i++];
            }
            while(j<right){
                a[k++] = r[j++];
            }
        }
    }
}