
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount :");
        long p = sc.nextLong();
        System.out.println("Enter years : ");
        int t = sc.nextInt();
        System.out.println("Enter rate: ");
        int r = sc.nextInt();

        long interest = p*t*r/100;
        System.out.println("Simple interest: " +interest);
    }
}
