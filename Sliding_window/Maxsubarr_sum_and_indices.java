import java.util.*;
public class Maxsubarr_sum_and_indices {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum=arr[0];
        int currsum=arr[0]; 
        int start=0,end=0,tempstart=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>currsum+arr[i]){
                currsum=arr[i];
                tempstart=i;
            }
            else{
                currsum+=arr[i];
            }
            if(currsum>maxsum){
                maxsum=currsum;
                start=tempstart;
                end=i;
            }
        }
        System.out.println("the maxsum: " + maxsum);
        System.out.println("start index: " + start);
        System.out.println("end index: " + end);    
    }
    
}
