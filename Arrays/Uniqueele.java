package Arrays;
import java.util.*;
public class Uniqueele {
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args){
        // int arr[]= {1,2,3,4,5,5,6};
        // HashSet <Integer> set = new HashSet<>();
        // for (int i=0; i<arr.length;i++){
        //     set.add(arr[i]);
        // }
        // System.out.println(set);

        // optimal approach
        int arr[]= {1,2,2,3,3,5,5,6};
        int i=0; int j=1;
        while (i<arr.length && j<arr.length){
            if (arr[i]==arr[j]){
                j++;
            }else {
                i++;
                swap(arr,i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, i+1)));
    }
}
