package BinarySearch;

public class ceilandfloor {
    public static int ceilx(int[] arr , int low , int high, int k){
        int ans = -1 ;
        while (low <= high){
            int mid = low + (high -  low)/2;
            if (arr[mid]>=k){
                ans = mid ;
                high= mid -1 ;

            }else {
                low = mid +1 ;
            }
        }
        return ans;
    }

    public static int floorx(int[] arr , int low , int high, int k){
        int ans = -1 ;
        while (low <= high){
            int mid = low + (high -  low)/2;
            if (arr[mid]<=k){
                ans = mid ;
                low= mid +1  ;

            }else {
                high = mid -1 ;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr= {1,3,4,5,6,7,9};
        int target = 8;
        // int ceil= ceilx(arr , 0 , arr.length-1, target);
        int floor= floorx(arr , 0 , arr.length-1, target);
        // System.out.println(ceil);
        System.out.print(floor);
    }
}
