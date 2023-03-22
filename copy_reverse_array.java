package Arrays;
import java.util.Arrays;
public class copy_reverse_array {
    public static int[] copyAndReverse(int[] arr, int n) {
        // Write your code here.
       int j=0;
        int copy_arr[]=new int[n];
        for(int i=arr.length-1;i>=0;i--){
            copy_arr[j]=arr[i];
            j++;
        }
        return copy_arr;
    }
    public static void main (String [] arga){
        int arr[]={7,5,4,3,2};
        System.out.println(Arrays.toString(copyAndReverse(arr,5)));
    }
}

