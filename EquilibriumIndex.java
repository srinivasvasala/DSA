package Arrays;

public class EquilibriumIndex {
    public static void  equilibriumIndex(int arr[],int n){
        int ps[]=new int[n];
        ps[0]=arr[0];
        int leftSum=0;int rightSum=0;int count=0;
        for(int i=0;i<=n-1;i++){
            if(i==0){
                leftSum=0;
            }
            else{
                leftSum=ps[i-1];
                rightSum=ps[n-1]-ps[i];
            }
            if(leftSum==rightSum){
              count+=1;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int arr []={-7,1,5,2,-4,3,4};
        equilibriumIndex(arr,7);
    }
}
