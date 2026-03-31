package AdvancedRecursion;

import java.util.ArrayList;

public class sequencesaddingtok {
    public static void subs(int i, int n , int sum, int k , int[] arr, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> resu ){
        if (i >= n ){
            if (sum == k) resu.add(new ArrayList<>(res));
            return;
        }
        // add element 
        res.add(arr[i]);
        subs(i+1,n,sum +arr[i],k, arr, res , resu);
        res.remove(res.size()-1);
        subs(i+1,n,sum,k, arr, res , resu);

    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int n = arr.length;
        ArrayList<ArrayList<Integer>> resu= new ArrayList<>();
        subs(0, n, 0 , k , arr , new ArrayList<>(), resu);

        System.out.println(resu);

        
        }
}
