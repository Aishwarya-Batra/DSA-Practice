public class Replace_with_max_or_minus1 {
    public static void main(String[] args){
    int[] arr = {4,1,3,5,2,1};
    int max=0;
    int[] newarr = new int[arr.length];
    for(int l=0;l<arr.length;l++){
        for(int r=l+1;r<arr.length;r++){
            if(arr[l]<arr[r]){
                max=arr[r];
                break;
            }
            else{
                max=-1;
            }
        }
        newarr[l]=max;
    }
    for(int i:newarr){
        System.out.print(i + " ");
    }
    
}}
