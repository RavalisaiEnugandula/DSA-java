import java.util.Scanner;
public class weekdays{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=in.nextInt();

        switch (num) {
            case 1,2,3,4,5 -> System.out.println("week day");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("Enter valid number");
        }
    }
}