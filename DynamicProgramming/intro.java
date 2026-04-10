package DynamicProgramming;

// DP is an approach to solve the 2^n kind of problems via polynomial cimplexity via memorization and tabulation approach.
// Memorization also called as recursive DP or top Down DP
class intro{
    static int[] dp;
    static int fibo(int n, int[] dp){
        if (n<=1) return n ;
        if (dp[n]!=0) return dp[n];
        return dp[n] = fibo(n-1,dp)+fibo(n-2,dp);
    }
    public static void main(String[] args){
        int n = 6;
        dp= new int[n+1];
        int res= fibo(n,dp);
        System.out.println(res);
    }
}