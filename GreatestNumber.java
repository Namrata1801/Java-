
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number to find greates from them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a +" is Greater number ");
        }
        else if(b>=c){
            System.out.println(b+ " is Greates number");
        }
        else{
            System.out.println(c+ " is Greatest number");
        }
    }
}
