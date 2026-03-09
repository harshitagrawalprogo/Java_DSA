package Sort;
import java.util.*;
public class mergesort {

    public static void mergeSort(int arr[] , int low , int high){
        if (low<high){
            int mid = low+ (high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int arr[] ,int low , int mid , int high){
        int u=low; int v=mid+1;
        int k=0;
        int n= high-low+1;
        int temp[] = new int[n];

        while(u<=mid&& v<=high){
            if (arr[u]<arr[v]){
                temp[k]=arr[u];
                u++;
                k++;
            }else{
                temp[k]= arr[v];
                v++; k++;
            }
        }
        while (u<=mid){
            temp[k]= arr[u];
            u++; k++;
        }
        while (v<=high){
            temp[k]= arr[v];
            v++; k++;
        }

        for(int i=0; i<n; i++){
            arr[low+i]= temp[i];
        }
    }
    public static void main(String[] args){
        int arr[]= {3,4,2,1,5};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        System.out.print(Arrays.toString(arr));
    }
}
