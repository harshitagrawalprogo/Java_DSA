package Recursion;

public class printusingrecursion {
    public static void oneton(int n){
        if(n==0){
            return;
        }
        oneton(n-1);
        System.out.println(n);
    }

    public static void ntozero(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        ntozero(n-1);
    }

    public static void main(String[] args){
        ntozero(5);
    }
}
