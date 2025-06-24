import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto you want to make sum of odd numbers:");
        int num = sc.nextInt();
        int sum =0;
        for(int i =1;i<=num;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
