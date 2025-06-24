
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number uo to which you want to print fibonacci series");
        int num = sc.nextInt();
        fibonacci(num);

    }
    public static void fibonacci(int num){
        if(num<0) return;
        System.out.print("0");
        if(num==0) return;
        System.out.print(" 1");

        int first =0; int second =1;
        while(first+second<=num){
            int third = first+second;
            System.out.print(" "+third);
            first = second;
            second = third;
        }

    }
}
