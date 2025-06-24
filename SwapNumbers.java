
import java.util.*;
public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int c =a;
        a=b;
        b=c;

        System.out.println("First number after swapping: "+a);
        System.out.println("Second number after swapping: "+b);
    }
}
