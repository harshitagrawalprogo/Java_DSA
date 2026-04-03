package BinarySearch;

public class firstandlastoccurence {
    public static int first(int arr[], int k , int low, int high ){
        int ans = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid]==k){
                ans =mid;
                high= mid-1;
            }
            else if (arr[mid]>k){
                high= mid -1;
            }else {
                low = mid +1;
            }
        }
        return ans ;
    }

    public static int last(int arr[], int k , int low, int high ){
        int ans = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid]==k){
                ans =mid;
                low= mid+1;
            }
            else if (arr[mid]>k){
                high= mid -1;
            }else {
                low = mid +1;
            }
        }
        return ans ;
    }
    public static void main(String[] args){
        int[] arr = {1,3,4,5,5,5,5,6,7,8};
        int target= 5;
        int idx2= last(arr, target, 0, arr.length-1);
        int idx1 = first(arr, target, 0, arr.length-1);
        System.out.println("First occurence :"+idx1);
        System.out.println("Second occurence :"+idx2);
        System.out.println("Number of occurence :"+ (idx2-idx1+1));
        
    } 
    
}
