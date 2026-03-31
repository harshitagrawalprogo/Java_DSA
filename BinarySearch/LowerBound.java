package BinarySearch;
// Application is Search Insertion 

public class LowerBound {

    public static int LowerBou(int[] arr, int low, int high, int k){
        int ans = high+1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid]>=k){
                ans = mid;
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return ans;
        }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,5,6};
        int idx = LowerBou(arr, 0, arr.length-1,5);
        System.err.println(idx);
    }}
