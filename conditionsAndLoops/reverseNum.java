import java.util.Scanner;
public class reverseNum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=in.nextInt();

        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        System.out.print("The reverse number is: "+ans);
    }
}