import java.util.Scanner;
public class greeting{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name for greeting card: ");
        String name=in.next();
        System.out.println(" Hello, " + name +"! Wishing you a day filled with joy, positivity, and endless possibilities.Keep smiling and keep shining — the world is brighter with you in it! ");
    }
}