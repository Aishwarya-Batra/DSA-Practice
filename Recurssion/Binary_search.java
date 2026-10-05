public class Binary_search {
    public static void main(String[] args){
    int[] arr = {1,10,4,6,2,22,34,11};
    int start = 0;
    int end = (arr.length)-1;
    int target = 22;
    System.out.println(Bsearch(arr,target,start,end));
        
    }

    static int Bsearch(int[] arr, int target, int start, int end){

        // base condition
        if(start>end){
            System.out.println("Element not found");
            return -1;
        }
        //int mid = start + (end-start)/2;
        int mid= (end+start)/2;
        if(arr[mid]==target)
            return mid;

        else if(arr[mid]>target){     //left

            return Bsearch(arr,target,start,mid-1);
        }
        else{  //right
            return Bsearch(arr,target,mid+1,end);
        }

    }
    
       
}

// without recursion;;;;;;;;
// int[] arr = {1,2,3,4,5,6,7,8,9,10};
//         int n=6;
//         int mid,left,right;
//         int start=0;
//         int end=(arr.length)-1;

//          if (n==mid){
//             return n;
//         }
//         else if(n<mid){
//             end=mid;
//         }
//         else{
//             start=mid;
//         }