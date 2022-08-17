
/**
 * Testing sorting algorithm. All the code comes from www.geeksforgeeks.org.
 * 
 * @author Rajat Mishra 
 * @version 14.08.22
 */
public class Testing_sort
{
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        BubbleSort.bubbleSort_Int(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}