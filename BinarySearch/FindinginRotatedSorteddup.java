package BinarySearch;

public class FindinginRotatedSorteddup {
    public static int search(int[] arr , int n , int k){
        int low =0 ;
        int high = n-1;
        while (low <=high){
            int mid = low+ (high-low)/2;
            
            if (arr[mid]==k) return mid;
            
            if (arr[low]==arr[mid] && arr[mid]== arr[high]){
                low += 1 ;
                high -= 1 ;
            }else{
                //left soted 
                if (arr[low]<=arr[mid]){
                    if (arr[low]<=k && arr[mid]>=k){
                        high= mid-1;
                    }else {
                        low = mid +1;
                    }
                }
                // right sorted 
                else if(arr[mid]<=arr[high]){
                    if (arr[mid]<=k && arr[high]>=k){
                        low= mid+1;
                    }else {
                        high = mid -1;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr= {5,5,5,5,4,5,5,5,5,5,5};
        int idx = search(arr, arr.length, 5);
        if (idx==-1){System.out.println("Not present");}
        else{System.out.println("present : "+idx);}
    }
}
