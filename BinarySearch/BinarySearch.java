package BinarySearch ;

class BinarySearch{
    public static int Binary(int[] arr, int n , int k, int low , int high){
        while (low <= high){
            int mid = low + (high - low )/2 ;
            if (arr[mid]== k){
                return mid;
            }
            else if (arr[mid]>k){
                high = mid -1;
            }else {
                low = mid +1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        int idx = Binary(arr,arr.length,4, 0 , arr.length-1);
        System.out.println(idx);
    }
}