import java.util.Scanner;
public class caseCheck{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter letter: ");
        char ch=in.next().trim().charAt(0);

        if(ch>='a'&&ch<='z'){
            System.out.println("Lowercase letter");
        }else{
            System.out.println("Uppercase Letter");
        }
    }
}
