import java.util.Scanner;
// public class fib{
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=in.nextInt();
//         int a=0,b=1;
//         System.out.print("Fibonacci series are: ");
//         for(int i=0;i<n;i++){
//             System.out.print(a+ ",");
//             int next=a+b;
//             a=b;
//             b=next;
//         }
//     }
// }
public class fib{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();
        System.out.print("Fibonacci series are: ");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int res=fibonacci(n-1)+fibonacci(n-2);
        return res;
    }
}