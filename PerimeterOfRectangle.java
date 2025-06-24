import java.util.*;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side A:");
        int a = sc.nextInt();
        System.out.println("Enter length of side B:");
        int b = sc.nextInt();
        System.out.println("Enter length of side C:");
        int c = sc.nextInt();
        System.out.println("Enter length of side D:");
        int d = sc.nextInt();

        System.out.println("Perimeter of Rectangle is: "+(a+b+c+d));
    }
}
