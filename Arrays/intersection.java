package Arrays;
import java.util.*;
public class intersection {
    public static void main(String[] args){
        int [] arr1 = {1,3,5,7,9};
        int [] arr2 = {3,7};

        int i=0, j=0, k=0;
        int[] result= new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                result[k++]= arr1[i];
                i++;
                j++;
            }
            else if (arr1[i]>arr2[j]){
                j++;
            }
            else if (arr1[i]<arr2[j]){
                i++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(result,0,k)));
    }
}
