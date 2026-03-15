package Arrays;
import java.util.*;
public class ArrayRotation {
    public static void leftrotatebyone(int arr[]){
        int temp = arr[0];
        for (int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void leftrotate(int arr[], int d){
        int temp[] = new int[d];
        for (int i=0; i<d ; i++){
            temp[i]= arr[i];
        }
        for (int i=d; i<arr.length;i++){
            arr[i-d] = arr[i];
        }
        for (int i=0; i<d; i++){
            arr[arr.length-d+i]= temp[i];
        }
    }
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5};
        int d=7;
        d=d%arr.length;
        leftrotate(arr,d );
        System.out.println(Arrays.toString(arr));
    }
}

