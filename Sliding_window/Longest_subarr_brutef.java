//package Sliding_window;

public class Longest_subarr_brutef {

    public static void main(String[] args){
        int[] arr = {2,5,1,7,10};
        int k=15,n=arr.length;
        int sum=0,maxsum=0;

        for(int i=0;i<=n-1;i++){
            for(int j=i;j<=n-1;j++){
                sum=sum+arr[j];
                if(sum<k){
                    maxsum=Math.max(sum,maxsum);
                }
                else if(sum>k){
                    break;
                }

            }
            sum=0;
        }
        System.out.println("The maxsum of the longest subarray which is <k: " + maxsum);
    }
    
}
