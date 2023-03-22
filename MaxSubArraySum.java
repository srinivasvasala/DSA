package Arrays;

public class MaxSubArraySum {
    public static void subArraySum(int arr[],int n){
        int curSum=0;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            curSum+=arr[i];
            if(curSum<0){
                curSum=0;
            }
            if(curSum>largest){
               largest=curSum;
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        int arr[]={7,-5,2,6,-19,10,12,-4};
        subArraySum(arr, 8);
    }
}
