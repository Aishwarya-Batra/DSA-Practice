public class subarr_sum_equals_k {
    public static void main(String[] args){
        int[] arr = {9,4,20,3,10,5};
        int target=33;
        int sum=0,l=0,ss=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            while(sum>target){
                sum-=arr[l];
                l++;
            }
            if(sum==target){
                ss+=1;
            }
        
        }
        System.out.println(ss);

    }
    
}
