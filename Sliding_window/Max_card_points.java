public class Max_card_points {
    // choose max K elements from the array of cards such that the sum is maximum 
    // but can only be picked either from back or front contigous..(1st and last 3 0r 1st 4 or 1st 2 last2...)
    
    public static void main(String[] args){
    int[] arr = {6,2,3,4,7,2,1,7,1};
    int lsum=0,rsum=0,k=4;
    int l=k-1, r=arr.length-1, maxsum=0;

    for(int i=0;i<k;i++){
        maxsum+=arr[i];
    }
    lsum=maxsum;
    for(int i=0;i<k;i++){
        lsum-=arr[l];
        rsum+=arr[r];
        maxsum=Math.max(lsum+rsum,maxsum);
        l--;
        r--;
    }

    System.out.println("the maxsum: " + maxsum);
}















    // int l=k-1, r=arr.length-1;

    // for(int i=0;i<k;i++){
    //     sum+=arr[i];
    // }
  
    // while(l>=0){
    //     sum-=arr[l];
    //     l--;
    //     sum+=arr[r];
    //     r--;
    //     maxsum = Math.max(sum,maxsum); 
    // }

    // System.out.println("Maxsum of the k cards: " + maxsum);
}
