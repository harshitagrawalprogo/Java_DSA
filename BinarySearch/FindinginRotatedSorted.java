package BinarySearch;

public class FindinginRotatedSorted {
    public static int search(int[] arr , int n , int k){
        int low =0 ;
        int high = n-1;
        while (low <=high){
            int mid = low + (high-low)/2;
            if (arr[mid]==k) return mid ;
            else if (arr[mid]<=arr[high]){
                if (arr[mid]<=k && arr[high]<=k){
                    low = mid +1;
                }else {
                    high= mid -1;
                }
            }
            else if(arr[mid]>=arr[low]){
                if (arr[low]<=k && arr[mid]>=k){
                    high = mid -1;
                }else {
                    low = mid +1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr= {10,11,12,4,4,5,6,7,8,9};
        int idx = search(arr, arr.length, 4);
        if (idx==-1){System.out.println("Not present");}
        else{System.out.println("present");}
    }
}
