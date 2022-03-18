import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in dividend");
        int m = sc.nextInt();
        System.out.println("Enter the number in divisor");
        int n = sc.nextInt();

        int quotient = m / n;
        int remainder = m % n;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}