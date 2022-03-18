import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);
        System.out.println("Enter the number of times coin flip");
        int flip = f.nextInt();
        int tail = 0;
        int head = 0;

        for (int i = 1; i <= flip; i++) {
            double randomNumber = Math.random();

            if (randomNumber < 0.5) {
                tail++;
            } else
                head++;
        }
        System.out.println("number of times head comes " + head);
        System.out.println("number of times tail comes " + tail);
        System.out.println();

        int headValue = head * 100 / flip;
        System.out.println("percentage of heads comes: " + headValue + "%");

        int tailValue = tail * 100 / flip;
        System.out.println("percentage of tail comes : " + tailValue + "%");
    }
}
