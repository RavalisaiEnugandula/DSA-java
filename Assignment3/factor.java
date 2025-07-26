import java.util.Scanner;
public class factor{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=in.nextInt();
        fact(num);
    }

    static void fact(int num) {
        int count=1;
        System.out.println("Factors of given number:");
        while(count<=num){
            if(num%count==0){
                System.out.print(count+" ");
            }
        count++;
        }
    }
    
}