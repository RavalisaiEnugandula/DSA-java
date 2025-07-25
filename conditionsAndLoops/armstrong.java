import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("The armstrong numbers between "+a+" and "+b+" are: ");
        while(a<=b){
            int temp=a;
            int res=0;
            int flag=a;
            int digit=0;
            while(flag!=0){
                flag=flag/10;
                digit+=1;
            }
            while(temp!=0){
                int rem=temp%10;
                res=res+(int)Math.pow(rem,digit);
                temp=temp/10;
            }
            if(res==a){
                System.out.print(a+" ");
            }
            a++;
        }
    }
}