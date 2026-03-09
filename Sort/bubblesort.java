package Sort;
import java.util.*;
public class bubblesort {
    public static void main(String[] args){
        int arr[]= {3,4,2,1,5};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            Boolean isswapped= false;
            for (int j=0; j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    isswapped = true;
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
            if (isswapped == false){
                break;
            }

        }
        System.err.println(Arrays.toString(arr));
    }
}
