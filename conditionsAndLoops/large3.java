import java.util.Scanner;
public class large3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        // if(a>b){
        //     if(a>c){
        //         System.out.println("The largest number is: "+a);
        //     }else{
        //         System.out.println("The largest number is: "+c);
        //     }
        // }
        // else{
        //     if(b>c){
        //         System.out.println("The largest number is: "+b);
        //     }
        //     else{
        //         System.out.println("The largest number is: "+c);
        //     }
        // }
        int max=a;
        if(b>max){
           max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("The largest number is: "+max);
    }
}