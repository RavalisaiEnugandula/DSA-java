import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=in.nextInt();
        System.out.print("Factorial of the given number is:"+fact(num));
    }
    static int fact(int num){
        int ans=1;
        int count=1;
        while(count<=num){
            ans=ans*count;
            count++;
        }
        return ans;
    }
}