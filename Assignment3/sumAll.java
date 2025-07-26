import java.util.Scanner;
public class sumAll{
    public static void main(String[] args){
        // Scanner in=new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num=in.nextInt();
        System.out.print("sum of all the given numbers is:" +sum());

    }
    static int sum(){
        int sum=0;
        while(true){
            Scanner in=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num=in.nextInt();
            if(num==0){
                break;
            }
            sum=sum+num;
        }
        return sum;
    }
}