package Arrays;
import java.util.*;
public class Movingzeroestoend {
    // Brute force approach 
    // create two arrays one for zero and one for non zero elements and then merge them



    //optimal two pointer approach 
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args){
        int arr[]= {0,5,0,3,0,0,7};
        int i=0; int j=1;
        while (j< arr.length && i<arr.length ){
            while (i<arr.length && arr[i]!=0 ){
                i++;
            }
            while (j<arr.length && arr[j]==0 ){
                j++;
            }
            swap(arr,i,j);
            i++; j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
