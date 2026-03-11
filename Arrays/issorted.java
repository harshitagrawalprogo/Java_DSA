package Arrays;

public class issorted {
    int arr[]= {1,2,3,5,6};
    boolean isSorted= true;
    for (int i=1; i<arr.length; i++) {
        isSorted= isSorted && arr[i]>=arr[i-1];
    }
    System.out.println("Is the array sorted? " + isSorted);
}
