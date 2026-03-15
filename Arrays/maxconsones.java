package Arrays;
public class maxconsones {
    public static void main(String[] args) {
        int arr[]= {1,0,1,1,0,0,1,1,1,0,1};
        int curr=0;
        int max =0;
        for (int i=0; i< arr.length;i++){
            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                if (curr>max){
                    max = curr;
                }
            }
        }
        System.err.println(max);
        
    }
}

