
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check armstrong or not:");
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }

    }

    public static int noOfDigits(int num){
        int digit=0;
        while(num>0){
            digit++;
            num=num/10;
        }
        return digit;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i=0;
        while (i<num2) {
            result*=num1;
            i++;
        }
        //System.out.println("power of "+num1+" is"+result);
        return result;
    }

    public static boolean isArmstrong(int num){
        int digits= noOfDigits(num);
        int numCopy = num;
        // System.out.println(noOfDigits(num));
        int finalNumber =0;
        while(num>0){
            int lastDigit = num%10;
            num =num/10;
            finalNumber+=pow(lastDigit,digits);
        }
        // System.out.println("Final number is: "+finalNumber);
        return finalNumber==numCopy;
    }

}
