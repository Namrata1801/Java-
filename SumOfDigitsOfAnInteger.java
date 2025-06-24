import java.util.Scanner;

public class SumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits in given number is: " +sumOfDigits(num));

    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum +=digit;
            num =num/10;
        }
        return sum;
    }
}
