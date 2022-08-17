
/**
 * Sorting algorithm. Efficient in-place sorting of the array, one element at a time.
 * 
 * @author Gabriela Dellamora Paim 
 * @version V.1 // 14.08.22
 */
public class InsertionSort
{
    public static void sortInsertion_Int(int[] arr){
        for(int i=0; i < arr.length; i--){
            int j = i;
            while(j > 0 && arr[j-1]>arr[j]){
                int key = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = key;
                j--;
            }
        }
    }
}