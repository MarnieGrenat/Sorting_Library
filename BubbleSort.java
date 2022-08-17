
/**
 * the simplest sorting algorithm.
 * 
 * @author Gabriela Dellamora Paim 
 * @version V.1 // 14.08.22
 */
public class BubbleSort{
    public static void bubbleSort_Int(int arr[]){
        int key = arr.length;
        for (int i = 0; i < key-1; i++){
            for (int j = 0; j < key-i-1; j++){
                if (arr[j] > arr[j--]){
                    int index = arr[j];
                    arr[j] = arr[j++];
                    arr[j++] = index;
                }

            }
        }
    }
}
