//package array_basics;
import java.util.*;
public class second_largest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        int max = Integer.MIN_VALUE;
        int temp = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                temp=max;
                max=arr[i];

            }
            else if(arr[i]>temp && arr[i]!=max){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
    
}
