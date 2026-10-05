public class ReturnReverse {
    public static void main(String[] args) {
        int num = 12345;
        rev(num);
    }

    static int rev(int num){
        if (num==0){
            return -1;
        }
        System.out.print(num%10);
        return rev(num/10);


    }
    
}
