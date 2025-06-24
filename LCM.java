
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find lcm:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM of numbers is: "+leastCommonMultiplier(a, b));

    }

    public static int leastCommonMultiplier(int num1 , int num2){
        for(int i =2;i<=(num1*num2);i++){
            if(i%num1==0 && i%num2==0){
                return i;
            }
        }
        return 0;
    }

}
