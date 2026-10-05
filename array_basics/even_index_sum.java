
public class even_index_sum {
    public static void main(String[] args){
    int[] arr = {5, 2, 8, 4, 10, 3};
    int sum=0,i=0;
    while(i<arr.length){
        sum+=arr[i];
        i+=2;

    }
    System.out.println(sum);
    
}

    
}
