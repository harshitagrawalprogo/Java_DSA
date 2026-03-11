package Arrays;

public class LargestNumber {
    public static void main(String[] args){
        int[] arr= {3,1,4,7,5,2};
        int largest = 0;
        for (int i=1; i< arr.length; i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        System.out.println("Largest number is: "+arr[largest]);
    }
}
