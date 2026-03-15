package Arrays;
public class findmissingnum {
    public static void main(String[] args) {
        //problem with large sum
        // int[] arr= {1,2,5,4,6};
        // long sum1 =0,sum2 = 0;
        // for (int i=0; i<arr.length; i++){
        //     sum1 += arr[i];
        //     sum2+=i+1;
        // }
        // sum2+= arr.length+1;
        // System.out.println(sum2-sum1);

        int[] arr= {1,2,5,4,6};
        int xor1 = 0,xor2=0;
        for (int i:arr){
            xor1 = xor1^i;
        }
        for (int i=1; i<=arr.length;i++){
            xor2= xor2^i;
        }
        System.err.println(xor1^xor2);
        }}


