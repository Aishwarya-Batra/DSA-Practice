public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,4,9};
        int target = 60;
        System.out.println("element found at:" + (ls(arr,target,0)));
    }

    static int ls(int[] arr, int target,int index){
        if(index>arr.length-1){
            return -1;
        }

        if(arr[index]==target)
            return index;
        else
            return(ls(arr,target,index+1));
    }
    
}
