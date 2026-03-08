package Sort;
import java.util.*;


public class SelectionSort {
    public static void main(String[] args){
        int arr[]= {3,2,4,1,5};
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int min_index = i;
            for (int j=i+1; j<n ; j++){
                if (arr[min_index]> arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
