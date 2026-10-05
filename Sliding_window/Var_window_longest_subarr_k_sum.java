public class Var_window_longest_subarr_k_sum {
    public static void main(String[] args){
        int[] arr = {2,1,3,2,1};
        int k=5,l=0,sum=0;
        int maxlen = 0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            
            if(sum>k){
                sum-=arr[l];
                l++;
            }

            maxlen=Math.max(maxlen,r-l+1);

        }
        System.out.println("the longest subarray: " + maxlen + " and the sum is:" + sum);
        
    }
}