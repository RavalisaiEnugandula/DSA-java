import java.util.Scanner;
public class operators{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        float div=num1/num2;
        System.out.println("SUM = "+add);
        System.out.println("SUB = "+sub);
        System.out.println("MUL = "+mul);
        System.out.println("DIV = "+div);
    }
}