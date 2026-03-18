package Arrays;
public class longestsubarray {
    public static void main(String[] args){
        int[] arr= {1,4,1,3,1,1,2,1,4};
        int n= arr.length;
        int req=5;
        int min=0,max=0;
        // bruteforce 
        int diff=0;
        for (int i=0; i<n ; i++){
            for (int j=i; j<n ; j++){
                int sum=0;
                for (int k=i; k<=j; k++){
                    sum+=arr[k];

                }
                if (sum == req && j-i>diff){
                    diff=j-i;
                    min =i;
                    max =j;
                }
            }
        }
        System.err.println("The sub array is "+ min + max );
    }
}
