//package array_basics;

public class even_sum {
    public static void main(String[] args){
    int[] arr = {2,5,8,3,10,7};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            sum+=arr[i];
        }

    }
    System.out.println(sum);
    
}}
