package AdvancedRecursion;

import java.util.ArrayList;

public class countaddingtosumsequence {
    public static int subs(int i , int sum , int n , int k , int[] arr , ArrayList<Integer> res , ArrayList<ArrayList<Integer>> resu){
        if (i>=n){
            if (sum ==k ) return 1 ;
            return 0;
        }
        // add
        res.add(arr[i]);
        int left = subs(i+1,sum+arr[i], n , k , arr , res , resu);
        
        // remove 
        res.remove(res.size()-1);
        int right = subs(i+1,sum , n, k , arr, res , resu );

        return left+right;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int n = arr.length;
        ArrayList<ArrayList<Integer>> resu = new ArrayList<>();
        int count = subs(0, 0 ,n , k , arr , new ArrayList<>(), resu );

        System.out.println(count);

    }
}
