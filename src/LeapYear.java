import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner y = new Scanner(System.in);
        System.out.println("enter the year in YYYY format");
        int year = y.nextInt();

        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println("this is the leap year");
        } else
            System.out.println("that is not a leap year");
    }
}
