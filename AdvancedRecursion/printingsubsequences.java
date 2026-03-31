package AdvancedRecursion;

// Subsequences need not to be contininious but in order

import java.util.ArrayList;

// subarrays are need to be contigious and in order

// an arrays has 2^n subsequences 


public class printingsubsequences {
    public static void subsequence(int i, ArrayList<Integer> res, int arr[], int n){
        if (i>=n){
            System.out.println(res);
            return;
        }
        res.add(arr[i]);
        subsequence(i+1, res, arr, n);
        res.remove(res.size()-1);
        subsequence(i+1, res, arr, n);


    }


    public static void main(String[] args){
        int arr[]= {1,2,3,4};
        ArrayList <Integer> res = new ArrayList<>();
        subsequence(0, res, arr, arr.length);

    }
}


