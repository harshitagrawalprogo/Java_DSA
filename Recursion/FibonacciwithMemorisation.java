package Recursion;
import java.util.*;
public class FibonacciwithMemorisation {
    static int[] dp;
    public static int fibo(int n){
        if (n<=1) return n;
        if (dp[n]!=-1) return dp[n];
        return dp[n]= fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        int n = 10;
        dp= new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n));
    }
}
