import java.util.Scanner;
public class usd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rupees: ");
        int rup=in.nextInt();
        int rate=83;
        float usd=(float)rup/rate;
        System.out.println("The equivalent usd is: "+usd);

    }
}