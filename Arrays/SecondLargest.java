package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]= {1,4,5,4,2};
        int largest, secondLargest;
        if (arr[0]>arr[1]){
            largest = arr[0];
            secondLargest=arr[1];
        }else {
            largest = arr[1];
            secondLargest= arr[0];
        }

        for (int i=2; i<arr.length; i++){
            if (arr[i]==largest) continue;
            if (arr[i]>largest) {
                secondLargest= largest;
                largest = arr[i];
                continue;
            }
            if(arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number is: "+secondLargest);

    }}

