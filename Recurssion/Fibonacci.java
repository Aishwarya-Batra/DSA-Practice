import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number:");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    
    }
    static int fibo(int n){
        //base conditon
        if(n<2)
            return n;

        return fibo(n-1)+fibo(n-2);

    }
    
}
// without recurssion:
// ni=0,n2=1,n3
// print(n1)
// print(n2)
// for(int i=2;i<count;i++){
//     n3=n1+n2;
//     print(n3)
//     n1=n2;
//     n2=n3
// }
