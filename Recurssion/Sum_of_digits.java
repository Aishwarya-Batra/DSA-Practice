public class Sum_of_digits {
    public static void main(String[] args) {
        int num = 2456;
        System.out.println(sum(num));
    }

    static int sum(int num){

        // base condition
        if(num==0)
            return 0;

        return num%10 + sum(num/10);

    }
    
}
