import java.util.Scanner;
public class calc{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        // int ans=0;
        while(true){
            System.out.print("Enter operator: ");
            char op=in.next().trim().charAt(0);
        //     if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.print("Enter two numbers: ");
                int num1=in.nextInt();
                int num2=in.nextInt();
        //         if(op=='+'){
        //             ans=num1+num2;
        //         }
        //         if(op=='-'){
        //             ans=num1-num2;
        //         }
        //         if(op=='*'){
        //             ans=num1*num2;
        //         }
        //         if(op=='/'){
        //             if(num2>0){
        //                 ans=num1/num2;
        //             }
        //         }
        //         if(op=='%'){
        //             ans=num1%num2;
        //         }
        //         System.out.println(ans);
        //     }
        //     else if(op=='x'||op=='X'){
        //         break;
        //     }
        //     else{
        //     System.out.println("Invalid input");    
        //     }

        switch (op) {
            case '+' -> System.out.println(num1+num2);
            case '-' -> System.out.println(num1-num2);
            case '*' -> System.out.println(num1*num2);
            case '/' -> System.out.println(num1/num2);
            case '%' -> System.out.println(num1%num2);
            default -> System.out.println("Enter a valid operator");

        }
        if(op=='x'||op=='X'){
                break;
         }
        }
        
    }
}