
/**
 * The most efficient sorting algorithm between the quadratic complexity ones. 
 * creator: Donald Shell
 * 
 * @author Gabriela Dellamora Paim 
 * @version V.1 // 14.08.22
 */
public class ShellSort{
    public static void  shellSort(int[] arr){
        int i, j, h=1, value;
        do{
            h =3*h+1;
        } while (h < arr.length);
        do{
            h =h/3;
            for (i = h; i < arr.length; i++){
                value  = arr[i];
                j = i-h;
                while(j>= 0 && value < arr[j]){
                    arr[j+h] = arr[j];
                    j = j-h;
                }
                arr[j+h] = value;
            }
        } while (h > 1);
    }
}