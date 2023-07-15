import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class timerApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // LocalTime actualTime = LocalTime.now();
        // System.out.print(actualTime);
        timer time = new timer();
        while (true) {
            System.out.println("1 - Timer\n2 - StopWatch ");
            int pick = scan.nextInt();
            if (pick == 1) {
                System.out.println("Enter time in the format HH:MM:SS");
                scan.nextLine();
                String amountTime = scan.nextLine();
                time.countTime(amountTime);

            } else if (pick == 2) {
                time.stopWatch();

            } else {
                System.out.println("Incorrect choice");
            }

        }

    }
}