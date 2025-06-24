
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of numbers is: " +gcd(a, b));
    }

    public static int gcd(int num1 , int num2){
        int least = leastNumber(num1, num2);
        for(int i = least;i>0;i--){
            if(num1%i ==0 && num2 %i==0){
                return i;
            }
        }
        return 0;
    }

    public static int leastNumber(int num1 , int num2){
        if(num1>num2){
            return num2;
        }
        else
        return num1;
    }
}
