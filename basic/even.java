import java.util.Scanner;
public class even{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=in.nextInt();
        if(num%2==0){
            System.out.println("Number "+num+" is an even number ");
        }
        else{
            System.out.println("Number "+num+" is a odd number ");
        }
    }
}