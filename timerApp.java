import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class timerApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // LocalTime actualTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime actualTime = LocalTime.now();
        // System.out.print(formatter.format(actualTime)+"\r");
        
        System.out.println("Enter time in the format HH:MM:SS");
        String amountTime = scan.nextLine();
        timer time = new timer(amountTime);
        time.countTime();
        
    }
}