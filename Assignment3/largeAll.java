import java.util.Scanner;
public class largeAll{
    public static void main(String[] args){
        // Scanner in=new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num=in.nextInt();
        System.out.print("Largest of the given numbers is:" +large());

    }
    static int large(){
        int max=0;
        while(true){
            Scanner in=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num=in.nextInt();
            if(num==0){
                break;
            }
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}