
import java.util.Scanner;

public class ReverseDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int num = sc.nextInt();
        System.out.println("Reverse number is: "+reverseNumber(num));
    }

    public static int reverseNumber(int num){
        int newNum =0;
        while(num>0){
        int digit = num%10;
        newNum= newNum*10+digit;
        num = num/10;
        }
        return newNum;
    }
}
