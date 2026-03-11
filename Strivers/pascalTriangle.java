package Strivers;

public class pascalTriangle {
    public static void pascalelement(int r, int c){
        int ans =1;
        for (int i=0; i<c ; i++){
            ans = ans*(r-i);
            ans = ans/(i+1);
        }
        System.out.println("The element at row " + r + " and column " + c + " is: " + ans);
    }

    public static void pascalrow(int r){
        int ans=1;
        System.err.print(ans);
            System.err.print(" ");

        for (int i=0; i<r; i++){
            ans = ans*(r-i);
            ans= ans/(i+1);
            System.out.print(ans);
            System.err.print(" ");
        }
    }

    public static void printpascal(int n){
        for (int i=0; i<n ; i++){
            pascalrow(i);
            System.err.println();
        }
    }

    public static void main(String[] args){
        int r = 5;
        printpascal(5);
    }
}
