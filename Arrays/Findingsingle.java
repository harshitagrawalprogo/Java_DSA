package Arrays;

class findingsingle{
    public static void main(String[] args){
        int arr[]= {1,6,4,5,6,1,5};
        

        // Map<Integer,Integer> map = new HashMap<>();

        // for (int ele:arr){
        //     map.put(ele,map.getOrDefault(ele,0)+1);
        // }

        // for (int ele: map.keySet()){
        //     if (map.get(ele)==1){
        //         System.err.println(ele);
        //         break;
        //     }
        // }

        int xor = 0;
        for (int ele:arr){
            xor = xor^ele;
        }
        System.err.println(xor);
    }
}