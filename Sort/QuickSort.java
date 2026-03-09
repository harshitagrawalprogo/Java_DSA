package Sort;
import java.util.*;
public class QuickSort {
    public static int Partition(int arr[], int low,int high){
        int i=low;
        int j=high;
        while(i<j){
            while (arr[low]>=arr[i] && i<high) i++;
            while (arr[low]<=arr[j] && j>low) j--;
            if (i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[low];
        arr[low]= arr[j];
        arr[j]= temp;
        return j;
    }

    public static void Quick_Sort(int arr[],int low , int high ){
        if(low < high){
            int j= Partition(arr,low,high);
            Quick_Sort(arr, low, j-1);
            Quick_Sort(arr,j+1,high);
        }
    }

    public static void main(String[] args){
        int arr[]= {3,4,2,1,5};
        int n = arr.length;
        Quick_Sort(arr,0,n-1);
        System.out.print(Arrays.toString(arr));
    }
}
