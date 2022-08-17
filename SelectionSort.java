
/**
 * Escreva uma descrição da classe SelectionSort aqui.
 * 
 * @author Gabriela Dellamora Paim 
 * @version V.1 // 14.08.22
 */
public class SelectionSort{
    public static void selectionSort_Int(int[] arr){
        for (int i = 0; i< arr.length-1; i++){
            int key = i;
            for (int j = i+1; j < arr.length; j++){
                    if(arr[j] < arr[key]){
                        key = j;
                    }
            }
            int smaller = arr[key];
            arr[key] = arr[i];
            arr[i] = smaller;
        }
    }
}
