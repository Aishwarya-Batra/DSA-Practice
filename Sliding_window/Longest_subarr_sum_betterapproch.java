//package Sliding_window;

public class Longest_subarr_sum_betterapproch {
    public static void main(String[] args){
        int k=14;
        int sum=0,l=0,r=0,maxsum=0;
        int[] arr = {2,5,1,7,10};
        int n=arr.length;
        while(r<n){
            sum+=arr[r];
            if(sum<=k){
                r++;
                maxsum=Math.max(sum,maxsum);

            }
            else if(sum>k){
                sum-=arr[l];
                l++;
                while(sum>k){
                    maxsum=Math.max(sum,maxsum);
                }
            }

        }
        System.out.println("The better approch than brute force: " + maxsum);
    }
    
}
