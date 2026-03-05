package MathsBasic;
import java.util.Scanner;


public class check_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int rev =0;

        while(n>=1){
            rev= rev*10 + n%10;
            n/=10;
        }
        if(rev==a){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }}

