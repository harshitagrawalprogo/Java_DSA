package Sort;
import java.util.*;
public class mergesort {

    public static void mergeSort(int arr[] , int low , int high){
        while (low<high){
            int mid = low+ (high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int arr[] int low , int mid , int high){
        int u=low; int v=high;
        int k=0;
        int n= high-low
        return;
    }
    public static void main(String[] args){
        int arr[]= {3,4,2,1,5};
        int n = arr.length;
        mergeSort(arr,0,n-1);

    }
}
