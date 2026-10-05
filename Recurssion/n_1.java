public class n_1 {

    static void print(int n){
        System.out.println(n);

        if(n == 1)
            return;
        else
            print(n - 1);
    }

    public static void main(String[] args){
        int n = 20;
        print(n);
    }
}