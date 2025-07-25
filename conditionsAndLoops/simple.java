import java.util.Scanner;
public class simple{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter principle: ");
        int p=in.nextInt();
        System.out.println("Enter rate: ");
        int r=in.nextInt();
        System.out.println("Enter time: ");
        int t=in.nextInt();
        float si=(p*t*r)/100;
        System.out.println("Simple Interest is: "+si);
    }
}