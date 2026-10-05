public class Prod_arr_except_itself {
    public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4};
    //     int n = arr.length;
    //     int prod=1;
    //     for(int i=0;i<arr.length;i++){  // logic doesn't work if the element contains 0
    //         prod*=arr[i];
    //     }
    //     for(int i=0;i<n;i++){
    //         System.out.println(prod/arr[i] + " ");
    // }

    int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        int[] result = new int[n];

        int prefix = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
}
