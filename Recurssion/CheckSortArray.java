public class CheckSortArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,8,9};
        System.out.println(SortedOrNot(arr,0));
    }

    static boolean SortedOrNot(int[] arr,int index){
        //base cond
        if(index == arr.length-1)
            return true;

        return(arr[index]<arr[index+1] && SortedOrNot(arr, index+1));

    }
    
}
