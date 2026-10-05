//package binarysearch;

public class Cieling_no {
    
    public static void main(String[] args){
    int[] arr={1,2,4,7,13,16,20};
    int target = 14;
    int start=0;
    int end= (arr.length)-1;
    System.out.println(Cieling_number(arr,target,start,end));  
    } 


    static int Cieling_number(int[] arr,int target,int start,int end){
        int mid = (start+end)/2;
        int temp = target;
        if(start>end){
            return start;
        }

        if(arr[mid]==temp){
            return mid;
        }
        else if(temp>arr[mid]){
            return Cieling_number(arr,temp,mid+1,end);
        }
        else {
            return Cieling_number(arr,temp,start,mid-1);
        }
    }

}
 

