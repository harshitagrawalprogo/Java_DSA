package Arrays;
public class Unionoftwo {
    
    public static void main(String[] args){
        // Brute is to make a set 
        // int[] arr1= {1,3,5,7};
        // int[] arr2= {2,4,6,8};

        // HashSet <Integer> set = new HashSet<>();
        // for (int ele : arr1){
        //     set.add(ele);
        // }
        // for (int ele : arr2){
        //     set.add(ele);
        // }
        // for (int ele : set){
        //     System.err.println(ele);
        // }

        // Optimal Approach is two pointer approach 
        int[] arr1= {1,3,5,7};
        int[] arr2= {2,3,4,6,8};
        int result[] = new int[arr1.length+arr2.length];
        int i=0, j=0, k=0,ans=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]>arr2[j] && arr2[j]!=ans){
                ans = arr2[j];
                result[k++]=arr2[j++];
            }else if (arr1[i]<arr2[j] && arr1[i]!=ans) {
                ans = arr1[i];
                result[k++]= arr1[i++];
            }else if(arr1[i]==arr2[j] && arr1[i]!=ans){
                result[k++]= arr1[i++];
                ans = arr2[j++];
                
            }
        }
        while (i<arr1.length){
            result[k++]= arr1[i++];
        }
        while (j<arr2.length){
            result[k++]= arr2[j++];
        }
        for (int ele : result){
            System.err.println(ele);
        }
    }
    
}
