package MathsBasic;
import java.util.Scanner;
class count_number_of_digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        while (n>=1){
            count ++;
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
