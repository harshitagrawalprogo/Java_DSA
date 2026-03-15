package Arrays;
import java.util.*;
public class Unionoftwo {
    
    public static void main(String[] args){
        // Brute is to make a set 
        int[] arr1= {1,3,5,7};
        int[] arr2= {2,4,6,8};

        HashSet <Integer> set = new HashSet<>();
        for (int ele : arr1){
            set.add(ele);
        }
        for (int ele : arr2){
            set.add(ele);
        }
        for (int ele : set){
            System.err.println(ele);
        }
    }
    
}
