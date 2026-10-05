public class longest_subarr_optimal {
    public static void main(String[] args){
        int l=0;
        int sum=0,maxLen=0;
        int k=14;
        int[] arr = {2,5,1,10,10};
        
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];

            // while(sum>k){     // time comp is o(2n)
            //     sum-=arr[l];
            //     l++;
            // }
            // maxLen = Math.max(maxLen,r-l+1);

            if(sum>k){     // time comp is o(n)-> badically here we know the best len of subarray satisfying the condition is 3 so we will not check for <3
                sum-=arr[l];
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        System.out.println("the max length of sybarray who's sum is <k: " + maxLen);
    }
    
    
}
