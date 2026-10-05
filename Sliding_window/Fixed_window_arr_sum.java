//package Sliding_window;

import javax.sound.sampled.SourceDataLine;

public class Fixed_window_arr_sum {

    public static void main(String[] args){
    //k=4;
    int[] arr = {2, 4, 1, 7, 3, 6};
    int sum=0,maxsum=0;
    int k=3;
    int l=0,r=k-1;
    for(int i=0;i<k;i++){
        sum=sum+arr[i];
        maxsum=sum;
    }
    while(r<(arr.length-1)){
        sum=sum-arr[l];
        l++;
        r++;
        sum=sum+arr[r];
        maxsum=Math.max(sum,maxsum);
    }

    System.out.println("the max sum of contigous array elemets: " + maxsum);

    
    
}}
