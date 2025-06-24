
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome:");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
    }

    public static boolean isPalindrome(int num){
        int rev = reverse(num);
        if(num==rev){
            return true;
        }
        return false;
    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit = num%10;
            newNum=newNum*10+digit;
            num = num/10;
        }
        return newNum;
    }
}
