package MathsBasic;
import java.util.Scanner;


class print_digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n>=1){
            System.out.println(n%10);
            n/=10;
        }

        sc.close();
    }
}