package Sort;
import java.util.*;
public class insertion {
    public static void main(String[] args) {
        int arr[]= {100,60,80,70,75};

        int n =arr.length;
        for (int i=1; i<n; i++){
            for (int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
        System.err.println(Arrays.toString(arr));
    }
}
