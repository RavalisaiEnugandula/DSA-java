import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name=in.nextLine();
        int i=0 ;
        int j=name.length()-1;
        while(i<j){
            if(name.charAt(i)!=name.charAt(j)){
                System.out.println("The given string is not palindrome");
                break;
            }
            i++;
            j--;
        }
        System.out.println("The string is a palindrome");
    }
}